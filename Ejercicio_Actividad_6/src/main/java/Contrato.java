import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Contrato")
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrato;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "lugar")
    private String lugar;

    @Column(name = "precio")
    private int precio;

    @OneToMany
    @JoinColumn(name = "idConsumidor")
    private List<Contrato> contrato = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "idTareas")
    private int idTareas;




}
