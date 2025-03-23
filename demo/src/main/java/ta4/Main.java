package ta4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> lineaArchivo1 = Files.readAllLines(Paths.get("demo\\archivo1.txt"));
            List<String> lineaArchivo2 = Files.readAllLines(Paths.get("demo\\archivo2.txt"));

            String[] palabras1 = String.join (" ", lineaArchivo1).split("\\s+");
            String[] palabras2 = String.join (" ", lineaArchivo2).split("\\s+");

            ContadorPalabras contador = new ContadorPalabras();
            String[] comunes = contador.palabrasComunes(palabras1, palabras2);

            System.out.println("Palabras comunes:");
            for (String palabra : comunes){
                System.out.println(palabra);
            }
        } catch (IOException e) {
            System.out.println("Error al leer los archivos");
        }



        System.out.println("Hello world!");
    }
}