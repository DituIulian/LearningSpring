package iulian.springframework.dipetclinic.services;

import iulian.springframework.dipetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName ( String lastName);

    Owner findById(Long id);

    Owner save (Owner owner);

    Set<Owner> findAll();
}
