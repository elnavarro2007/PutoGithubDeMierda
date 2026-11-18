package org.example.ie.bloque1.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity // crear tablas
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    private String fotoPerfil;
    String descripcion;
    LocalDate fechaNacimiento;


    @OneToOne
    @JoinColumn (name = "usuario_id", nullable = false, unique = true)
    private Usuario usuario; // No puede existir un perfil sin un usuario.


    @Override
    public String toString() {
        return "Perfil{" +
                "id=" + id +
                ", fotoPerfil='" + fotoPerfil + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", usuario-id= " + usuario.getId() + " usuario-nombre= "+ usuario.getNombre() + " usuario-password= " + usuario.getPassword()+
                '}';
    }
}
