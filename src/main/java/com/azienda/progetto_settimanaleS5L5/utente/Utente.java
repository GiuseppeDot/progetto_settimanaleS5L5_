package com.azienda.progetto_settimanaleS5L5.utente;

import com.azienda.progetto_settimanaleS5L5.prenotazione.Prenotazione;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Utente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cognome;
    private String email;

    @OneToMany(mappedBy = "utente")
    private List<Prenotazione> prenotazionei;
}
