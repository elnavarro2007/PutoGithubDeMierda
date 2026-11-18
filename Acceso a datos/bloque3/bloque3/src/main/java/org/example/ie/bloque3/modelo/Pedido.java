package org.example.ie.bloque3.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private LocalDate fecha;
    private String estado;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "direccion_envio_id", nullable = false,unique = true)
    private DireccionEnvio direccionEnvio;
}
