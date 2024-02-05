package com.makaia.grupo4.entrevista.dto.request;

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

import java.util.List;
import java.util.Objects;

public class CreateFormulario {

    private Float puntajeTestGorilla;

    private Eneagrama eneagrama;

    private String cohorte;

    private String cooperante;

    private BackgroundIT backgroundIT;

    private Idiomas idiomas;

    private String profesionEducacion;

    private String estudioActual;

    private String trabajoActual;

    private DisponibilidadTiempo disponibilidadDeTiempo;

    private List<Interes> intereses;

    private ExperienciaLaboral experienciaLaboral;

    private AspiracionProyectoDeVida aspiracionProyectoDeVida;

    private RedDeApoyo redDeApoyo;

    private NivelCompetencia trabajoEnEquipo;

    private NivelCompetencia comunicacionAsertiva;

    private NivelCompetencia respetoPorLaDiversidad;

    private NivelCompetencia manejoDeEmociones;

    private NivelCompetencia autogestion;

    private NivelCompetencia manejoDeTiempo;

    private NivelCompetencia estiloDeAprendizaje;

    private NivelCompetencia orientacionAlLogro;

    private NivelCompetencia capacidadDeCompromiso;

    private Manejo manejoDeSistemas;

    private Boolean equipoYConectividadOptima;

    private String riesgoDeDesercion;

    private String anotacionPsicosocial;

    private String alertaPsicosocial;

    private EstadoPerfil tieneElPerfil;

    private String comentario;

    private Long entrevista_id;

    public CreateFormulario() {
    }

