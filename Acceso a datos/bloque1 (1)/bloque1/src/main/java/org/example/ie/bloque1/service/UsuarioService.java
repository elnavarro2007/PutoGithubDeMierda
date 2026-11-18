package org.example.ie.bloque1.service;


import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.ie.bloque1.modelo.Perfil;
import org.example.ie.bloque1.modelo.Usuario;
import org.example.ie.bloque1.repositorio.PerfilRepositorio;
import org.example.ie.bloque1.repositorio.UsuarioRepositorio;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepositorio usuarioRepositorio;
    private final PerfilRepositorio perfilRepositorio;



    @Transactional
    public void cambiaPerfil (Usuario usuario){

        Perfil perfil1 = usuario.getPerfil();
        perfil1.setFotoPerfil("img/image.png");
        perfil1.setFechaNacimiento(LocalDate.of(2001,1,1));
        perfil1.setDescripcion("desfsfddfsdf");

        usuarioRepositorio.save(usuario);






    }
}
