package me.calebeoliveira.springbootpetclinic.repositories;

import me.calebeoliveira.springbootpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepository extends CrudRepository<Vet, Long> {
}