    public CreateFormulario(Float puntajeTestGorilla, Eneagrama eneagrama, String cohorte, String cooperante,
            BackgroundIT backgroundIT, Idiomas idiomas, String profesionEducacion, String estudioActual,
            String trabajoActual, DisponibilidadTiempo disponibilidadDeTiempo, List<Interes> intereses,
            ExperienciaLaboral experienciaLaboral, AspiracionProyectoDeVida aspiracionProyectoDeVida,
            RedDeApoyo redDeApoyo, NivelCompetencia trabajoEnEquipo, NivelCompetencia comunicacionAsertiva,
            NivelCompetencia respetoPorLaDiversidad, NivelCompetencia manejoDeEmociones, NivelCompetencia autogestion,
            NivelCompetencia manejoDeTiempo, NivelCompetencia estiloDeAprendizaje, NivelCompetencia orientacionAlLogro,
            NivelCompetencia capacidadDeCompromiso, Manejo manejoDeSistemas, Boolean equipoYConectividadOptima,
            String riesgoDeDesercion, String anotacionPsicosocial, String alertaPsicosocial, EstadoPerfil tieneElPerfil,
            String comentario, Long entrevista_id) {
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
        this.entrevista_id = entrevista_id;
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

    public Long getEntrevista_id() {
        return this.entrevista_id;
    }

    public void setEntrevista_id(Long entrevista_id) {
        this.entrevista_id = entrevista_id;
    }

    public CreateFormulario puntajeTestGorilla(Float puntajeTestGorilla) {
        setPuntajeTestGorilla(puntajeTestGorilla);
        return this;
    }

    public CreateFormulario eneagrama(Eneagrama eneagrama) {
        setEneagrama(eneagrama);
        return this;
    }

    public CreateFormulario cohorte(String cohorte) {
        setCohorte(cohorte);
        return this;
    }

    public CreateFormulario cooperante(String cooperante) {
        setCooperante(cooperante);
        return this;
    }

    public CreateFormulario backgroundIT(BackgroundIT backgroundIT) {
        setBackgroundIT(backgroundIT);
        return this;
    }

    public CreateFormulario idiomas(Idiomas idiomas) {
        setIdiomas(idiomas);
        return this;
    }

    public CreateFormulario profesionEducacion(String profesionEducacion) {
        setProfesionEducacion(profesionEducacion);
        return this;
    }

    public CreateFormulario estudioActual(String estudioActual) {
        setEstudioActual(estudioActual);
        return this;
    }

    public CreateFormulario trabajoActual(String trabajoActual) {
        setTrabajoActual(trabajoActual);
        return this;
    }

    public CreateFormulario disponibilidadDeTiempo(DisponibilidadTiempo disponibilidadDeTiempo) {
        setDisponibilidadDeTiempo(disponibilidadDeTiempo);
        return this;
    }

    public CreateFormulario intereses(List<Interes> intereses) {
        setIntereses(intereses);
        return this;
    }

    public CreateFormulario experienciaLaboral(ExperienciaLaboral experienciaLaboral) {
        setExperienciaLaboral(experienciaLaboral);
        return this;
    }

    public CreateFormulario aspiracionProyectoDeVida(AspiracionProyectoDeVida aspiracionProyectoDeVida) {
        setAspiracionProyectoDeVida(aspiracionProyectoDeVida);
        return this;
    }

    public CreateFormulario redDeApoyo(RedDeApoyo redDeApoyo) {
        setRedDeApoyo(redDeApoyo);
        return this;
    }

    public CreateFormulario trabajoEnEquipo(NivelCompetencia trabajoEnEquipo) {
        setTrabajoEnEquipo(trabajoEnEquipo);
        return this;
    }

    public CreateFormulario comunicacionAsertiva(NivelCompetencia comunicacionAsertiva) {
        setComunicacionAsertiva(comunicacionAsertiva);
        return this;
    }

    public CreateFormulario respetoPorLaDiversidad(NivelCompetencia respetoPorLaDiversidad) {
        setRespetoPorLaDiversidad(respetoPorLaDiversidad);
        return this;
    }

    public CreateFormulario manejoDeEmociones(NivelCompetencia manejoDeEmociones) {
        setManejoDeEmociones(manejoDeEmociones);
        return this;
    }

    public CreateFormulario autogestion(NivelCompetencia autogestion) {
        setAutogestion(autogestion);
        return this;
    }

    public CreateFormulario manejoDeTiempo(NivelCompetencia manejoDeTiempo) {
        setManejoDeTiempo(manejoDeTiempo);
        return this;
    }

    public CreateFormulario estiloDeAprendizaje(NivelCompetencia estiloDeAprendizaje) {
        setEstiloDeAprendizaje(estiloDeAprendizaje);
        return this;
    }

    public CreateFormulario orientacionAlLogro(NivelCompetencia orientacionAlLogro) {
        setOrientacionAlLogro(orientacionAlLogro);
        return this;
    }

    public CreateFormulario capacidadDeCompromiso(NivelCompetencia capacidadDeCompromiso) {
        setCapacidadDeCompromiso(capacidadDeCompromiso);
        return this;
    }

    public CreateFormulario manejoDeSistemas(Manejo manejoDeSistemas) {
        setManejoDeSistemas(manejoDeSistemas);
        return this;
    }

    public CreateFormulario equipoYConectividadOptima(Boolean equipoYConectividadOptima) {
        setEquipoYConectividadOptima(equipoYConectividadOptima);
        return this;
    }

    public CreateFormulario riesgoDeDesercion(String riesgoDeDesercion) {
        setRiesgoDeDesercion(riesgoDeDesercion);
        return this;
    }

    public CreateFormulario anotacionPsicosocial(String anotacionPsicosocial) {
        setAnotacionPsicosocial(anotacionPsicosocial);
        return this;
    }

    public CreateFormulario alertaPsicosocial(String alertaPsicosocial) {
        setAlertaPsicosocial(alertaPsicosocial);
        return this;
    }

    public CreateFormulario tieneElPerfil(EstadoPerfil tieneElPerfil) {
        setTieneElPerfil(tieneElPerfil);
        return this;
    }

    public CreateFormulario comentario(String comentario) {
        setComentario(comentario);
        return this;
    }

    public CreateFormulario entrevista_id(Long entrevista_id) {
        setEntrevista_id(entrevista_id);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CreateFormulario)) {
            return false;
        }
        CreateFormulario createFormulario = (CreateFormulario) o;
        return Objects.equals(puntajeTestGorilla, createFormulario.puntajeTestGorilla)
                && Objects.equals(eneagrama, createFormulario.eneagrama)
                && Objects.equals(cohorte, createFormulario.cohorte)
                && Objects.equals(cooperante, createFormulario.cooperante)
                && Objects.equals(backgroundIT, createFormulario.backgroundIT)
                && Objects.equals(idiomas, createFormulario.idiomas)
                && Objects.equals(profesionEducacion, createFormulario.profesionEducacion)
                && Objects.equals(estudioActual, createFormulario.estudioActual)
                && Objects.equals(trabajoActual, createFormulario.trabajoActual)
                && Objects.equals(disponibilidadDeTiempo, createFormulario.disponibilidadDeTiempo)
                && Objects.equals(intereses, createFormulario.intereses)
                && Objects.equals(experienciaLaboral, createFormulario.experienciaLaboral)
                && Objects.equals(aspiracionProyectoDeVida, createFormulario.aspiracionProyectoDeVida)
                && Objects.equals(redDeApoyo, createFormulario.redDeApoyo)
                && Objects.equals(trabajoEnEquipo, createFormulario.trabajoEnEquipo)
                && Objects.equals(comunicacionAsertiva, createFormulario.comunicacionAsertiva)
                && Objects.equals(respetoPorLaDiversidad, createFormulario.respetoPorLaDiversidad)
                && Objects.equals(manejoDeEmociones, createFormulario.manejoDeEmociones)
                && Objects.equals(autogestion, createFormulario.autogestion)
                && Objects.equals(manejoDeTiempo, createFormulario.manejoDeTiempo)
                && Objects.equals(estiloDeAprendizaje, createFormulario.estiloDeAprendizaje)
                && Objects.equals(orientacionAlLogro, createFormulario.orientacionAlLogro)
                && Objects.equals(capacidadDeCompromiso, createFormulario.capacidadDeCompromiso)
                && Objects.equals(manejoDeSistemas, createFormulario.manejoDeSistemas)
                && Objects.equals(equipoYConectividadOptima, createFormulario.equipoYConectividadOptima)
                && Objects.equals(riesgoDeDesercion, createFormulario.riesgoDeDesercion)
                && Objects.equals(anotacionPsicosocial, createFormulario.anotacionPsicosocial)
                && Objects.equals(alertaPsicosocial, createFormulario.alertaPsicosocial)
                && Objects.equals(tieneElPerfil, createFormulario.tieneElPerfil)
                && Objects.equals(comentario, createFormulario.comentario)
                && Objects.equals(entrevista_id, createFormulario.entrevista_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(puntajeTestGorilla, eneagrama, cohorte, cooperante, backgroundIT, idiomas,
                profesionEducacion, estudioActual, trabajoActual, disponibilidadDeTiempo, intereses, experienciaLaboral,
                aspiracionProyectoDeVida, redDeApoyo, trabajoEnEquipo, comunicacionAsertiva, respetoPorLaDiversidad,
                manejoDeEmociones, autogestion, manejoDeTiempo, estiloDeAprendizaje, orientacionAlLogro,
                capacidadDeCompromiso, manejoDeSistemas, equipoYConectividadOptima, riesgoDeDesercion,
                anotacionPsicosocial, alertaPsicosocial, tieneElPerfil, comentario, entrevista_id);
    }

    @Override
    public String toString() {
        return "{" +
                " puntajeTestGorilla='" + getPuntajeTestGorilla() + "'" +
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
                ", entrevista_id='" + getEntrevista_id() + "'" +
                "}";
    }

}
