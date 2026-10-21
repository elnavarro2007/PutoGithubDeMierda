


void main(){

  Cuadrado c = new Cuadrado(lado : 3);

  c.lado = 85;
  print("area : ${c.Area}");
  
  

}


class Cuadrado{
  double lado;

  Cuadrado({required double lado}):
    assert (lado >= 0, "el lado debe ser mayor igual que 0"),
    assert (lado <= 10, "el lado debe ser menor igual que 10"),
    lado = lado;

    
  

  // Getters

  double get Area{
    return lado * lado;
  }

  // Setters 
  set Lados (double lado){
    if(lado <= 0){
      print("El valor debe ser menor que 0");
    }
    print("El nuevo valor es $lado");
  }


}