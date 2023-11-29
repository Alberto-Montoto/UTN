package Entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "VeterinariaEstablecimiento")
public class VeterinariaEstablecimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter int idVeterinariaEstablecimiento;

    @Column(name = "Nombre")
    private @Getter @Setter String nombre;

    @Column(name = "Direccion")
    private @Getter @Setter String direccion;

    @Column(name = "Ciudad")
    private @Getter @Setter String ciudad;

    @Column(name = "Telefono")
    private @Getter @Setter int telefono;

}
