package com.makaia.grupo4.entrevista.repositories;

import com.makaia.grupo4.entrevista.models.Aspirante;
import com.makaia.grupo4.entrevista.models.Entrevista;
import com.makaia.grupo4.entrevista.models.Formulario;
import com.makaia.grupo4.entrevista.models.Mentor;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FormularioRepository extends JpaRepository<Formulario, Long> {

    @Query
    public List<Formulario> findByEntrevistas(Entrevista entrevistas);

    @Query("select f from Formulario f join f.entrevistas e join e.booking b where b.aspirante = :aspirante")
    public Formulario findByAspirante(Aspirante aspirante);

    @Query("select f from Formulario f join f.entrevistas e join e.booking b where b.mentor = :mentor")
    public List<Formulario> findByMentor(Mentor mentor);
}
