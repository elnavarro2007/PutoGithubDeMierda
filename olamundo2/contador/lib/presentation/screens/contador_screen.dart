import 'package:flutter/material.dart';

class ContadorScreen extends StatefulWidget {
  new({super.key});

  @override
  State<ContadorScreen> createState() => _ContadorScreenState();
}

class _ContadorScreenState extends State<ContadorScreen> {
  int contador = 0;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Contador App"), centerTitle: true),
      body: Center(
        child: Column(
          mainAxisAlignment: .center,

          children: [
            Text(
              contador.toString(),
              style: TextStyle(fontSize: 30, fontWeight: .w100),
            ),
            Text('Clicks', style: TextStyle(fontSize: 20)),
          ],
        ),
      ),
      floatingActionButton: Column(
        children: [
          FloatingActionButton(
            child: Icon(Icons.add),
            onPressed: () {
              contador++;
            },
          ),
        ],
      ),
    );
  }
}
