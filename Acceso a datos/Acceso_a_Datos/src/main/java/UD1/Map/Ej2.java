package UD1.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ej2 {
    static void main(String[] args) {
        List<String> listaStrigns = new ArrayList<>();

        listaStrigns.add("hola");
        listaStrigns.add("hola");
        listaStrigns.add("hola");
        listaStrigns.add("hola");
        listaStrigns.add("que");
        listaStrigns.add("tal");
        listaStrigns.add("tal");
        listaStrigns.add("estas?");
        listaStrigns.add("yo bien");
        listaStrigns.add("yo bien");
        listaStrigns.add("yo bien");
        listaStrigns.add("yo bien");

        Map<String,Integer> lista = lista(listaStrigns);

        for (Map.Entry<String,Integer> m : lista.entrySet()){
            System.out.println("Veces que se repite "+m.getKey() + " : "+ m.getValue());
        }

        System.out.println(lista(listaStrigns));




    }
    static Map<String,Integer> lista(List<String> l){
        Map<String,Integer> m = new HashMap<>();

        for (String s: l){
            m.put(s,m.getOrDefault(s,0)+1);
        }


        return m;

    }
}
