package rhis.software.employees.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String password;
    private String first_name;
    private String last_name;
    private String email;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    List<Affectation> affectations_u;
}
