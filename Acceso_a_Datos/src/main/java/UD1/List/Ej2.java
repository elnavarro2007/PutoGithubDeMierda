package UD1.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ej2 {

    static void main() {
        List<Integer> list1 = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list1.add(random.nextInt(1,100) );
        }

        System.out.println(list1);
        System.out.println(listaPares(list1));
    }

    static List<Integer> listaPares(List<Integer> list){
        List<Integer> listaPares = new ArrayList<>();

        for (int i : list){
            if (i % 2 == 0){
                listaPares.add(i);
            }
        }

        return listaPares;

    }




}
