package rhis.software.employees.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rhis.software.employees.entities.Role;
@Repository
public interface roleRepository extends CrudRepository<Role,Long> {
}
