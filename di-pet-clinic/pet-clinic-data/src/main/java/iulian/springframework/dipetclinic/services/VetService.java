package iulian.springframework.dipetclinic.services;

import iulian.springframework.dipetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save (Vet vet);

    Set<Vet> findAll();
}
