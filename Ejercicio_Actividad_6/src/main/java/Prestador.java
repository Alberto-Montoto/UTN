import jakarta.persistence.*;
import lombok.extern.apachecommons.CommonsLog;

import java.time.LocalDate;

@Entity
@Table(name = "Prestador")

public class Prestador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPrestadro;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "fechaNac")
    private LocalDate fechaNac;

    @Column(name = "cuil")
    private int cuit;

    @ManyToOne
    @JoinColumn(name = "idServicio")
    private int idServicio;

    @OneToMany
    @JoinColumn(name = "idContrato")
    private int idContrato;




}
