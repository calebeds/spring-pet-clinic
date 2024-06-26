package me.calebeoliveira.springbootpetclinic.repositories;

import me.calebeoliveira.springbootpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
