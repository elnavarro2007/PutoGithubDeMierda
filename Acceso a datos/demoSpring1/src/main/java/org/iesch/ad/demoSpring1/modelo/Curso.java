package org.iesch.ad.demoSpring1.modelo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.hibernate.engine.internal.Cascade;

import java.util.HashSet;
import java.util.Set;


@Entity
@Data
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nombre;


    @ToString.Exclude // Evitar stackOverflow
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE},mappedBy = "cursos") // nombre de la variable de la otra entidad

    // (cascade = CacasdeType.ALL) es peligroso ya que si borramos un curso,
    // se puede dar el caso que borres al padre (estudiante)
    // y tambien al resto de curso del estudiante
    // se recomienda : CascadeType.PERSIST y MERGE
    // con persist al guardar se guardaria el padre
    // COn merge al actualizar se actualiza
    private Set<Student> students = new HashSet<>();


}
