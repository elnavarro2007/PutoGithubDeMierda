package org.iesch.ad.demoSpring1.modelo;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autonumerico
    Long id;


    String nombre;
    String apellidos;
    @Column( length = 9)
    String dni;
    String email;

    LocalDateTime createAt;

    // @Basic
    // @Column

    @OneToOne ( cascade = CascadeType.ALL)
    Coche coche;




    @PrePersist
    public void preGuardar(){
        this.createAt = LocalDateTime.now();

    }

    @PostPersist
    public void posGuardado(){
        System.out.println("se guarda la persona con id : "+this.id);
    }

}
