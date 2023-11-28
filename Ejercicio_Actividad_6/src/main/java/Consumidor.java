import jakarta.persistence.*;

@Entity
@Table(name = "consumidor")

public class Consumidor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConsumidor;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "dni")
    private int dni;

    @Column(name = "telefono")
    private int telefono;

    @OneToOne
    @JoinColumn(name = "idCalificacion")
    private int calificacion;



}
