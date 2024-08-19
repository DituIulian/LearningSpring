package iulian.springframework.dipetclinic.services;

import iulian.springframework.dipetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save (Pet pet);

    Set<Pet> findAll();
}
