package com.proyecto.recuperaciones.Equipamiento.Controladores;

import java.util.List;

import com.proyecto.recuperaciones.Equipamiento.Modelos.Equipamiento;
import com.proyecto.recuperaciones.Equipamiento.Servicio.EquipamientoService;

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
@CrossOrigin(origins = "*")
public class EquipamientoController{
    @Autowired
    EquipamientoService servicio;

    @PostMapping("/Equipamiento/Agregar")
    public boolean agregarEquipo(@RequestBody Equipamiento equipo){
        return servicio.crear(equipo);
    }

    @PutMapping("/Equipamiento/Actualizar")
    public boolean actualizarEquipo(@RequestBody Equipamiento equipo){
        return servicio.actualizar(equipo);
    }

    @DeleteMapping("/Equipamiento/Eliminar")
    public void eliminarEquipo(@RequestParam(name="id") long id){
        servicio.eliminar(id);
    }

    @GetMapping("/Equipamiento/Sala")
    public List<Equipamiento> obtenerPorSala(@RequestParam(name="idsala") long sala){
        return servicio.obtenerEquipoSala(sala);
    }

}