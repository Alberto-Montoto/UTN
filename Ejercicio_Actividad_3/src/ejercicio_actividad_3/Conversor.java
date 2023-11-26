package ejercicio_actividad_3;

import java.util.List;
import java.util.stream.Collectors;

public class Conversor {

    public class Convertir {

        public static List<String> convertirAMayusculas(List<String> lista) {
            return lista.stream()
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
        }
    }
}
