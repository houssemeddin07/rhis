package rhis.software.employees.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rhis.software.employees.entities.Ecran;
@Repository
public interface ecranRepository extends CrudRepository<Ecran,Long> {
}
