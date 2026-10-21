package UD1.Set;

import java.util.*;

public class Ej2 {
    static void main() {
        List<Integer> listaEnteros = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            listaEnteros.add(random.nextInt(1,10));

        }
        System.out.println(listaEnteros);

        System.out.println(setUnico(listaEnteros));
    }

    static Set<Integer> setUnico (List<Integer> lista){

        return new HashSet<>(lista);
    }
}
