package rhis.software.employees.entities;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Affectation {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

    @ManyToOne
    User user;
    @ManyToOne
    Role role_a;
}
