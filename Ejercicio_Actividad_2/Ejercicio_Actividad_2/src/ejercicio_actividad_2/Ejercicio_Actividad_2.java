package ejercicio_actividad_2;

import static ejercicio_actividad_2.Transformar.transformarMayusculas;
import java.util.List;
import java.util.function.Function;



public class Ejercicio_Actividad_2 {


    public static void main(String[] args) {
        
        List<String> listaOriginal = List.of("Hola", "Mundo", "Java");
        
        //Definir la interfaz funcional para transformar a mayúsculas
        Function<String, String> transformadorMayusculas = String::toUpperCase;

        //Método para transformar la lista
        List<String> listaTransformada = transformarMayusculas(listaOriginal, transformadorMayusculas);

        //Mostrar resultados
        System.out.println("Lista Original: " + listaOriginal);
        System.out.println("Lista Transformada: " + listaTransformada);
    }
}
