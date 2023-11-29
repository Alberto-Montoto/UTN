package Entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Veterinario")
public class Veterinario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter int veterinario;

    @Column(name = "Nombre")
    private @Getter @Setter String nombre;

    @Column(name = "Especialidad")
    private @Getter @Setter String secialidad;

    @Column(name = "Matricula")
    private @Getter @Setter int matricula;

    @OneToOne
    @JoinColumn(name = "idVeterinariaEstablecimiento")
    private @Getter @Setter VeterinariaEstablecimiento idVeterinariaEstablecimiento;

    @OneToMany
    @JoinColumn(name = "idEncuesta")
    private List<Encuesta> encuesta = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "idConsulta")
    private List<Consulta> consulta = new ArrayList<>();


}
