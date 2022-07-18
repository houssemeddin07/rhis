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
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String type;
    @OneToMany(mappedBy = "role_a",cascade = CascadeType.ALL)
    List<Affectation> affectations_r;

    @OneToMany(mappedBy = "role_d",cascade = CascadeType.ALL)
    List<Droit> droits_r;
}
