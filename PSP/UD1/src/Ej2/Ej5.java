package Ej2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class Ej5 {
    static void main(String[] args) {
        File ipconfig = new File("ipconfig.txt");
        File hostname = new File("hostname.txt");
        File ping = new File("ping.txt");

        String comando1 = "ipconfig";
        String comando2 = "hostname";
        String comando3 = "ping www.google.es";


        ProcessBuilder pb1 = new ProcessBuilder("cmd.exe","/c",comando1);
        ProcessBuilder pb2 = new ProcessBuilder("cmd.exe","/c",comando2);
        ProcessBuilder pb3 = new ProcessBuilder("cmd.exe","/c",comando3);

        pb1.redirectOutput(ipconfig);
        pb2.redirectOutput(hostname);
        pb3.redirectOutput(ping);



        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ipconfig));
             BufferedWriter bw2 = new BufferedWriter(new FileWriter(hostname));
             BufferedWriter bw3 = new BufferedWriter(new FileWriter(ping))) {
            if (!ipconfig.exists() || !hostname.exists() || !ping.exists()){
                Files.createFile(ipconfig.toPath());
                Files.createFile(hostname.toPath());
                Files.createFile(ping.toPath());
            }else {

                Process p1 = pb1.start();
                Process p2 = pb2.start();
                Process p3 = pb3.start();

                System.out.println(p1.waitFor()+ " proceso 1");
                System.out.println(p2.waitFor()+ " proceso 2");
                System.out.println(p3.waitFor()+ " proceso 3" );

            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
