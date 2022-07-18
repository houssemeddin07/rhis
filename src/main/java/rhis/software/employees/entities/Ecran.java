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
public class Ecran {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;

    @OneToMany(mappedBy = "ecran_d",cascade = CascadeType.ALL)
    List<Droit> droits_e;

}
