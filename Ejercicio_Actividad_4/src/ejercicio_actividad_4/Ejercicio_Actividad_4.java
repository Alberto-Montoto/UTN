
package ejercicio_actividad_4;

import java.time.LocalDateTime;

public class Ejercicio_Actividad_4 {


    public static void main(String[] args) {
        
        Cancion cancion = new Cancion("Coldplay", "A Rush of Blood to the head", 2002, "The Scientist");
        cancion.play(60000);
        cancion.like(50000);
        cancion.setReproducedLast24Hours(false);
        System.out.println(cancion.displaySongDetail()+ cancion.displaySongDetail());
    }
    
}
