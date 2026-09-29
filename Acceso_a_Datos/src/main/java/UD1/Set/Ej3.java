package UD1.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ej3 {
    static void main() {
        List<String> coches = new ArrayList<>();
        coches.add("hola");
        coches.add("hola");
        coches.add("hola");
        coches.add("que");
        coches.add("que");
        coches.add("que");
        coches.add("tal");
        coches.add("tal");
        coches.add("estas?");
        coches.add("estas?");
        coches.add("yo bien");
        coches.add("yo bien");

        System.out.println(setUnico(coches));

    }

    static Set<String> setUnico (List<String> lista){

        return new HashSet<>(lista);
    }
}
