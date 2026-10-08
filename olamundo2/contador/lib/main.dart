



import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

void main(List<String> args) {
  print("Hola mundo");
  runApp(Myapp());
}

class Myapp extends StatelessWidget {
  const Myapp({super.key});



  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      theme : ThemeData.dark(),
      home: Scaffold(
        body: Center(child: Text('hola a dam 2'))),
        
    );
  }

}