package com.makaia.grupo4.entrevista.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import com.makaia.grupo4.entrevista.models.Agenda;
import com.makaia.grupo4.entrevista.models.Mentor;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {

    @Query
    public List<Agenda> findByMentor(Mentor mentor);

}
