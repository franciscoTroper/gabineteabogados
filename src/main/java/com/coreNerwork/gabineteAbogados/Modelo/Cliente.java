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
@Table(name = "cliente")

public class Cliente {
    @Id
    @Column(name="dni",length = 100)
    private int dni;
    @Column(name = "nombre",length = 60)
    private String nombre;
    @Column(name = "direccion",length = 120)
    private String direccion;

//    @OneToMany(mappedBy = "cliente",cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER)
//    List<Asunto> asuntos;

}
