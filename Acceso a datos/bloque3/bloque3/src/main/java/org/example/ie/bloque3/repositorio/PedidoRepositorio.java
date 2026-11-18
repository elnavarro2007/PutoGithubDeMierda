package org.example.ie.bloque3.repositorio;

import org.example.ie.bloque3.modelo.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PedidoRepositorio extends JpaRepository<Pedido, Long> {
}
