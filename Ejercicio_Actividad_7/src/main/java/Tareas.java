import jakarta.persistence.*;

@Entity
@Table(name = "Tareas")
public class Tareas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTarea;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio")
    private int precio;


}
