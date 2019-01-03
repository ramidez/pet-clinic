package com.springframework.petclinic.services.map;

import com.springframework.petclinic.model.Visit;
import com.springframework.petclinic.services.VisitService;

import java.util.Set;

public class VisitMapService extends AbstractService<Visit, Long> implements VisitService {


    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit save(Visit visit) {
        if(visit.getPet() == null || visit.getPet().getOwner() ==null || visit.getPet().getId() == null){
            throw new RuntimeException("Invalid Visits");
        }
        return super.save(visit);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}
