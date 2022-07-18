package rhis.software.employees.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rhis.software.employees.entities.Affectation;

@Repository
public interface affectationRepository extends CrudRepository<Affectation,Long> {
}
