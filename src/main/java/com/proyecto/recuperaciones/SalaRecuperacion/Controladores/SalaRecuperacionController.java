package com.proyecto.recuperaciones.SalaRecuperacion.Controladores;

import java.util.List;
import java.util.Optional;

import com.proyecto.recuperaciones.SalaRecuperacion.Modelos.SalaRecuperacion;
import com.proyecto.recuperaciones.SalaRecuperacion.Servicio.SalaRecuperacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
public class SalaRecuperacionController{
    @Autowired
    SalaRecuperacionService servicio;

    @GetMapping("/SalasRecup")
    public List<SalaRecuperacion> salasRecuperaciones(){
        return servicio.obtenerSalas();
    }

    @GetMapping("/SalasRecup/Disponibles")
    public List<SalaRecuperacion> salasConCamas(){
        return servicio.obtenerSalasConCamas();
    }

    @GetMapping("/SalasRecupFind")
    public Optional <SalaRecuperacion> getSala(@RequestParam(name = "id") long id){
        return servicio.obtenerSala(id);
    }

    @PutMapping("/SalasRecup/Actualizar")
    public boolean actualizarSala(@RequestBody SalaRecuperacion sala){
        return servicio.actualizar(sala);
    }

}