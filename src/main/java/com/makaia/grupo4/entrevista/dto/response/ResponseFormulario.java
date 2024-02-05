package com.makaia.grupo4.entrevista.dto.response;

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
import java.util.Objects;

public class ResponseFormulario {

    private Long id;

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

    private ResponseEntrevista entrevista;

    public ResponseFormulario() {
    }

    public ResponseFormulario(Long id, Float puntajeTestGorilla, Eneagrama eneagrama, String cohorte, String cooperante,
            BackgroundIT backgroundIT, Idiomas idiomas, String profesionEducacion, String estudioActual,
            String trabajoActual, DisponibilidadTiempo disponibilidadDeTiempo, List<Interes> intereses,
            ExperienciaLaboral experienciaLaboral, AspiracionProyectoDeVida aspiracionProyectoDeVida,
            RedDeApoyo redDeApoyo, NivelCompetencia trabajoEnEquipo, NivelCompetencia comunicacionAsertiva,
            NivelCompetencia respetoPorLaDiversidad, NivelCompetencia manejoDeEmociones, NivelCompetencia autogestion,
            NivelCompetencia manejoDeTiempo, NivelCompetencia estiloDeAprendizaje, NivelCompetencia orientacionAlLogro,
            NivelCompetencia capacidadDeCompromiso, Manejo manejoDeSistemas, Boolean equipoYConectividadOptima,
            String riesgoDeDesercion, String anotacionPsicosocial, String alertaPsicosocial, EstadoPerfil tieneElPerfil,
            String comentario, ResponseEntrevista entrevista) {
        this.id = id;
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
        this.entrevista = entrevista;
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

    public ResponseEntrevista getEntrevista() {
        return this.entrevista;
    }

    public void setEntrevista(ResponseEntrevista entrevista) {
        this.entrevista = entrevista;
    }

    public ResponseFormulario id(Long id) {
        setId(id);
        return this;
    }

    public ResponseFormulario puntajeTestGorilla(Float puntajeTestGorilla) {
        setPuntajeTestGorilla(puntajeTestGorilla);
        return this;
    }

    public ResponseFormulario eneagrama(Eneagrama eneagrama) {
        setEneagrama(eneagrama);
        return this;
    }

    public ResponseFormulario cohorte(String cohorte) {
        setCohorte(cohorte);
        return this;
    }

    public ResponseFormulario cooperante(String cooperante) {
        setCooperante(cooperante);
        return this;
    }

    public ResponseFormulario backgroundIT(BackgroundIT backgroundIT) {
        setBackgroundIT(backgroundIT);
        return this;
    }

    public ResponseFormulario idiomas(Idiomas idiomas) {
        setIdiomas(idiomas);
        return this;
    }

    public ResponseFormulario profesionEducacion(String profesionEducacion) {
        setProfesionEducacion(profesionEducacion);
        return this;
    }

    public ResponseFormulario estudioActual(String estudioActual) {
        setEstudioActual(estudioActual);
        return this;
    }

    public ResponseFormulario trabajoActual(String trabajoActual) {
        setTrabajoActual(trabajoActual);
        return this;
    }

    public ResponseFormulario disponibilidadDeTiempo(DisponibilidadTiempo disponibilidadDeTiempo) {
        setDisponibilidadDeTiempo(disponibilidadDeTiempo);
        return this;
    }

    public ResponseFormulario intereses(List<Interes> intereses) {
        setIntereses(intereses);
        return this;
    }

    public ResponseFormulario experienciaLaboral(ExperienciaLaboral experienciaLaboral) {
        setExperienciaLaboral(experienciaLaboral);
        return this;
    }

    public ResponseFormulario aspiracionProyectoDeVida(AspiracionProyectoDeVida aspiracionProyectoDeVida) {
        setAspiracionProyectoDeVida(aspiracionProyectoDeVida);
        return this;
    }

    public ResponseFormulario redDeApoyo(RedDeApoyo redDeApoyo) {
        setRedDeApoyo(redDeApoyo);
        return this;
    }

    public ResponseFormulario trabajoEnEquipo(NivelCompetencia trabajoEnEquipo) {
        setTrabajoEnEquipo(trabajoEnEquipo);
        return this;
    }

    public ResponseFormulario comunicacionAsertiva(NivelCompetencia comunicacionAsertiva) {
        setComunicacionAsertiva(comunicacionAsertiva);
        return this;
    }

    public ResponseFormulario respetoPorLaDiversidad(NivelCompetencia respetoPorLaDiversidad) {
        setRespetoPorLaDiversidad(respetoPorLaDiversidad);
        return this;
    }

    public ResponseFormulario manejoDeEmociones(NivelCompetencia manejoDeEmociones) {
        setManejoDeEmociones(manejoDeEmociones);
        return this;
    }

    public ResponseFormulario autogestion(NivelCompetencia autogestion) {
        setAutogestion(autogestion);
        return this;
    }

    public ResponseFormulario manejoDeTiempo(NivelCompetencia manejoDeTiempo) {
        setManejoDeTiempo(manejoDeTiempo);
        return this;
    }

    public ResponseFormulario estiloDeAprendizaje(NivelCompetencia estiloDeAprendizaje) {
        setEstiloDeAprendizaje(estiloDeAprendizaje);
        return this;
    }

    public ResponseFormulario orientacionAlLogro(NivelCompetencia orientacionAlLogro) {
        setOrientacionAlLogro(orientacionAlLogro);
        return this;
    }

    public ResponseFormulario capacidadDeCompromiso(NivelCompetencia capacidadDeCompromiso) {
        setCapacidadDeCompromiso(capacidadDeCompromiso);
        return this;
    }

    public ResponseFormulario manejoDeSistemas(Manejo manejoDeSistemas) {
        setManejoDeSistemas(manejoDeSistemas);
        return this;
    }

    public ResponseFormulario equipoYConectividadOptima(Boolean equipoYConectividadOptima) {
        setEquipoYConectividadOptima(equipoYConectividadOptima);
        return this;
    }

    public ResponseFormulario riesgoDeDesercion(String riesgoDeDesercion) {
        setRiesgoDeDesercion(riesgoDeDesercion);
        return this;
    }

    public ResponseFormulario anotacionPsicosocial(String anotacionPsicosocial) {
        setAnotacionPsicosocial(anotacionPsicosocial);
        return this;
    }

    public ResponseFormulario alertaPsicosocial(String alertaPsicosocial) {
        setAlertaPsicosocial(alertaPsicosocial);
        return this;
    }

    public ResponseFormulario tieneElPerfil(EstadoPerfil tieneElPerfil) {
        setTieneElPerfil(tieneElPerfil);
        return this;
    }

    public ResponseFormulario comentario(String comentario) {
        setComentario(comentario);
        return this;
    }

    public ResponseFormulario entrevista(ResponseEntrevista entrevista) {
        setEntrevista(entrevista);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ResponseFormulario)) {
            return false;
        }
        ResponseFormulario responseFormulario = (ResponseFormulario) o;
        return Objects.equals(id, responseFormulario.id)
                && Objects.equals(puntajeTestGorilla, responseFormulario.puntajeTestGorilla)
                && Objects.equals(eneagrama, responseFormulario.eneagrama)
                && Objects.equals(cohorte, responseFormulario.cohorte)
                && Objects.equals(cooperante, responseFormulario.cooperante)
                && Objects.equals(backgroundIT, responseFormulario.backgroundIT)
                && Objects.equals(idiomas, responseFormulario.idiomas)
                && Objects.equals(profesionEducacion, responseFormulario.profesionEducacion)
                && Objects.equals(estudioActual, responseFormulario.estudioActual)
                && Objects.equals(trabajoActual, responseFormulario.trabajoActual)
                && Objects.equals(disponibilidadDeTiempo, responseFormulario.disponibilidadDeTiempo)
                && Objects.equals(intereses, responseFormulario.intereses)
                && Objects.equals(experienciaLaboral, responseFormulario.experienciaLaboral)
                && Objects.equals(aspiracionProyectoDeVida, responseFormulario.aspiracionProyectoDeVida)
                && Objects.equals(redDeApoyo, responseFormulario.redDeApoyo)
                && Objects.equals(trabajoEnEquipo, responseFormulario.trabajoEnEquipo)
                && Objects.equals(comunicacionAsertiva, responseFormulario.comunicacionAsertiva)
                && Objects.equals(respetoPorLaDiversidad, responseFormulario.respetoPorLaDiversidad)
                && Objects.equals(manejoDeEmociones, responseFormulario.manejoDeEmociones)
                && Objects.equals(autogestion, responseFormulario.autogestion)
                && Objects.equals(manejoDeTiempo, responseFormulario.manejoDeTiempo)
                && Objects.equals(estiloDeAprendizaje, responseFormulario.estiloDeAprendizaje)
                && Objects.equals(orientacionAlLogro, responseFormulario.orientacionAlLogro)
                && Objects.equals(capacidadDeCompromiso, responseFormulario.capacidadDeCompromiso)
                && Objects.equals(manejoDeSistemas, responseFormulario.manejoDeSistemas)
                && Objects.equals(equipoYConectividadOptima, responseFormulario.equipoYConectividadOptima)
                && Objects.equals(riesgoDeDesercion, responseFormulario.riesgoDeDesercion)
                && Objects.equals(anotacionPsicosocial, responseFormulario.anotacionPsicosocial)
                && Objects.equals(alertaPsicosocial, responseFormulario.alertaPsicosocial)
                && Objects.equals(tieneElPerfil, responseFormulario.tieneElPerfil)
                && Objects.equals(comentario, responseFormulario.comentario)
                && Objects.equals(entrevista, responseFormulario.entrevista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, puntajeTestGorilla, eneagrama, cohorte, cooperante, backgroundIT, idiomas,
                profesionEducacion, estudioActual, trabajoActual, disponibilidadDeTiempo, intereses, experienciaLaboral,
                aspiracionProyectoDeVida, redDeApoyo, trabajoEnEquipo, comunicacionAsertiva, respetoPorLaDiversidad,
                manejoDeEmociones, autogestion, manejoDeTiempo, estiloDeAprendizaje, orientacionAlLogro,
                capacidadDeCompromiso, manejoDeSistemas, equipoYConectividadOptima, riesgoDeDesercion,
                anotacionPsicosocial, alertaPsicosocial, tieneElPerfil, comentario, entrevista);
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
                ", entrevista='" + getEntrevista() + "'" +
                "}";
    }

}
