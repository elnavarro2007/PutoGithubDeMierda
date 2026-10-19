package Ej4;

public class Ej4 {
    static void main(String[] args) {
        ColaTrabajos colaTrabajos = new ColaTrabajos();

        Consumidores c1 = new Consumidores(colaTrabajos,10);
        Consumidores c2 = new Consumidores(colaTrabajos,10);

        Productores p1 = new Productores(colaTrabajos);
        Productores p2 = new Productores(colaTrabajos);


        Thread productor1 = new Thread(p1,"Productor 1");
        Thread productor2 = new Thread(p2,"Productor 2");

        Thread consumidor1 = new Thread(c1,"Consumidor 1");
        Thread consumidor2 = new Thread(c2,"Consumidor 2");


        productor1.start();
        productor2.start();

        consumidor1.start();
        consumidor2.start();


    }
}
