package org.iesch.ad.demoCarga.modelo;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity

public class Cliente {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nombre;

    @OneToMany
    @JoinColumn(name = "cliente_id")
    private List<Pedido> pedidos;



}
