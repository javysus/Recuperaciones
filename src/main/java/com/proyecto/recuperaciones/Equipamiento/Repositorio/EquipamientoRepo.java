package com.proyecto.recuperaciones.Equipamiento.Repositorio;

import java.io.Serializable;
import java.util.Optional;
import java.util.List;

import com.proyecto.recuperaciones.Equipamiento.Modelos.Equipamiento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface EquipamientoRepo extends JpaRepository<Equipamiento, Serializable>{
    public abstract List<Equipamiento> findByIdSala(long idsala);

    public abstract List<Equipamiento> findAll();

    Optional <Equipamiento> findById(long Id);
    
    @Transactional
    void deleteById(long id);
}