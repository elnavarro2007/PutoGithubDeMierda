package UD1.List;

import java.util.ArrayList;
import java.util.List;

public class Ej1 {
    static void main(String[] args) {
        List<Coche> listaCoche = new ArrayList<>();
        listaCoche.add(new Coche("tipo","fiat","pakoloko"));
        listaCoche.add(new Coche("fuuka","car","Diego"));
        listaCoche.add(new Coche("rojomovil","stalin","sagüi"));

        for (Coche c : listaCoche){
            System.out.println(c.toString());
        }

    }
}

class Coche {
    String modelo ;
    String marca;
    String dueño;

    public Coche(String modelo, String marca, String dueño) {
        this.modelo = modelo;
        this.marca = marca;
        this.dueño = dueño;
    }

    public Coche() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", dueño='" + dueño + '\'' +
                '}';
    }
}
