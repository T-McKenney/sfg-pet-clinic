package guru.springframework.sfgpetclinic.services;

/*
    Created by tylermckenney on 9/30/23.
*/

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll();

    T findByID(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
