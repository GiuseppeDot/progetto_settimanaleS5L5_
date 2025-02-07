package com.azienda.progetto_settimanaleS5L5.edificio;


import com.azienda.progetto_settimanaleS5L5.postazione.Postazione;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeEdificio;
    private String indirizzo;
    private String citta;

    //un edificio ha tante postazioni <---> tante postazioni appartengono ad un'edificio
    @OneToOne
    private List<Postazione> postazioni;

}
