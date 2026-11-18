package com.iesch.ad.bloque1_Ej4.repositorio;

import com.iesch.ad.bloque1_Ej4.modelo.Habitacion;
import com.iesch.ad.bloque1_Ej4.modelo.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ReservaRepositorio extends JpaRepository<Reserva,Long> {

   List<Reserva> findbyhabitacion_id(Long id);
}
