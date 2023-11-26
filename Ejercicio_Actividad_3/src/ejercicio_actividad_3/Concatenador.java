package ejercicio_actividad_3;

import java.util.List;
import java.util.stream.Collectors;

public class Concatenador {

    public class Concatenar {

        public static String concatenarPalabras(List<String> lista, int n) {
            return lista.stream()
                    .filter(palabra -> palabra.length() > n)
                    .collect(Collectors.joining(", "));
        }
    }
}
