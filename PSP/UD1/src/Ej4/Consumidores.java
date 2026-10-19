package Ej4;

import java.util.Random;

public class Consumidores implements Runnable{

    private ColaTrabajos colaTrabajos;
    private int num;

    public Consumidores(ColaTrabajos colaTrabajos, int num) {
        this.colaTrabajos = colaTrabajos;
        this.num = num;
    }

    public Consumidores() {
    }

    @Override
    public void run() {
        // el consumidor extrae un numero y se muestra
        for (int i = 0; i < num; i++) {

            try {
                System.out.println(Thread.currentThread().getName() + " ha sacado el numero : "+num);
                // debera esperar 0,8 segundos
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(Thread.currentThread().getName() + " ha terminado: ");
    }
}
