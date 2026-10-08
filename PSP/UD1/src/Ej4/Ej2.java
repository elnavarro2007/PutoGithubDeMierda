package Ej4;


import java.util.List;

public class Ej2  {
    static void main() {
        List<String> cosas = List.of("Inicio","servicios","multihilo","Sincronizacion","Fin del programa");
        Escritor e1 = new Escritor(cosas);

        Thread t1 = new Thread(e1,"Hilo 1");

        t1.start();

         while (t1.isAlive()){
             System.out.println("Hilo principal esperando");
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }

         if (t1.isAlive()){
             System.out.println("tiempo excedido");
         }




    }
}
