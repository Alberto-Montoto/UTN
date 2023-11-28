import jakarta.persistence.*;

@Entity
@Table(name = "Servicio")

public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServicio;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "tareasAsociadas")
    private String tareasAsociadas;



}
