package org_iesch.es.demoSpring1.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org_iesch.es.demoSpring1.modelo.Persona;

import java.util.ArrayList;
import java.util.List;

@Configuration

public class configuracion {
    @Bean
    public List<Persona> dameLista(){
        List<Persona> listaPersona = new ArrayList<>();

        Persona p1 = Persona.builder().id(1L).dni("sexo").apellido("Gilipollas").build();
        Persona p2 = Persona.builder().id(2L).dni("sexo").apellido("Gilipollass").build();
        Persona p3 = Persona.builder().id(3L).dni("sexo").apellido("Gilipollasss").build();
        Persona p4 = Persona.builder().id(4L).dni("sexo").apellido("Gilipollassss").build();
        Persona p5 = Persona.builder().id(5L).dni("sexo").apellido("Gilipollasssss").build();
        Persona p6 = Persona.builder().id(6L).dni("sexo").apellido("Gilipollassssss").build();


        listaPersona.add(p1);
        listaPersona.add(p2);
        listaPersona.add(p3);
        listaPersona.add(p4);
        listaPersona.add(p5);
        listaPersona.add(p6);

        return  listaPersona;
    }


}
