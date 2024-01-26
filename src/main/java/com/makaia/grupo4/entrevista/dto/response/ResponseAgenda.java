package com.makaia.grupo4.entrevista.dto.response;

import java.util.Date;
import java.util.Objects;

public class ResponseAgenda {

    private Long id;

    private Date fecha;

    private boolean estado;

    private Long mentora_id;

    public ResponseAgenda() {
    }

    public ResponseAgenda(Long id, Date fecha, boolean estado, Long mentora_id) {
        this.id = id;
        this.fecha = fecha;
        this.estado = estado;
        this.mentora_id = mentora_id;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Long getMentora_id() {
        return this.mentora_id;
    }

    public void setMentora_id(Long mentora_id) {
        this.mentora_id = mentora_id;
    }

    public ResponseAgenda id(Long id) {
        setId(id);
        return this;
    }

    public ResponseAgenda fecha(Date fecha) {
        setFecha(fecha);
        return this;
    }

    public ResponseAgenda estado(boolean estado) {
        setEstado(estado);
        return this;
    }

    public ResponseAgenda mentora_id(Long mentora_id) {
        setMentora_id(mentora_id);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ResponseAgenda)) {
            return false;
        }
        ResponseAgenda responseAgenda = (ResponseAgenda) o;
        return Objects.equals(id, responseAgenda.id) && Objects.equals(fecha, responseAgenda.fecha)
                && estado == responseAgenda.estado && Objects.equals(mentora_id, responseAgenda.mentora_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, estado, mentora_id);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", fecha='" + getFecha() + "'" +
                ", estado='" + isEstado() + "'" +
                ", mentora_id='" + getMentora_id() + "'" +
                "}";
    }

}
