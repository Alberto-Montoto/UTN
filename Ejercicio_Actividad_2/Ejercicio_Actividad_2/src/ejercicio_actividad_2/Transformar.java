
package ejercicio_actividad_2;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public interface Transformar {
 
        public static List<String> transformarMayusculas(List<String> lista, Function<String, String> transformador) {
        //Método map de Java Streams para aplicar la transformación
        return lista.stream()
                .map(transformador)
                .collect(Collectors.toList());
    }
}
