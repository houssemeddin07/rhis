package rhis.software.employees.entities;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Droit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long cum_droit;

    @ManyToOne
    Role role_d;
    @ManyToOne
    Ecran ecran_d;
}
