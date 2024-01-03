package com.makaia.grupo4.entrevista.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.makaia.grupo4.entrevista.models.Entrevista;
import com.makaia.grupo4.repositories.AspiranteRepository;
import com.makaia.grupo4.repositories.EntrevistaRepository;

public class Service {
    @Autowired
    EntrevistaRepository repository;

    @Autowired
    AspiranteRepository usuarioRepository;

}
