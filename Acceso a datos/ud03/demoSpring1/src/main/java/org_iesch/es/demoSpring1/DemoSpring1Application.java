package org_iesch.es.demoSpring1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org_iesch.es.demoSpring1.modelo.Persona;

import java.util.List;

@SpringBootApplication
@PropertySource(value = "classpath.mi.properties",encoding = "utf-8")
public class DemoSpring1Application implements CommandLineRunner {

	@Value("${mi.app.nombre}")
	String nombre;

	@Value("${mi.app.version}")
	String version;

	@Value("${firma}")
	String firma;

	List<Persona> personaList;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpring1Application.class, args);


	}



	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola mundo");
		System.out.println(personaList);



	}
}
