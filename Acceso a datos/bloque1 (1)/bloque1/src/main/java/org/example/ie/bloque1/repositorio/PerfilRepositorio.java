package org.example.ie.bloque1.repositorio;

import org.example.ie.bloque1.modelo.Perfil;
import org.example.ie.bloque1.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PerfilRepositorio extends JpaRepository<Perfil,Long> {
}
