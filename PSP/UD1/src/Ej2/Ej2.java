package Ej2;

import java.io.*;
import java.nio.file.Files;

public class Ej2 {
    static void main(String[] args) {

        File archivo = new File("salida.txt");
        File archivo2 = new File("errores.txt");
        String comando = "echo Usuario actual:\n" +
                "whoami\n" +
                "echo Directorio actual:\n" +
                "cd\n" +
                "echo Contenido del directorio:\n" +
                "dir";

        try {
            if (!archivo.exists()) {
                Files.createFile(archivo.toPath());
            }
            if (!archivo2.exists()) {
                Files.createFile(archivo2.toPath());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedReader br = new BufferedReader(new FileReader(archivo));
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {

            ProcessBuilder p = new ProcessBuilder("cmd.exe","/c",comando );
            Process process = p.start();

            p.redirectOutput(archivo);
            p.redirectError(archivo2);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
