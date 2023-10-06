package guru.springframework.sfgpetclinic.repositories;

/*
    Created by tylermckenney on 10/6/23.
*/

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
