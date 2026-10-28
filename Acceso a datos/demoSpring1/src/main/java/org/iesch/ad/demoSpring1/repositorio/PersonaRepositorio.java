package org.iesch.ad.demoSpring1.repositorio;

import org.iesch.ad.demoSpring1.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PersonaRepositorio extends JpaRepository<Persona,Long> {
    @Query("select p from Persona p")
    List<Persona> buscaTodasPersonas ();


    List<Persona> findByNombreStartingWith(char c);


    List<Persona> findByDniContainingAndApellidosContaining (char x, String s);


    // DNI con un 9 o email nulo
    List<Persona> findByDniContainingOrEmailNull (String s);
}
