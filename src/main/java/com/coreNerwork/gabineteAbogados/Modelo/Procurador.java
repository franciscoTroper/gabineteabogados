package com.coreNerwork.gabineteAbogados.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "procuradores")
public class Procurador {
    @Id
    @Column(length = 10)
    private int dni;
    @Column(name = "nombre",length = 60)
    private String nombre;
    @Column(name = "direccion",length = 120)
    private String direccion;

    @ManyToMany
    @JoinTable(name="procuradores_asuntos",
            joinColumns = @JoinColumn(name="dni",
            referencedColumnName="dni"),
            inverseJoinColumns=@JoinColumn(name="num_expediente"
                    , referencedColumnName = "numExpediente"))
    private List<Asunto> asuntos;



}
