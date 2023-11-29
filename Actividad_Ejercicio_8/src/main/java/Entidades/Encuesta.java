package Entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "Encuesta")
public class Encuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter int idEncuesta;

    @Column(name = "Raza")
    private @Getter @Setter String raza;

    @Column(name = "Edad")
    private @Getter @Setter int edad;

    @Column(name = "Sintomas")
    private @Getter @Setter String sintomas;

    @Column(name = "Antecedentes")
    private @Getter @Setter String antecedentes;

    @Column(name = "Nombre")
    private @Getter @Setter String nombre;

}
