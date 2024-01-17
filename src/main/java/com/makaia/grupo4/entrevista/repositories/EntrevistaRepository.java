package com.makaia.grupo4.entrevista.repositories;

import com.makaia.grupo4.entrevista.models.Aspirante;
import com.makaia.grupo4.entrevista.models.Booking;
import com.makaia.grupo4.entrevista.models.Entrevista;
import com.makaia.grupo4.entrevista.models.Mentor;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EntrevistaRepository extends JpaRepository<Entrevista, Long> {
  @Query
  public List<Entrevista> findByBooking(Booking booking);

  @Query("select e from Entrevista e join e.booking b join b.aspirante where b.aspirante = :aspirante")
  public Optional<Entrevista> findByAspirante(Aspirante aspirante);

  @Query("select e from Entrevista e join e.booking b join b.mentor where b.mentor = :mentor")
  public List<Entrevista> findByMentor(Mentor mentor);

}
