
package UTN;

import java.util.ArrayList;
import java.util.List;


public class Materias {
 
    private String nombre;
    private List<Materias> correlativas;

    public Materias(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }

    public void agregarCorrelativa(Materias materia) {
        correlativas.add(materia);
    }

    public boolean verificarAprobacion(Alumnos alumno) {
        for (Materias correlativa : correlativas) {
            if (!alumno.aprobada(correlativa)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Materias: " + nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
