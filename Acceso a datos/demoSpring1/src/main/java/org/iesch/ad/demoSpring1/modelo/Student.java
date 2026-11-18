package org.iesch.ad.demoSpring1.modelo;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.engine.internal.Cascade;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nombre;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "student_curso",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "curso_id")

    )


    private Set<Curso> cursos = new HashSet<>();



}
