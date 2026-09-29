package UD1.Set;

import java.util.HashSet;
import java.util.Set;

public class Ej1 {
    static void main() {
        Set<String> coches = new HashSet<>();
        coches.add("hola");
        coches.add("que");
        coches.add("tal");
        coches.add("estas?");
        coches.add("yo bien");

        for (String c : coches){
            System.out.println(c);
        }

        // no mantiene el orden, se añaden las cosas al azar




    }
}
