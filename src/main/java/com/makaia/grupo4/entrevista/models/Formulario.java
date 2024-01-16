package com.makaia.grupo4.entrevista.models;

import java.util.List;

import com.makaia.grupo4.entrevista.enums.AspiracionProyectoDeVida;
import com.makaia.grupo4.entrevista.enums.BackgroundIT;
import com.makaia.grupo4.entrevista.enums.DisponibilidadTiempo;
import com.makaia.grupo4.entrevista.enums.Eneagrama;
import com.makaia.grupo4.entrevista.enums.EstadoPerfil;
import com.makaia.grupo4.entrevista.enums.ExperienciaLaboral;
import com.makaia.grupo4.entrevista.enums.Idiomas;
import com.makaia.grupo4.entrevista.enums.Interes;
import com.makaia.grupo4.entrevista.enums.Manejo;
import com.makaia.grupo4.entrevista.enums.NivelCompetencia;
import com.makaia.grupo4.entrevista.enums.RedDeApoyo;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "Formulario")
public class Formulario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "puntaje_test_gorilla")
  private Float puntajeTestGorilla;

  @Enumerated(EnumType.STRING)
  @Column(name = "eneagrama")
  private Eneagrama eneagrama;

  @Column(name = "cohorte", length = 5)
  private String cohorte;

  @Column(name = "cooperante", length = 25)
  private String cooperante;

  @Enumerated(EnumType.STRING)
  @Column(name = "background_it")
  private BackgroundIT backgroundIT;

  @Enumerated(EnumType.STRING)
  @Column(name = "idiomas")
  private Idiomas idiomas;

  @Column(name = "profesion_educacion", length = 30)
  private String profesionEducacion;

  @Column(name = "estudio_actual", length = 30)
  private String estudioActual;

  @Column(name = "trabajo_actual", length = 30)
  private String trabajoActual;

  @Enumerated(EnumType.STRING)
  @Column(name = "disponibilidad_de_tiempo")
  private DisponibilidadTiempo disponibilidadDeTiempo;

  @ElementCollection(targetClass = Interes.class)
  @CollectionTable(name = "formulario_intereses", joinColumns = @JoinColumn(name = "id_formulario"))
  @Enumerated(EnumType.STRING)
  @Column(name = "interes")
  private List<Interes> intereses;

  @Enumerated(EnumType.STRING)
  @Column(name = "experiencia_laboral")
  private ExperienciaLaboral experienciaLaboral;

  @Enumerated(EnumType.STRING)
  @Column(name = "aspiracion_proyecto_de_vida")
  private AspiracionProyectoDeVida aspiracionProyectoDeVida;

  @Enumerated(EnumType.STRING)
  @Column(name = "red_de_apoyo")
  private RedDeApoyo redDeApoyo;

  @Enumerated(EnumType.STRING)
  @Column(name = "trabajo_en_equipo")
  private NivelCompetencia trabajoEnEquipo;

  @Enumerated(EnumType.STRING)
  @Column(name = "comunicacion_asertiva")
  private NivelCompetencia comunicacionAsertiva;

  @Enumerated(EnumType.STRING)
  @Column(name = "respeto_por_la_diversidad")
  private NivelCompetencia respetoPorLaDiversidad;

  @Enumerated(EnumType.STRING)
  @Column(name = "manejo_de_emociones")
  private NivelCompetencia manejoDeEmociones;

  @Enumerated(EnumType.STRING)
  @Column(name = "autogestion")
  private NivelCompetencia autogestion;

  @Enumerated(EnumType.STRING)
  @Column(name = "manejo_de_tiempo")
  private NivelCompetencia manejoDeTiempo;

  @Enumerated(EnumType.STRING)
  @Column(name = "estilo_de_aprendizaje")
  private NivelCompetencia estiloDeAprendizaje;

  @Enumerated(EnumType.STRING)
  @Column(name = "orientacion_al_logro")
  private NivelCompetencia orientacionAlLogro;

  @Enumerated(EnumType.STRING)
  @Column(name = "capacidad_de_compromiso")
  private NivelCompetencia capacidadDeCompromiso;

  @Enumerated(EnumType.STRING)
  @Column(name = "manejo_de_sistemas")
  private Manejo manejoDeSistemas;

  @Column(name = "equipo_y_conectividad_optima")
  private Boolean equipoYConectividadOptima;

  @Column(name = "riesgo_de_desercion", length = 25)
  private String riesgoDeDesercion;

  @Column(name = "anotacion_psicosocial", length = 400)
  private String anotacionPsicosocial;

  @Column(name = "alerta_psicosocial", length = 25)
  private String alertaPsicosocial;

  @Enumerated(EnumType.STRING)
  @Column(name = "tiene_el_perfil")
  private EstadoPerfil tieneElPerfil;

  @Column
  private String comentario;

  @OneToOne(optional = false)
  private Entrevista entrevistas;

  public Formulario() {
  }

  public Formulario(Float puntajeTestGorilla, Eneagrama eneagrama, String cohorte, String cooperante,
      BackgroundIT backgroundIT, Idiomas idiomas, String profesionEducacion, String estudioActual, String trabajoActual,
      DisponibilidadTiempo disponibilidadDeTiempo, List<Interes> intereses, ExperienciaLaboral experienciaLaboral,
      AspiracionProyectoDeVida aspiracionProyectoDeVida, RedDeApoyo redDeApoyo, NivelCompetencia trabajoEnEquipo,
      NivelCompetencia comunicacionAsertiva, NivelCompetencia respetoPorLaDiversidad,
      NivelCompetencia manejoDeEmociones, NivelCompetencia autogestion, NivelCompetencia manejoDeTiempo,
      NivelCompetencia estiloDeAprendizaje, NivelCompetencia orientacionAlLogro, NivelCompetencia capacidadDeCompromiso,
      Manejo manejoDeSistemas, Boolean equipoYConectividadOptima, String riesgoDeDesercion, String anotacionPsicosocial,
      String alertaPsicosocial, EstadoPerfil tieneElPerfil, String comentario, Entrevista entrevistas) {
    this.puntajeTestGorilla = puntajeTestGorilla;
    this.eneagrama = eneagrama;
    this.cohorte = cohorte;
    this.cooperante = cooperante;
    this.backgroundIT = backgroundIT;
    this.idiomas = idiomas;
    this.profesionEducacion = profesionEducacion;
    this.estudioActual = estudioActual;
    this.trabajoActual = trabajoActual;
    this.disponibilidadDeTiempo = disponibilidadDeTiempo;
    this.intereses = intereses;
    this.experienciaLaboral = experienciaLaboral;
    this.aspiracionProyectoDeVida = aspiracionProyectoDeVida;
    this.redDeApoyo = redDeApoyo;
    this.trabajoEnEquipo = trabajoEnEquipo;
    this.comunicacionAsertiva = comunicacionAsertiva;
    this.respetoPorLaDiversidad = respetoPorLaDiversidad;
    this.manejoDeEmociones = manejoDeEmociones;
    this.autogestion = autogestion;
    this.manejoDeTiempo = manejoDeTiempo;
    this.estiloDeAprendizaje = estiloDeAprendizaje;
    this.orientacionAlLogro = orientacionAlLogro;
    this.capacidadDeCompromiso = capacidadDeCompromiso;
    this.manejoDeSistemas = manejoDeSistemas;
    this.equipoYConectividadOptima = equipoYConectividadOptima;
    this.riesgoDeDesercion = riesgoDeDesercion;
    this.anotacionPsicosocial = anotacionPsicosocial;
    this.alertaPsicosocial = alertaPsicosocial;
    this.tieneElPerfil = tieneElPerfil;
    this.comentario = comentario;
    this.entrevistas = entrevistas;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Float getPuntajeTestGorilla() {
    return this.puntajeTestGorilla;
  }

  public void setPuntajeTestGorilla(Float puntajeTestGorilla) {
    this.puntajeTestGorilla = puntajeTestGorilla;
  }

  public Eneagrama getEneagrama() {
    return this.eneagrama;
  }

  public void setEneagrama(Eneagrama eneagrama) {
    this.eneagrama = eneagrama;
  }

  public String getCohorte() {
    return this.cohorte;
  }

  public void setCohorte(String cohorte) {
    this.cohorte = cohorte;
  }

  public String getCooperante() {
    return this.cooperante;
  }

  public void setCooperante(String cooperante) {
    this.cooperante = cooperante;
  }

  public BackgroundIT getBackgroundIT() {
    return this.backgroundIT;
  }

  public void setBackgroundIT(BackgroundIT backgroundIT) {
    this.backgroundIT = backgroundIT;
  }

  public Idiomas getIdiomas() {
    return this.idiomas;
  }

  public void setIdiomas(Idiomas idiomas) {
    this.idiomas = idiomas;
  }

  public String getProfesionEducacion() {
    return this.profesionEducacion;
  }

  public void setProfesionEducacion(String profesionEducacion) {
    this.profesionEducacion = profesionEducacion;
  }

  public String getEstudioActual() {
    return this.estudioActual;
  }

  public void setEstudioActual(String estudioActual) {
    this.estudioActual = estudioActual;
  }

  public String getTrabajoActual() {
    return this.trabajoActual;
  }

  public void setTrabajoActual(String trabajoActual) {
    this.trabajoActual = trabajoActual;
  }

  public DisponibilidadTiempo getDisponibilidadDeTiempo() {
    return this.disponibilidadDeTiempo;
  }

  public void setDisponibilidadDeTiempo(DisponibilidadTiempo disponibilidadDeTiempo) {
    this.disponibilidadDeTiempo = disponibilidadDeTiempo;
  }

  public List<Interes> getIntereses() {
    return this.intereses;
  }

  public void setIntereses(List<Interes> intereses) {
    this.intereses = intereses;
  }

  public ExperienciaLaboral getExperienciaLaboral() {
    return this.experienciaLaboral;
  }

  public void setExperienciaLaboral(ExperienciaLaboral experienciaLaboral) {
    this.experienciaLaboral = experienciaLaboral;
  }

  public AspiracionProyectoDeVida getAspiracionProyectoDeVida() {
    return this.aspiracionProyectoDeVida;
  }

  public void setAspiracionProyectoDeVida(AspiracionProyectoDeVida aspiracionProyectoDeVida) {
    this.aspiracionProyectoDeVida = aspiracionProyectoDeVida;
  }

  public RedDeApoyo getRedDeApoyo() {
    return this.redDeApoyo;
  }

  public void setRedDeApoyo(RedDeApoyo redDeApoyo) {
    this.redDeApoyo = redDeApoyo;
  }

  public NivelCompetencia getTrabajoEnEquipo() {
    return this.trabajoEnEquipo;
  }

  public void setTrabajoEnEquipo(NivelCompetencia trabajoEnEquipo) {
    this.trabajoEnEquipo = trabajoEnEquipo;
  }

  public NivelCompetencia getComunicacionAsertiva() {
    return this.comunicacionAsertiva;
  }

  public void setComunicacionAsertiva(NivelCompetencia comunicacionAsertiva) {
    this.comunicacionAsertiva = comunicacionAsertiva;
  }

  public NivelCompetencia getRespetoPorLaDiversidad() {
    return this.respetoPorLaDiversidad;
  }

  public void setRespetoPorLaDiversidad(NivelCompetencia respetoPorLaDiversidad) {
    this.respetoPorLaDiversidad = respetoPorLaDiversidad;
  }

  public NivelCompetencia getManejoDeEmociones() {
    return this.manejoDeEmociones;
  }

  public void setManejoDeEmociones(NivelCompetencia manejoDeEmociones) {
    this.manejoDeEmociones = manejoDeEmociones;
  }

  public NivelCompetencia getAutogestion() {
    return this.autogestion;
  }

  public void setAutogestion(NivelCompetencia autogestion) {
    this.autogestion = autogestion;
  }

  public NivelCompetencia getManejoDeTiempo() {
    return this.manejoDeTiempo;
  }

  public void setManejoDeTiempo(NivelCompetencia manejoDeTiempo) {
    this.manejoDeTiempo = manejoDeTiempo;
  }

  public NivelCompetencia getEstiloDeAprendizaje() {
    return this.estiloDeAprendizaje;
  }

  public void setEstiloDeAprendizaje(NivelCompetencia estiloDeAprendizaje) {
    this.estiloDeAprendizaje = estiloDeAprendizaje;
  }

  public NivelCompetencia getOrientacionAlLogro() {
    return this.orientacionAlLogro;
  }

  public void setOrientacionAlLogro(NivelCompetencia orientacionAlLogro) {
    this.orientacionAlLogro = orientacionAlLogro;
  }

  public NivelCompetencia getCapacidadDeCompromiso() {
    return this.capacidadDeCompromiso;
  }

  public void setCapacidadDeCompromiso(NivelCompetencia capacidadDeCompromiso) {
    this.capacidadDeCompromiso = capacidadDeCompromiso;
  }

  public Manejo getManejoDeSistemas() {
    return this.manejoDeSistemas;
  }

  public void setManejoDeSistemas(Manejo manejoDeSistemas) {
    this.manejoDeSistemas = manejoDeSistemas;
  }

  public Boolean isEquipoYConectividadOptima() {
    return this.equipoYConectividadOptima;
  }

  public Boolean getEquipoYConectividadOptima() {
    return this.equipoYConectividadOptima;
  }

  public void setEquipoYConectividadOptima(Boolean equipoYConectividadOptima) {
    this.equipoYConectividadOptima = equipoYConectividadOptima;
  }

  public String getRiesgoDeDesercion() {
    return this.riesgoDeDesercion;
  }

  public void setRiesgoDeDesercion(String riesgoDeDesercion) {
    this.riesgoDeDesercion = riesgoDeDesercion;
  }

  public String getAnotacionPsicosocial() {
    return this.anotacionPsicosocial;
  }

  public void setAnotacionPsicosocial(String anotacionPsicosocial) {
    this.anotacionPsicosocial = anotacionPsicosocial;
  }

  public String getAlertaPsicosocial() {
    return this.alertaPsicosocial;
  }

  public void setAlertaPsicosocial(String alertaPsicosocial) {
    this.alertaPsicosocial = alertaPsicosocial;
  }

  public EstadoPerfil getTieneElPerfil() {
    return this.tieneElPerfil;
  }

  public void setTieneElPerfil(EstadoPerfil tieneElPerfil) {
    this.tieneElPerfil = tieneElPerfil;
  }

  public String getComentario() {
    return this.comentario;
  }

  public void setComentario(String comentario) {
    this.comentario = comentario;
  }

  public Entrevista getEntrevistas() {
    return this.entrevistas;
  }

  public void setEntrevistas(Entrevista entrevistas) {
    this.entrevistas = entrevistas;
  }

  public Formulario id(Long id) {
    setId(id);
    return this;
  }

  public Formulario puntajeTestGorilla(Float puntajeTestGorilla) {
    setPuntajeTestGorilla(puntajeTestGorilla);
    return this;
  }

  public Formulario eneagrama(Eneagrama eneagrama) {
    setEneagrama(eneagrama);
    return this;
  }

  public Formulario cohorte(String cohorte) {
    setCohorte(cohorte);
    return this;
  }

  public Formulario cooperante(String cooperante) {
    setCooperante(cooperante);
    return this;
  }

  public Formulario backgroundIT(BackgroundIT backgroundIT) {
    setBackgroundIT(backgroundIT);
    return this;
  }

  public Formulario idiomas(Idiomas idiomas) {
    setIdiomas(idiomas);
    return this;
  }

  public Formulario profesionEducacion(String profesionEducacion) {
    setProfesionEducacion(profesionEducacion);
    return this;
  }

  public Formulario estudioActual(String estudioActual) {
    setEstudioActual(estudioActual);
    return this;
  }

  public Formulario trabajoActual(String trabajoActual) {
    setTrabajoActual(trabajoActual);
    return this;
  }

  public Formulario disponibilidadDeTiempo(DisponibilidadTiempo disponibilidadDeTiempo) {
    setDisponibilidadDeTiempo(disponibilidadDeTiempo);
    return this;
  }

  public Formulario intereses(List<Interes> intereses) {
    setIntereses(intereses);
    return this;
  }

  public Formulario experienciaLaboral(ExperienciaLaboral experienciaLaboral) {
    setExperienciaLaboral(experienciaLaboral);
    return this;
  }

  public Formulario aspiracionProyectoDeVida(AspiracionProyectoDeVida aspiracionProyectoDeVida) {
    setAspiracionProyectoDeVida(aspiracionProyectoDeVida);
    return this;
  }

  public Formulario redDeApoyo(RedDeApoyo redDeApoyo) {
    setRedDeApoyo(redDeApoyo);
    return this;
  }

  public Formulario trabajoEnEquipo(NivelCompetencia trabajoEnEquipo) {
    setTrabajoEnEquipo(trabajoEnEquipo);
    return this;
  }

  public Formulario comunicacionAsertiva(NivelCompetencia comunicacionAsertiva) {
    setComunicacionAsertiva(comunicacionAsertiva);
    return this;
  }

  public Formulario respetoPorLaDiversidad(NivelCompetencia respetoPorLaDiversidad) {
    setRespetoPorLaDiversidad(respetoPorLaDiversidad);
    return this;
  }

  public Formulario manejoDeEmociones(NivelCompetencia manejoDeEmociones) {
    setManejoDeEmociones(manejoDeEmociones);
    return this;
  }

  public Formulario autogestion(NivelCompetencia autogestion) {
    setAutogestion(autogestion);
    return this;
  }

  public Formulario manejoDeTiempo(NivelCompetencia manejoDeTiempo) {
    setManejoDeTiempo(manejoDeTiempo);
    return this;
  }

  public Formulario estiloDeAprendizaje(NivelCompetencia estiloDeAprendizaje) {
    setEstiloDeAprendizaje(estiloDeAprendizaje);
    return this;
  }

  public Formulario orientacionAlLogro(NivelCompetencia orientacionAlLogro) {
    setOrientacionAlLogro(orientacionAlLogro);
    return this;
  }

  public Formulario capacidadDeCompromiso(NivelCompetencia capacidadDeCompromiso) {
    setCapacidadDeCompromiso(capacidadDeCompromiso);
    return this;
  }

  public Formulario manejoDeSistemas(Manejo manejoDeSistemas) {
    setManejoDeSistemas(manejoDeSistemas);
    return this;
  }

  public Formulario equipoYConectividadOptima(Boolean equipoYConectividadOptima) {
    setEquipoYConectividadOptima(equipoYConectividadOptima);
    return this;
  }

  public Formulario riesgoDeDesercion(String riesgoDeDesercion) {
    setRiesgoDeDesercion(riesgoDeDesercion);
    return this;
  }

  public Formulario anotacionPsicosocial(String anotacionPsicosocial) {
    setAnotacionPsicosocial(anotacionPsicosocial);
    return this;
  }

  public Formulario alertaPsicosocial(String alertaPsicosocial) {
    setAlertaPsicosocial(alertaPsicosocial);
    return this;
  }

  public Formulario tieneElPerfil(EstadoPerfil tieneElPerfil) {
    setTieneElPerfil(tieneElPerfil);
    return this;
  }

  public Formulario comentario(String comentario) {
    setComentario(comentario);
    return this;
  }

  public Formulario entrevistas(Entrevista entrevistas) {
    setEntrevistas(entrevistas);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Formulario)) {
      return false;
    }
    Formulario formulario = (Formulario) o;
    return Objects.equals(id, formulario.id) && Objects.equals(puntajeTestGorilla, formulario.puntajeTestGorilla)
        && Objects.equals(eneagrama, formulario.eneagrama) && Objects.equals(cohorte, formulario.cohorte)
        && Objects.equals(cooperante, formulario.cooperante) && Objects.equals(backgroundIT, formulario.backgroundIT)
        && Objects.equals(idiomas, formulario.idiomas)
        && Objects.equals(profesionEducacion, formulario.profesionEducacion)
        && Objects.equals(estudioActual, formulario.estudioActual)
        && Objects.equals(trabajoActual, formulario.trabajoActual)
        && Objects.equals(disponibilidadDeTiempo, formulario.disponibilidadDeTiempo)
        && Objects.equals(intereses, formulario.intereses)
        && Objects.equals(experienciaLaboral, formulario.experienciaLaboral)
        && Objects.equals(aspiracionProyectoDeVida, formulario.aspiracionProyectoDeVida)
        && Objects.equals(redDeApoyo, formulario.redDeApoyo)
        && Objects.equals(trabajoEnEquipo, formulario.trabajoEnEquipo)
        && Objects.equals(comunicacionAsertiva, formulario.comunicacionAsertiva)
        && Objects.equals(respetoPorLaDiversidad, formulario.respetoPorLaDiversidad)
        && Objects.equals(manejoDeEmociones, formulario.manejoDeEmociones)
        && Objects.equals(autogestion, formulario.autogestion)
        && Objects.equals(manejoDeTiempo, formulario.manejoDeTiempo)
        && Objects.equals(estiloDeAprendizaje, formulario.estiloDeAprendizaje)
        && Objects.equals(orientacionAlLogro, formulario.orientacionAlLogro)
        && Objects.equals(capacidadDeCompromiso, formulario.capacidadDeCompromiso)
        && Objects.equals(manejoDeSistemas, formulario.manejoDeSistemas)
        && Objects.equals(equipoYConectividadOptima, formulario.equipoYConectividadOptima)
        && Objects.equals(riesgoDeDesercion, formulario.riesgoDeDesercion)
        && Objects.equals(anotacionPsicosocial, formulario.anotacionPsicosocial)
        && Objects.equals(alertaPsicosocial, formulario.alertaPsicosocial)
        && Objects.equals(tieneElPerfil, formulario.tieneElPerfil) && Objects.equals(comentario, formulario.comentario)
        && Objects.equals(entrevistas, formulario.entrevistas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, puntajeTestGorilla, eneagrama, cohorte, cooperante, backgroundIT, idiomas,
        profesionEducacion, estudioActual, trabajoActual, disponibilidadDeTiempo, intereses, experienciaLaboral,
        aspiracionProyectoDeVida, redDeApoyo, trabajoEnEquipo, comunicacionAsertiva, respetoPorLaDiversidad,
        manejoDeEmociones, autogestion, manejoDeTiempo, estiloDeAprendizaje, orientacionAlLogro, capacidadDeCompromiso,
        manejoDeSistemas, equipoYConectividadOptima, riesgoDeDesercion, anotacionPsicosocial, alertaPsicosocial,
        tieneElPerfil, comentario, entrevistas);
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", puntajeTestGorilla='" + getPuntajeTestGorilla() + "'" +
        ", eneagrama='" + getEneagrama() + "'" +
        ", cohorte='" + getCohorte() + "'" +
        ", cooperante='" + getCooperante() + "'" +
        ", backgroundIT='" + getBackgroundIT() + "'" +
        ", idiomas='" + getIdiomas() + "'" +
        ", profesionEducacion='" + getProfesionEducacion() + "'" +
        ", estudioActual='" + getEstudioActual() + "'" +
        ", trabajoActual='" + getTrabajoActual() + "'" +
        ", disponibilidadDeTiempo='" + getDisponibilidadDeTiempo() + "'" +
        ", intereses='" + getIntereses() + "'" +
        ", experienciaLaboral='" + getExperienciaLaboral() + "'" +
        ", aspiracionProyectoDeVida='" + getAspiracionProyectoDeVida() + "'" +
        ", redDeApoyo='" + getRedDeApoyo() + "'" +
        ", trabajoEnEquipo='" + getTrabajoEnEquipo() + "'" +
        ", comunicacionAsertiva='" + getComunicacionAsertiva() + "'" +
        ", respetoPorLaDiversidad='" + getRespetoPorLaDiversidad() + "'" +
        ", manejoDeEmociones='" + getManejoDeEmociones() + "'" +
        ", autogestion='" + getAutogestion() + "'" +
        ", manejoDeTiempo='" + getManejoDeTiempo() + "'" +
        ", estiloDeAprendizaje='" + getEstiloDeAprendizaje() + "'" +
        ", orientacionAlLogro='" + getOrientacionAlLogro() + "'" +
        ", capacidadDeCompromiso='" + getCapacidadDeCompromiso() + "'" +
        ", manejoDeSistemas='" + getManejoDeSistemas() + "'" +
        ", equipoYConectividadOptima='" + isEquipoYConectividadOptima() + "'" +
        ", riesgoDeDesercion='" + getRiesgoDeDesercion() + "'" +
        ", anotacionPsicosocial='" + getAnotacionPsicosocial() + "'" +
        ", alertaPsicosocial='" + getAlertaPsicosocial() + "'" +
        ", tieneElPerfil='" + getTieneElPerfil() + "'" +
        ", comentario='" + getComentario() + "'" +
        ", entrevistas='" + getEntrevistas() + "'" +
        "}";
  }

}
