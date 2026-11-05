import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    static void main(String[] args) {
        Path directorio = Paths.get("items");
        int contador = 0;

        try (DirectoryStream <Path> stream = Files.newDirectoryStream(directorio)) {
            for ( Path archivo : stream){
                System.out.println(archivo.getFileName());
                String content = new String(Files.readAllBytes(archivo));
                System.out.println(content);

                contador++;
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(contador);
    }
}
