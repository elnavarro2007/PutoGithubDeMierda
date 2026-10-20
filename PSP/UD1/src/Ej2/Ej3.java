package Ej2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class Ej3 {
    static void main(String[] args) {
        String comandos = "echo Comenzando ejecución &&  date /t &&  time /t && dir && ipconfig && echo Fin de la ejecución";
        File archivo = new File("comandos.bat");
        File error = new File("error.log");
        File salida = new File("salida.log");

        // error
        try {
            if (!error.exists()){
                Files.createFile(error.toPath());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // salida
        try {
            if (!salida.exists()){
                Files.createFile(salida.toPath());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // creacion bat
        try {
            if (!archivo.exists()){
                Files.createFile(archivo.toPath());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // introduccion string bat
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))){

            bw.write(comandos);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ProcessBuilder pb = new ProcessBuilder("cmd.exe","/c","comandos.bat");

        pb.redirectError(error);
        pb.redirectOutput(salida);


        try {
             Process p= pb.start();
            System.out.println("Proceso empezado");
            System.out.println(p.waitFor() + " proceso finalizado");

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
