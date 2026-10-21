void main(){

  emitirNumeros().listen((event) {
    print("valor del stream : $event");
  },);
  
}

Stream<int> emitirNumeros(){

  return Stream.periodic(Duration(seconds : 1), (value) {
    return value;
  },).take(7);
}