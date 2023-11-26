
package ejercicio_actividad_3;

import static ejercicio_actividad_3.Concatenador.Concatenar.concatenarPalabras;
import static ejercicio_actividad_3.Conversor.Convertir.convertirAMayusculas;
import java.util.List;


public class Ejercicio_Actividad_3 {

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<String> palabras = List.of("Hola", "Mundo", "Java");
        List<String> palabrasMayusculas = convertirAMayusculas(palabras);
        System.out.println(palabrasMayusculas);
        
        List<String> frase = List.of("Java", "Lambdas", "Colecciones", "Stream", "Ejercicio");
        int longitudMinima = 5;
        String resultado = concatenarPalabras(frase, longitudMinima);
        System.out.println(resultado);
        
    }
    
}

