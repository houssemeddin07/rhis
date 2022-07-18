package rhis.software.employees.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rhis.software.employees.entities.User_;
@Repository
public interface userRepository extends CrudRepository<User_,Long> {
}
