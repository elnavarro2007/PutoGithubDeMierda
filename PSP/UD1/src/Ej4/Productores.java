package Ej4;

import java.util.Random;

public class Productores implements Runnable{

    private ColaTrabajos colaTrabajos;
    Random r = new Random();
    int random = r.nextInt(1,200);

    public Productores(ColaTrabajos colaTrabajos) {
        this.colaTrabajos = colaTrabajos;
    }

    public Productores() {
    }

    // se generara un numero random y se añadira a la cola
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            try {
                // se añáde el numero y se espera 0,5 segundos
                colaTrabajos.anadirNum(random);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " ha terminado: ");
    }
}
