package org.example.ie.bloque1;

import org.example.ie.bloque1.modelo.Perfil;
import org.example.ie.bloque1.modelo.Usuario;
import org.example.ie.bloque1.repositorio.PerfilRepositorio;
import org.example.ie.bloque1.repositorio.UsuarioRepositorio;
import org.example.ie.bloque1.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Optional;

@SpringBootApplication
public class Bloque1Application implements CommandLineRunner {

	@Autowired
	UsuarioRepositorio usuarioRepositorio;

	@Autowired
	PerfilRepositorio perfilRepositorio;

	@Autowired
	UsuarioService usuarioService;



	public static void main(String[] args) {
		SpringApplication.run(Bloque1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("-".repeat(30));

		//Perfil perfil = new Perfil();
		//perfil.setFotoPerfil("/img/juan.jpg");
		//perfil.setDescripcion("Estudiante de urologia");
		//perfil.setFechaNacimiento(LocalDate.of(2009,7,20));


		//Usuario usuario = new Usuario();
		//usuario.setNombre("juan");
		//usuario.setPassword("4321");
		//usuario.setPerfil(perfil);


		//perfil.setUsuario(usuario);

		//usuarioRepositorio.save(usuario);

		//Optional<Usuario> user = usuarioRepositorio.findById(1L);

		//if (user.isPresent()){
		//	Usuario usuario = user.get();
		//	System.out.println(usuario);


		//	usuarioService.cambiaPerfil(usuario);
		//}


		// borrar un usuario

		//Optional<Usuario> user= usuarioRepositorio.findById(2L);
		//
		//if (user.isPresent()){
		//	Usuario usuario = user.get();
		//
		//	usuarioRepositorio.delete(usuario);
		//
		//}








	}
}
