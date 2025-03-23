package ta4;

import java.util.ArrayList;
import java.util.List;

public class ContadorPalabras {
    public String[] palabrasComunes(String[] palabras1, String[] palabras2){
        List<String> comunes = new ArrayList<>();

        for (String palabra1 : palabras1){
            for(String palabra2 : palabras2){
                if(palabra1.equals(palabra2)){
                    if (!comunes.contains(palabra1)){
                        comunes.add(palabra1);
                    }
                }
            }
        }
        return comunes.toArray(new String [0]);
    }
}