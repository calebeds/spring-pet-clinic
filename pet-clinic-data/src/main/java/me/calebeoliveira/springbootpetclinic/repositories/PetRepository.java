package me.calebeoliveira.springbootpetclinic.repositories;

import me.calebeoliveira.springbootpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends CrudRepository<Pet, Long> {
}
