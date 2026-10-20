
void main() async{
  print('Inicio del programa');



  try{
    final value = await httpGet("Esta URL");
    print(value);
  }catch(err){
    print("Tenemos un error : $err");
  }finally{
    
  }
  
  //  httpGet("http://compramostucoche.es")
  //   .then(((value) {
  //     print(value);
  //   }))
  //   .catchError((err) => print(err),)
  //   ;


    
  print(' fin del programa');
}


Future<String> httpGet(String url) async{
  await Future.delayed(Duration(seconds: 3));
  return "Respuesta de tipo http";
}


    //await Future.delayed(Duration(seconds: 2),(){
    //  return "Respuesta de tipo http";
    //});