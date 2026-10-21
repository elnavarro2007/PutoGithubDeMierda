package org_iesch.es.demoSpring1.modelo;

import lombok.*;

@Getter
@Setter
@Builder

@ToString
@EqualsAndHashCode

public class Persona {
    Long id;
    String nombre;
    String apellido;
    String dni;
    String email;

}
