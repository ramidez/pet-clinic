package com.springframewrok.petclinic.services.map;

import com.springframework.petclinic.model.Owner;
import com.springframewrok.petclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Owner object) {
        super.delete(object);

    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }
}