
package UTN;

import com.sun.tools.sjavac.server.SysInfo;
import java.util.Scanner;


public class Inscripciones {
    
    private Alumnos alumno;
    private Materias materia;
    private boolean aprobada;

    public Inscripciones(Alumnos alumno, Materias materia) {
        this.alumno = alumno;
        this.materia = materia;
        this.aprobada = false;
    }

    public void aprobar() {
        aprobada = true;
    }

    public boolean isAprobada() {
        System.out.println("Usted ha aprobado satisfactoriamente la materia");
        return aprobada;
    }

    @Override
    public String toString() {
        return "Inscripcion: " + alumno + ", " + materia +", " + aprobada;
    }

    public Materias getMateria() {
        return materia;
    }
    
    /*public void correlativa (){
        
        Scanner scanner = new Scanner(System.in);
        
        int cursadas = 0;
        do {
        
            System.out.println("Cuantas materias esta cursando?");
            cursadas = scanner.nextInt();
        
            System.out.println("Ingrese la nota de la materia Estructuras de datos");

            int edd = scanner.nextInt();
        
            if (edd <= 5) {
                isAprobada();
                int alg=0;
                System.out.println("Ingrese su nota de la materia Algoritmos");
                alg = scanner.nextInt();
                cursadas --;
                if (alg <= 5) {
                    isAprobada();
                    int pdp=0;
                    System.out.println("Ingrese su nota de la materia Paradigmas de Programación");
                    pdp = scanner.nextInt();
                    cursadas --;
                    if (pdp >= 5) {
                        isAprobada();
                        int dds=0;
                        System.out.println("Ingrese su nota de la materia Diseño de Sistemas");
                        dds = scanner.nextInt();
                        cursadas--;
                        if (dds >= 5) {
                            isAprobada();
                        }
                    }
                }
                
            }else{
                System.out.println("Debe mejorar su nota para continuar con la proxima materia");
            }
        
        } while (cursadas == 0);
        
//Por ejemplo, antes de cursar
//Diseño de Sistemas -- Paradigmas de Programación -- Algoritmos y Estructuras de Datos, donde esta última no tiene correlativas.

    }*/
}
