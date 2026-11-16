import 'package:flutter/material.dart';

class HomeScreen extends StatelessWidget {
  final String email;
  final String password;

  const HomeScreen({
    super.key,
    required this.email,
    required this.password,
  });

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: SafeArea(
        child: Center(
          child: Padding(
            padding: const EdgeInsets.symmetric(horizontal: 30),
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                const Text('Has introducido este email:'),
                const SizedBox(height: 8),
                Text(
                  // aqui ya se pone el texto que le he parseado en la interfaz anterior
                  email,
                  style: const TextStyle(fontSize: 22, fontWeight: FontWeight.bold),
                ),
                const SizedBox(height: 24),
                const Text('Has introducido este password:'),
                const SizedBox(height: 8),
                Text(
                  // aqui igual con la contraseña
                  password,
                  style: const TextStyle(fontSize: 22, fontWeight: FontWeight.bold),
                ),
                const SizedBox(height: 40),
                SizedBox(
                  width: double.infinity,
                  height: 50,
                  child: ElevatedButton(
                    onPressed: () => Navigator.pop(context),
                    child: const Text('Volver'),
                  ),
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}