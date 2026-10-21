void main() {

  // los maps so pares de valores
  final Map <String, dynamic > pokemon = {
    'nombre' : 'Ditto',
    'hp' : 100,
    'isAlive' : true,
    'sprites' : {
      1 : 'ditto/front.jpg',
      2 : 'ditto/back.jpg'
    }
  };
  print(pokemon);
  print('Nombre : ${pokemon['nombre']}');
  print('Sprite : ${pokemon['sprites'][1]}');
}

/* comentario muy xD*/