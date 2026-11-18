package com.iesch.ad.bloque1_Ej4.repositorio;

import com.iesch.ad.bloque1_Ej4.modelo.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface HabitacionRepositorio extends JpaRepository<Habitacion,Long> {


    // Metodo para consultar por numero
    Optional <Habitacion> findByNumeroDeHabitacion(int number);

}
