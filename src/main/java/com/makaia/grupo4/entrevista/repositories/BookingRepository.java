package com.makaia.grupo4.entrevista.repositories;

import com.makaia.grupo4.entrevista.models.Aspirante;
import com.makaia.grupo4.entrevista.models.Booking;
import com.makaia.grupo4.entrevista.models.Mentor;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    @Query
    public List<Booking> findByMentor(Mentor mentor);

    @Query("SELECT b FROM Booking b WHERE b.active = true and b.mentor= :mentor")
    public List<Booking> findByMentorActive(Mentor mentor);

    @Query
    public Booking findByAspirante(Aspirante mentor);
}
