package com.proyecto.recuperaciones.Equipamiento.Servicio;

import java.io.Serializable;
import java.util.Optional;
import java.util.List;

import com.proyecto.recuperaciones.Equipamiento.Modelos.Equipamiento;
import com.proyecto.recuperaciones.Equipamiento.Repositorio.EquipamientoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Service;

@Service
public class EquipamientoService{
    @Autowired
    EquipamientoRepo repositorio;

    public boolean crear(Equipamiento equipo){
        try{
            repositorio.save(equipo);
            return true;
        } catch(Exception e){
            return false;
        }
    }

    public boolean actualizar(Equipamiento equipo){
        try{
            repositorio.save(equipo);
            return true;
        } catch(Exception e){
            return false;
        }
    }

    public void eliminar(long id){
        repositorio.deleteById(id);
    }

    public List<Equipamiento> obtenerEquipoSala(long sala){
        return repositorio.findByIdSala(sala);
    }

    public List<Equipamiento> getAll(){
        return repositorio.findAll();
    }
}