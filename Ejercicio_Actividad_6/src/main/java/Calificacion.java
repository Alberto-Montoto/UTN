import jakarta.persistence.*;

@Entity
@Table(name = "Calificacion")

public class Calificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCalificacion;

    @Column(name = "puntuacion")
    private byte puntuacion;


}
