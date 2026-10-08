package Ej4;

import java.io.IOException;

public class Ej1 {
    static void main(String[] args) {

        Escritor hola = new Escritor("hola");
        Escritor dam = new Escritor("dam");


        Thread t1 = new Thread( hola, "Hilo-Hola");
        Thread t2 = new Thread( dam, "Hilo-Dam");


        t1.start();


        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException("");
        }

        t2.start();

        Thread temp = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    t1.interrupt();

                    t2.interrupt();
                    System.out.println(" Hilo interrumpido");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);

                }
            }
        });

        try {
            // 6. El hilo principal espera a que ambos terminen (o sean interrumpidos)
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        temp.start();

        System.out.println("Programa finalizado");




    }
}
