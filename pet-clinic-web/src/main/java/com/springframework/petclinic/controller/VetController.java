package com.springframework.petclinic.controller;

import com.springframework.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vet")
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/", "", "/index", "/index.html"})
    public String listVets(Model model)
    {
        model.addAttribute("vets", vetService.findAll());
        return "vet/index";
    }
}
