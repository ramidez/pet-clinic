package com.springframewrok.petclinic.services.map;

import com.springframework.petclinic.model.Pet;
import com.springframewrok.petclinic.services.CrudService;
import com.springframewrok.petclinic.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
