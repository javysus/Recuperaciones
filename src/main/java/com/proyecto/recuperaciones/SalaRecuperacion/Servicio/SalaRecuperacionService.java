package com.proyecto.recuperaciones.SalaRecuperacion.Servicio;

import java.io.Serializable;
import java.util.Optional;
import java.util.List;

import com.proyecto.recuperaciones.SalaRecuperacion.Modelos.SalaRecuperacion;
import com.proyecto.recuperaciones.SalaRecuperacion.Repositorio.SalaRecuperacionRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Service;

@Service
public class SalaRecuperacionService{
    @Autowired
    SalaRecuperacionRepo repositorio;

    public List<SalaRecuperacion> obtenerSalas(){
        return repositorio.findAll();
    }
}