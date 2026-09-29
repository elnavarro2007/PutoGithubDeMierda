//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.*;

public class Main {
    static void main(String[] args) {
        COntenedor<String> stringCOntenedor = new COntenedor<>("HOla mundo");
        COntenedor<Integer> integerCOntenedor = new COntenedor<>(110);
        imprimir(stringCOntenedor);
        imprimir(integerCOntenedor);

        List<String> miLista = new ArrayList<>(Arrays.asList("Coche", "casa", "pene", "Epstein", "Bebe"));

        System.out.println(miLista.stream().sorted().toList());

        List<Coche> listaCoche = new ArrayList<>();
        Coche coche1 = new Coche("1234567", "Tumadre", "eldeallado", "200", 200);
        Coche coche2 = new Coche("12324567", "TuPadre", "eldealante", "hitler", 200);
        Coche coche3 = new Coche("1543117", "cigarros", "eldeatras", "rviera", 7);
        Collections.sort(miLista);
        System.out.println(listaCoche);

        listaCoche.addAll(Arrays.asList(coche1, coche2, coche3));


        System.out.println(listaCoche);


    }

    public static void imprimir(COntenedor<?> c) {
        System.out.println(c.getObjeto());
    }

    public static void imprimirConMUltiplicador(COntenedor<? extends Integer> c, int num) {
        System.out.println(c.getObjeto().intValue() * num);
    }

    public static void imprimirConMUltiplicadorDoble(COntenedor<? extends Integer> c) {
        System.out.println(c.getObjeto().doubleValue() * 2);
    }


}

class Coche implements Comparable {
    String matricula;
    String vin;
    String dueño;
    String owner;
    int potencia;

    public Coche() {
    }

    public Coche(String matricula, String vin, String dueño, String owner, int potencia) {
        this.matricula = matricula;
        this.vin = vin;
        this.dueño = dueño;
        this.owner = owner;
        this.potencia = potencia;
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", vin='" + vin + '\'' +
                ", dueño='" + dueño + '\'' +
                ", owner='" + owner + '\'' +
                ", potencia=" + potencia +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        Coche cochetmp = (Coche) o;
        return this.matricula.compareTo(cochetmp.getMatricula());
    }
}


