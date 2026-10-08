package Ej4;

import java.util.List;

public class Escritor implements Runnable{


    String palabra;
    List<String> list;

    public Escritor(String palabra) {
        this.palabra = palabra;
    }

    public Escritor(List<String> list) {
        this.list = list;
    }

    public Escritor() {
    }

    @Override
    public void run() {
        try {
            for (String s : list) {
                System.out.println(Thread.currentThread().getName() + " : "+s);
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
