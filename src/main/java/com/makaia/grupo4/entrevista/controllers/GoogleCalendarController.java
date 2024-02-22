package com.makaia.grupo4.entrevista.controllers;

import java.io.IOException;
import java.security.GeneralSecurityException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.makaia.grupo4.entrevista.dto.request.CreateMeeting;
import com.makaia.grupo4.entrevista.services.GoogleCalendaService;

@RestController
@RequestMapping("api/v1/meet")
public class GoogleCalendarController {

    @Autowired
    GoogleCalendaService googleCalendaService;

    @PostMapping()
    public String getMeeting(@RequestBody CreateMeeting dto) throws IOException, GeneralSecurityException {
        return googleCalendaService.generateMeetLink(dto);
    }

}
