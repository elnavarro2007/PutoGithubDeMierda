package UD1.List;

import java.util.ArrayList;
import java.util.List;

public class Ej3 {
    static void main(String[] args) {
        List<String> listaString = new ArrayList<>();
        listaString.add("hola");
        listaString.add("holas");
        listaString.add("holass");
        listaString.add("holasss");
        listaString.add("me cago en la puta");

        System.out.println(asCaracteres(listaString));




    }

    static int asCaracteres(List<String> list){
        int cadena = 0;

        for (String s : list){
            if (s.length() > cadena){
                cadena = s.length();
            }
        }


        return cadena;
    }
}
