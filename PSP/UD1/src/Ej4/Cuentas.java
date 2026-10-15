package Ej4;

import java.util.Random;

public class Cuentas implements Runnable{


    private double saldo;


    public Cuentas(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            Random r = new Random();
            if (r.nextBoolean()){
                try {
                    ingresarSaldo(randomDinero());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else {
                try {
                    retirarSaldo(randomDinero());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public synchronized void ingresarSaldo(double monto) throws InterruptedException {
        System.out.println("------operacion : ingreso-----------");
        System.out.println("HIlo actual : "+Thread.currentThread().getName());
        System.out.println("saldo anterior : "+saldo);
        System.out.println("monto : "+monto);
        saldo += monto;
        Thread.sleep(random());
        System.out.println("saldo posterior : "+saldo);

        System.out.println("---------------------------");
    }

    public synchronized void retirarSaldo(double monto) throws InterruptedException {
        System.out.println("-----operacion : retiro---------- ");
        System.out.println("HIlo actual : "+Thread.currentThread().getName());
        System.out.println("saldo anterior : "+saldo);
        System.out.println("retiro : "+monto);

        if (saldo < monto){
            System.out.println("no puede realizarse la accion");
        }else {
            saldo -= monto;
        }

        Thread.sleep(random());
        System.out.println("saldo posterior : "+saldo);

        System.out.println("---------------------------");
    }



    public int random (){
        Random r1 = new Random();
        int tiempo=  r1.nextInt(100,500);
        return tiempo;
    }

    public double randomDinero (){
        Random r1 = new Random();
        int dinero=  r1.nextInt(100,300);
        return dinero;
    }

    @Override
    public String toString() {
        return " saldo final : " + saldo ;
    }
}
