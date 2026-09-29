package UD1.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ej3 {
    static void main(String[] args) {

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Paco",20,"DAM"));
        estudiantes.add(new Estudiante("Paca",990,"Ginecologia"));
        estudiantes.add(new Estudiante("Francisco",220,"Fuukear Tel Avil"));
        estudiantes.add(new Estudiante("Fuuk",19,"Trastorno de Obstruccion Anal"));
        estudiantes.add(new Estudiante("Raul",20,"DP (Dedeear Panchitas)"));

        Map<String, Estudiante> m = listaEstudiante(estudiantes);

        for (Map.Entry<String,Estudiante> m1 : m.entrySet()){
            System.out.println(" Estudiante : "+m1.getKey() + " "+m1.getValue());
        }



    }

    static Map<String,Estudiante> listaEstudiante(List<Estudiante> e){
        Map<String,Estudiante> m = new HashMap<>();

        for (Estudiante e1 : e ){
            m.put(e1.getNombre(),e1);
        }

        return m;
    }
}

class Estudiante {
    String nombre;
    int edad;
    String grado;

    public Estudiante(String nombre, int edad, String grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", grado='" + grado + '\'' +
                '}';
    }
}
