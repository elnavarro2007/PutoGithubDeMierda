package Ej2;

import java.io.*;
import java.nio.file.Files;

public class Ej2 {
    static void main(String[] args) {

        File archivo = new File("salida.txt");
        File archivo2 = new File("errores.txt");
        String comando = "echo Usuario actual: && whoami && echo Directorio actual: && cd && echo Contenido del directorio: && dir";

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

        ProcessBuilder pb = new ProcessBuilder("cmd.exe","/c",comando);
        pb.redirectOutput(archivo);
        pb.redirectError(archivo2);


        try  {


            Process process = pb.start();
            System.out.println(process);

            System.out.println(process.waitFor() +"se ha terminao ");






        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
