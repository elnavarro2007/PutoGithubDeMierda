package Ej4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ColaTrabajos {

    private Queue<Integer> list = new ArrayBlockingQueue<>(5);



    // añadir un numero a la cola

    public synchronized void anadirNum(int num) throws InterruptedException {
        // si la cola esta llena, se espera
        while (list.size() == 5) {
            wait();
        }

        list.offer(num);

        // cuando la lista este vacia, esperar hasta que se llene con numeros
        while (list.size() == 0){
            wait();
        }
    }
}
