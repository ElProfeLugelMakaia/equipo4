package com.makaia.grupo4.entrevista.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makaia.grupo4.entrevista.models.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {

}
