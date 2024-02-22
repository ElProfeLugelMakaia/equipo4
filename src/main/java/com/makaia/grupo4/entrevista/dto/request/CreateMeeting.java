package com.makaia.grupo4.entrevista.dto.request;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Objects;
import java.util.List;

public class CreateMeeting {
    private String summary;

    private String description;

    private List<String> participants;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime startDate;

    public CreateMeeting() {
    }

    public CreateMeeting(String summary, String description, List<String> participants, LocalDateTime startDate) {
        this.summary = summary;
        this.description = description;
        this.participants = participants;
        this.startDate = startDate;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getParticipants() {
        return this.participants;
    }

    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

    public LocalDateTime getStartDate() {
        return this.startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public CreateMeeting summary(String summary) {
        setSummary(summary);
        return this;
    }

    public CreateMeeting description(String description) {
        setDescription(description);
        return this;
    }

    public CreateMeeting participants(List<String> participants) {
        setParticipants(participants);
        return this;
    }

    public CreateMeeting startDate(LocalDateTime startDate) {
        setStartDate(startDate);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CreateMeeting)) {
            return false;
        }
        CreateMeeting createMeeting = (CreateMeeting) o;
        return Objects.equals(summary, createMeeting.summary) && Objects.equals(description, createMeeting.description)
                && Objects.equals(participants, createMeeting.participants)
                && Objects.equals(startDate, createMeeting.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(summary, description, participants, startDate);
    }

    @Override
    public String toString() {
        return "{" +
                " summary='" + getSummary() + "'" +
                ", description='" + getDescription() + "'" +
                ", participants='" + getParticipants() + "'" +
                ", startDate='" + getStartDate() + "'" +
                "}";
    }

}
