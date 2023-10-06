package guru.springframework.sfgpetclinic.repositories;

/*
    Created by tylermckenney on 10/6/23.
*/

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
