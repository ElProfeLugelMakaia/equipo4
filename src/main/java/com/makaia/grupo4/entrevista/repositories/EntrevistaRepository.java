package com.makaia.grupo4.entrevista.repositories;

import com.makaia.grupo4.entrevista.models.Aspirante;
import com.makaia.grupo4.entrevista.models.Entrevista;
import com.makaia.grupo4.entrevista.models.Mentor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EntrevistaRepository extends JpaRepository<Entrevista, Long> {
  @Query("SELECT a from Entrevista a where a.mentor = $1")
  public List<Entrevista> getEntrevistaMentorId(Mentor mentor);

  @Query("SELECT a from Entrevista a where a.aspirante = $1")
  public Entrevista getEntrevistaAspiranteId(Aspirante aspirante);
}
