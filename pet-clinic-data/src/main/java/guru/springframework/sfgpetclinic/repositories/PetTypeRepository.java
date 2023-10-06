package guru.springframework.sfgpetclinic.repositories;

/*
    Created by tylermckenney on 10/6/23.
*/

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
