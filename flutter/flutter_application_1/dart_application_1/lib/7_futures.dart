
void main(){
  print('Inicio del programa');
  
   httpGet("http://compramostucoche.es")
    .then(((value) {
      print(value);
    }))
    .catchError((err) => print(err),)
    ;

    print(' fin del programa');
}


Future<String> httpGet(String url){
    return Future.delayed(Duration(seconds: 2),(){
      throw "Error";
    });
}