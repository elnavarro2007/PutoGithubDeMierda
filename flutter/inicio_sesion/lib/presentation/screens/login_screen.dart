import 'package:flutter/material.dart';
import 'package:inicio_sesion/presentation/screens/home_page.dart';
import 'widgets/custom_input_field.dart';

// debe ser un StatefulWidget en vez de stateless
class LoginScreen extends StatefulWidget {
  const LoginScreen({super.key});

  @override
  State<LoginScreen> createState() => _LoginScreenState();
}

class _LoginScreenState extends State<LoginScreen> {
  // Añadir estas variables para pasar los textos a la siguiente interfaz
  final TextEditingController userController = TextEditingController();
  final TextEditingController passwordController = TextEditingController();

  @override
  void dispose() {
    // 2. Liberamos memoria al cerrar esta pantalla
    userController.dispose();
    passwordController.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Inicio de sesion'),
      ),
      body: SingleChildScrollView(
        child: Padding(
          // Tengo que añadir EdgeInsets.symmetric mejor
          padding: const EdgeInsets.symmetric(horizontal: 20, vertical: 10),
          child: Form(
            child: Column(
              children: [
                // Asignar cada campo a cada customField
                CustomInputField(
                  labelText: 'Nombre',
                  hintText: 'Nombre del usuario',
                  controller: userController,
                ),
                const SizedBox(height: 20),
                CustomInputField(
                  labelText: 'Contraseña',
                  hintText: 'Contraseña',
                  controller: passwordController,
                ),
                const SizedBox(height: 20),

                ElevatedButton(
                  onPressed: () {
                    Navigator.push(
                      context,
                      MaterialPageRoute(
                        // Parsear a cada texto cada vartiable
                        builder: (context) => HomeScreen(
                          email: userController.text,
                          password: passwordController.text,
                        ),
                      ),
                    );
                  },
                  child: const Text('Iniciar sesion'),
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}
