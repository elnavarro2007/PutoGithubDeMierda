package org.example.ie.bloque3;

import org.example.ie.bloque3.modelo.DireccionEnvio;
import org.example.ie.bloque3.modelo.Pedido;
import org.example.ie.bloque3.repositorio.DireccionEnvioRepositorio;
import org.example.ie.bloque3.repositorio.PedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;


@SpringBootApplication
public class Bloque3Application implements CommandLineRunner {

	@Autowired
	private PedidoRepositorio pedidoRepositorio;
	@Autowired
	private  DireccionEnvioRepositorio direccionEnvioRepositorio;


	public static void main(String[] args) {
		SpringApplication.run(Bloque3Application.class, args);
	}





	@Override
	public void run(String... args) throws Exception {
		DireccionEnvio direccionEnvio = new DireccionEnvio();
		direccionEnvio.setCalle("dsfl, 12");
		direccionEnvio.setCiudad("dsflaa");
		direccionEnvio.setPais("Espania");
		direccionEnvio.setCodigopostal("20120");

		direccionEnvioRepositorio.save(direccionEnvio);


		Pedido pedido = new Pedido();
		pedido.setFecha(LocalDate.now());
		pedido.setDireccionEnvio(direccionEnvio);

		// update de la direccion
		DireccionEnvio d = direccionEnvioRepositorio.findById(1L).get();
		d.setCiudad("Barcelona");
		d.setCodigopostal("12345");
		pedido.setEstado("PENDIENTE");

		direccionEnvioRepositorio.save(d);

		System.out.println("Pedido actualizado : "+pedidoRepositorio.findById(1L).);


	}
}
