package guru.springframework.sfgpetclinic.repositories;

/*
    Created by tylermckenney on 10/6/23.
*/

import guru.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
