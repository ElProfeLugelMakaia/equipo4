package com.makaia.grupo4.entrevista.repositories;

import com.makaia.grupo4.entrevista.models.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MentorRespository extends JpaRepository<Mentor, Long> {

    @Query
    public Mentor findByCorreo(String correo);
}
