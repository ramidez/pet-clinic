package com.springframework.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vet")
@Controller
public class VetController {

    @RequestMapping({"/", "", "/index", "/index.html"})
    public String listVets()
    {
        return "vet/index";
    }
}
