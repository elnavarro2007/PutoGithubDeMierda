package UD1.Map;

import java.util.HashMap;
import java.util.Map;

public class Ej1 {
    static void main() {
        Map<String,String> paisCapital  = new HashMap<>();
        paisCapital.put("España", "Madrid");
        paisCapital.put("Francia", "París");
        paisCapital.put("Italia", "Roma");
        paisCapital.put("Portugal", "Lisboa");
        paisCapital.put("Alemania", "Berlín");

        for (Map.Entry<String,String> m : paisCapital.entrySet()){
            System.out.println("Pais : "+m.getKey() + " capital : "+m.getValue());
        }
    }
}
