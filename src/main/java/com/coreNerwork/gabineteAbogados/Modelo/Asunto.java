package com.coreNerwork.gabineteAbogados.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "asuntos")
public class Asunto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numExpediente;
    private LocalTime fechaInicio;
    private LocalTime fechaFinalizacion;
    @Column(length = 1)
    private String estado;


//    @ManyToMany(mappedBy = "asuntos",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    List<Procurador> procuradores;

    @ManyToOne
    @JoinColumn(name = "dni",foreignKey = @ForeignKey(name="FX_ASUNTOS_CLIENTES"))
    private Cliente cliente;


}
