package com.makaia.grupo4.entrevista.utils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class GenerateDates {

    public static List<LocalDateTime> obtenerFechasFebreroAgosto(int year) {
        List<LocalDateTime> fechas = new ArrayList<>();

        // Febrero
        LocalDate fechaFebrero = LocalDate.of(year, Month.FEBRUARY, 1);
        LocalDate finFebrero = fechaFebrero.withDayOfMonth(fechaFebrero.lengthOfMonth());
        agregarFechas(fechas, fechaFebrero, finFebrero);

        // Agosto
        LocalDate fechaAgosto = LocalDate.of(year, Month.AUGUST, 1);
        LocalDate finAgosto = fechaAgosto.withDayOfMonth(fechaAgosto.lengthOfMonth());
        agregarFechas(fechas, fechaAgosto, finAgosto);

        return fechas;
    }

    private static void agregarFechas(List<LocalDateTime> fechas, LocalDate inicio, LocalDate fin) {
        LocalDate fechaActual = inicio;

        while (!fechaActual.isAfter(fin)) {
            if (!esFinDeSemana(fechaActual)) {
                // Agregar fechas dentro del rango de horas
                agregarFechasHorario(fechas, fechaActual);
            }

            fechaActual = fechaActual.plusDays(1);
        }
    }

    private static void agregarFechasHorario(List<LocalDateTime> fechas, LocalDate fecha) {
        LocalTime horaInicio1 = LocalTime.of(8, 0);
        LocalTime horaFin1 = LocalTime.of(11, 0);
        LocalTime horaInicio2 = LocalTime.of(14, 0);
        LocalTime horaFin2 = LocalTime.of(16, 0);

        LocalDateTime fechaHoraInicio1 = LocalDateTime.of(fecha, horaInicio1);
        LocalDateTime fechaHoraFin1 = LocalDateTime.of(fecha, horaFin1);
        LocalDateTime fechaHoraInicio2 = LocalDateTime.of(fecha, horaInicio2);
        LocalDateTime fechaHoraFin2 = LocalDateTime.of(fecha, horaFin2);

        fechas.add(fechaHoraInicio1);
        fechas.add(fechaHoraFin1);
        fechas.add(fechaHoraInicio2);
        fechas.add(fechaHoraFin2);
    }

    private static boolean esFinDeSemana(LocalDate fecha) {
        DayOfWeek dayOfWeek = fecha.getDayOfWeek();
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }

    public static Date convertirADate(LocalDate localDate) {
        Instant instant = localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }
}
