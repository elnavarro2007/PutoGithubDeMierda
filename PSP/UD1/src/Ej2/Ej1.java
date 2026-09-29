package Ej2;

import java.util.Scanner;

public class Ej1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Que leches quieres ejecutar???");
        String proceso = sc.nextLine().trim();

        try {
            ProcessBuilder p = new ProcessBuilder(proceso);
            Process process = p.start();

            process.waitFor();
            System.out.println("se termino");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
