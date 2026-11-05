import modelo.Tiempo;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Array;

public class LeerFicheros implements Runnable {


    // pillar los datos del objeto tiempo y depsues meterlos en un array donde habra una tmin y tmax por mes
    Tiempo [] fechaMax = new Tiempo[12];
    Tiempo [] fechaMin = new Tiempo[12];


    @Override
    public synchronized void run() {

    }
}
