package com.makaia.grupo4.entrevista.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.makaia.grupo4.entrevista.services.Service;

@RestController
@RequestMapping("api/v1/entrevista")
public class Controller {

    @Autowired
    private Service service;

    
    
}
