package com.iesch.ad.bloque1_Ej4;

import com.iesch.ad.bloque1_Ej4.modelo.Habitacion;
import com.iesch.ad.bloque1_Ej4.modelo.Reserva;
import com.iesch.ad.bloque1_Ej4.repositorio.HabitacionRepositorio;
import com.iesch.ad.bloque1_Ej4.repositorio.ReservaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Bloque1Ej4Application implements CommandLineRunner {

	@Autowired
	private HabitacionRepositorio habitacionRepositorio;

	@Autowired
	private ReservaRepositorio reservaRepositorio;


	public static void main(String[] args) {
		SpringApplication.run(Bloque1Ej4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	/*
		reservaRepositorio.deleteAll();
		habitacionRepositorio.deleteAll();

		Habitacion h101 = new Habitacion();
		h101.setNumeroDeHabitacion(111);
		h101.setTipo("Doble");
		//------
		Habitacion h102 = new Habitacion();
		h102.setNumeroDeHabitacion(112);
		h102.setTipo("Suite");
		//------ Guardar habitaciones

		habitacionRepositorio.saveAll(Arrays.asList(h101,h102));

		//  Misma reserva para la misma habitacion.
		Reserva r1 = new Reserva();
		r1.setHabitacion(h101);
		r1.setFechaEntrada(LocalDate.now());
		r1.setFechaSalida(LocalDate.of(2026,11,17));

		Reserva r2 = new Reserva();
		r2.setHabitacion(h102);
		r2.setFechaEntrada(LocalDate.now());
		r2.setFechaSalida(LocalDate.of(2026,12,18));


		reservaRepositorio.saveAll(Arrays.asList(r1,r2));
		*/


		// reservas de la habitacion 101
		//Optional <Habitacion> habitacionTmp = habitacionRepositorio.findByNumeroDeHabitacion(101);

		//if (habitacionTmp.isPresent()){
		//	Habitacion habitacion = habitacionTmp.get();
		//	Long idHabitacion = habitacion.getId();
		//	List<Reserva> reservaList = reservaRepositorio.findbyHabitacion_id(idHabitacion);
		//	System.out.println(reservaList);
		//}



	}
}
