package com.makaia.grupo4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makaia.grupo4.entrevista.models.Entrevista;

public interface AspiranteRepository extends JpaRepository<Long,Entrevista> {
    
}
