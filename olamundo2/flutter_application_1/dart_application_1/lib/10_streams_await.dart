void main(){

  emitirNumeros().listen((event) {
    print("valor del stream : $event");
  
  },);
  
}

 Stream<int> emitirNumeros()async*{
  final valoresParaEmirie=[6,7,8,9,10];

  for(int i in valoresParaEmirie){
    await Future.delayed(Duration(seconds : 1));

    yield i;
  }
  
}