
package UTN;


public class EjerciciosUTN {

   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alumnos alumno = new Alumnos("Alberto");
        Materias materia1 = new Materias("Analisis de datos");
        Inscripciones insc = new Inscripciones(alumno, materia1);
        
//        alumno.aprobada(materia1);
//        alumno.inscribir(materia1);
//        materia1.verificarAprobacion(alumno);
//        materia1.agregarCorrelativa(materia1);
//        materia1.verificarAprobacion(alumno);
//        System.out.println(insc);
//        System.out.println(materia1.verificarAprobacion(alumno));
//        System.out.println(materia1);
    insc.isAprobada();
    
    }
    
}
