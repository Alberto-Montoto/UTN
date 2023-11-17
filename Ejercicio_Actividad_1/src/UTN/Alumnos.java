
package UTN;

import java.util.ArrayList;
import java.util.List;


public class Alumnos {
    
    private String nombre;
    private List<Inscripciones> inscripciones;

    public Alumnos(String nombre) {
        this.nombre = nombre;
        this.inscripciones = new ArrayList<>();
    }

    public void inscribir(Materias materia) {
        Inscripciones inscripcion = new Inscripciones(this, materia);
        inscripciones.add(inscripcion);
    }

    public boolean aprobada(Materias materia) {
        for (Inscripciones inscripcion : inscripciones) {
            if (inscripcion.getMateria().equals(materia) && inscripcion.isAprobada()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Alumnos: " + nombre ;
    }
}
