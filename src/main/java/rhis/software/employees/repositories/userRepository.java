package rhis.software.employees.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rhis.software.employees.entities.User;
@Repository
public interface userRepository extends CrudRepository<User,Long> {
}
