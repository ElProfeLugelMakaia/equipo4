package com.makaia.grupo4.entrevista.dto.request;

import java.util.Objects;

public class CreateEntrevista {

    private boolean asistida;

    private Long booking_id;

    private CreateMeeting meeting;

    public CreateEntrevista() {
    }

    public CreateEntrevista(boolean asistida, Long booking_id, CreateMeeting meeting) {
        this.asistida = asistida;
        this.booking_id = booking_id;
        this.meeting = meeting;
    }

    public boolean isAsistida() {
        return this.asistida;
    }

    public boolean getAsistida() {
        return this.asistida;
    }

    public void setAsistida(boolean asistida) {
        this.asistida = asistida;
    }

    public Long getBooking_id() {
        return this.booking_id;
    }

    public void setBooking_id(Long booking_id) {
        this.booking_id = booking_id;
    }

    public CreateMeeting getMeeting() {
        return this.meeting;
    }

    public void setMeeting(CreateMeeting meeting) {
        this.meeting = meeting;
    }

    public CreateEntrevista asistida(boolean asistida) {
        setAsistida(asistida);
        return this;
    }

    public CreateEntrevista booking_id(Long booking_id) {
        setBooking_id(booking_id);
        return this;
    }

    public CreateEntrevista meeting(CreateMeeting meeting) {
        setMeeting(meeting);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CreateEntrevista)) {
            return false;
        }
        CreateEntrevista createEntrevista = (CreateEntrevista) o;
        return asistida == createEntrevista.asistida && Objects.equals(booking_id, createEntrevista.booking_id)
                && Objects.equals(meeting, createEntrevista.meeting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asistida, booking_id, meeting);
    }

    @Override
    public String toString() {
        return "{" +
                " asistida='" + isAsistida() + "'" +
                ", booking_id='" + getBooking_id() + "'" +
                ", meeting='" + getMeeting() + "'" +
                "}";
    }

}
