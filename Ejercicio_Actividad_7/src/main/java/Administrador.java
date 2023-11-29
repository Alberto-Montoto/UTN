import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "administrador")
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdministrador;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "email")
    private String email;

    @JoinColumn(name = "idPrestador")
    private List<Prestador> prestador = new ArrayList<>();



}
