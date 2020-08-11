package com.proyecto.recuperaciones.CamaRecuperacion.Servicio;

import java.io.Serializable;
import java.util.Optional;
import java.util.List;

import com.proyecto.recuperaciones.CamaRecuperacion.Modelos.CamaRecuperacion;
import com.proyecto.recuperaciones.CamaRecuperacion.Repositorio.CamaRecuperacionRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Service;

@Service
public class CamaRecuperacionService{
    @Autowired
    CamaRecuperacionRepo repositorio;

    public boolean crear(CamaRecuperacion cama){
        try{
            repositorio.save(cama);
            return true;
        } catch(Exception e){
            return false;
        }
    }

    public boolean actualizar(CamaRecuperacion cama){
        try{
            repositorio.save(cama);
            return true;
        } catch(Exception e){
            return false;
        }
    }

    public List<CamaRecuperacion> obtenerDisponibles(){
        return repositorio.findByDisponibleTrue();
    }

    public List<CamaRecuperacion> obtenerNoDisponibles(){
        return repositorio.findByDisponibleFalse();
    }

    public List<CamaRecuperacion> obtenerCamas(long sala, boolean disponibilidad){
        return repositorio.findByIdSalaAndDisponible(sala, disponibilidad);
    }

    public Optional<CamaRecuperacion> obtenerCamaPaciente(Integer idPaciente){
        return repositorio.findByIdPaciente(idPaciente);
    }

    public Optional<CamaRecuperacion> obtenerCama(long id){
        return repositorio.findById(id));
    }
}