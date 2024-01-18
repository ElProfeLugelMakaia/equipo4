package com.makaia.grupo4.entrevista.repositories;

import com.makaia.grupo4.entrevista.models.Aspirante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AspiranteRepository extends JpaRepository<Aspirante, Long> {

    @Query
    public Aspirante findByCorreo(String corrreo);
}
