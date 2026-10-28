package org.iesch.ad.demoSpring1.modelo;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.engine.internal.Cascade;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Coche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String idPlacaBase;
    String modelo ;
    String matricula;


    @OneToOne(cascade = CascadeType.ALL )
    Persona persona;
}
