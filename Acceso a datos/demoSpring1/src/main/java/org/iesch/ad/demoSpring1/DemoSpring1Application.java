package org.iesch.ad.demoSpring1;

import lombok.RequiredArgsConstructor;
import org.iesch.ad.demoSpring1.modelo.Coche;
import org.iesch.ad.demoSpring1.modelo.Persona;
import org.iesch.ad.demoSpring1.repositorio.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
// @RequiredArgsConstructor
@PropertySource(value = "classpath:mi.properties", encoding = "UTF-8")
public class DemoSpring1Application implements CommandLineRunner {

    @Value("${mi.app.nombre}")
    String nombre;

    @Value("${mi.app.version")
    String version;

    @Value("${firma}")
    String firma;

    // @Autowired
    // List<Persona> listaPersona;

    @Autowired
    PersonaRepositorio personaRepositorio;


    //public DemoSpring1Application(PersonaRepositorio personaRepositorio) {
    //	this.personaRepositorio = personaRepositorio;
    //}

    public static void main(String[] args) {
        SpringApplication.run(DemoSpring1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //System.out.println("Hola mundo");
        //// System.out.println(listaPersona);
//
        //Persona p =  Persona.builder().nombre("Garrido").apellidos("Basilio Abascal").email("garridoelguarro@gmail.es").dni("1234567A").build();
        //Persona p2 = Persona.builder().nombre("Tumadre").apellidos("Sanchez Perez").email("mimama@gmail.es").dni("1231237A").build();
        //Persona p3 = Persona.builder().nombre("Puidgemont").apellidos("Basilio mami").email("sexo@gmail.es").dni("1294567A").build();
        //Persona p4 = Persona.builder().nombre("Abalos").apellidos("Basilio Mangonero").email("guarroelgarrido@gmail.es").dni("1234567B").build();
        ////System.out.println(p);
//
        //List<Persona> personas = new ArrayList<>(Arrays.asList(p,p2,p3,p4));
//
        //personaRepositorio.saveAll(personas);

        //CRUD
      //  Persona p = new Persona();
      //  p.setNombre("Juanjo");
      //  p.setApellidos("Tiene pene");
//
      //  personaRepositorio.save(p);
//
      //  List<Persona> personaList = personaRepositorio.findAll();
      //  System.out.println(personaList);
//
//
      //  // para encontrar solo un sujeto
      //  Optional<Persona> pEncontradaPorId = personaRepositorio.findById(3L);
//
//
      //  if (pEncontradaPorId.isPresent()) {
      //      System.out.println(pEncontradaPorId.get());
      //  } else {
      //      System.out.println("Persona no encontrada");
      //  }
//
      //  // UPDATE
//
      //  if (pEncontradaPorId.isPresent()) {
      //      pEncontradaPorId.get().setNombre("Penetroni");
      //      pEncontradaPorId.get().setApellidos("Sexo Oral");
      //      pEncontradaPorId.get().setDni("19039109A");
      //      pEncontradaPorId.get().setEmail("toni@sexo.anal");
//
//
      //      // guardar
      //      personaRepositorio.save(pEncontradaPorId.get());
//
      //  } else {
      //      System.out.println("Persona no encontrada");
      //  }
//
//
      //  personaList = personaRepositorio.findAll();
//
      //  System.out.println(personaList);
//
//
      //  // delete
      //  Optional<Persona> personaBorrar = personaRepositorio.findById(3L);
//
      //  // usar este principalmente si se va a borrar algo
      //  if (personaBorrar.isPresent()) {
      //      personaRepositorio.delete(personaBorrar.get());
      //  }
//
//
      //  Persona personatmp = new Persona();
      //  personatmp.setId(3l);
      //  personaRepositorio.delete(personatmp);




		List<Persona> listaPersona = personaRepositorio.buscaTodasPersonas();
		System.out.println(listaPersona);

		System.out.println("pseudo-lenguaje");
		// Buscamos personas que empiecen por j
		List<Persona> personaListJ = personaRepositorio.findByNombreStartingWith('J');
		System.out.println(personaListJ);

		// Buscar personas cuyo dni de la letra sea A y el apellido contenga una R
		List<Persona> personas = personaRepositorio.findByDniContainingAndApellidosContaining('a',"r");
		System.out.println(personas);

		//DNI con un 9 o email null
		List<Persona> persona2Condiciones = personaRepositorio.findByDniContainingOrEmailNull("9");
		System.out.println(persona2Condiciones);

		System.out.println("one to one");

		// Nueva persona
		Persona persona = new Persona();
		persona.setNombre("Pepelu");
		persona.setApellidos("corre maratones");
		persona.setDni("1234567A");
		persona.setEmail("pepe@aa.es");


		Coche coche = new Coche();
		coche.setIdPlacaBase("Tesla");
		coche.setModelo("3");
		coche.setMatricula("1254 AAA");

		persona.setCoche(coche);
		// guardaremos en BBDD
		personaRepositorio.save(persona);

		// Cargar una BBDD la persona con id 11
		Optional <Persona> persona1 = personaRepositorio.findById(11L);

		if(persona1.isPresent()){

		}


    }

}
