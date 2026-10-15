package Ej4;

public class Ej3 {

    public static void main(String[] args) {

        Cuentas c1 = new Cuentas(1000);

        Thread t1 = new Thread(c1, "Proceso 1");
        Thread t2 = new Thread(c1, "Proceso 2");
        Thread t3 = new Thread(c1, "Proceso 3");
        Thread t4 = new Thread(c1, "Proceso 4");
        Thread t5 = new Thread(c1, "Proceso 5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n" + c1.toString());
    }
}