package com.azienda.progetto_settimanaleS5L5.prenotazione;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    List<Prenotazione> findByPostazione_IdAndData(Long postazioneId, LocalDate data);
    List<Prenotazione> findByUtente_IdAndData(Long utenteId, LocalDate data);
}
