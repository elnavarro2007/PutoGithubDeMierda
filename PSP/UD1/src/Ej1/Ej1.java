package Ej1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ej1 {
    static void main(String[] args) {

        Path ruta = Paths.get("C:\\Users\\dam2\\Documents\\CarpetaEj1\\Ej1");

        if (ruta.toFile().exists()){
            System.out.println("existe");
        }



        try {
            ProcessBuilder pDocumento = new ProcessBuilder("C:\\Program Files\\Notepad++\\notepad++.exe","C:\\Users\\dam2\\Documents\\CarpetaEj1");
            Process p = pDocumento.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
