package com.proyecto.recuperaciones.CamaRecuperacion.Modelos;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="camarecuperacion")
public class CamaRecuperacion{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cama")
    private long id;

    @Column(name="id_sala")
    private long idSala;

    @Column(name="disponible", columnDefinition = "boolean default true")
    private boolean disponible = true;

    @Column(name="id_paciente")
    private Integer idPaciente;

    @Column(name="id_personalR")
    private Integer idPersonalR; 

    @Column(name="fechauso")
    private Date fecha;

    public CamaRecuperacion(){

    }

    public CamaRecuperacion(long id, long idSala, boolean disponible, Integer idPaciente, Integer idPersonalR, Date fecha) {
        this.id = id;
        this.idSala = idSala;
        this.disponible = disponible;
        this.idPaciente = idPaciente;
        this.idPersonalR = idPersonalR;
        this.fecha = fecha;
    }

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }

    public long getIdSala(){
        return idSala;
    }

    public void setIdSala(long idSala){
        this.idSala = idSala;
    }

    public boolean getDisponible(){
        return disponible;
    }

    public void setDisponible(boolean disponible){
        this.disponible= disponible;
    }

    public Integer getIdPaciente(){
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente){
        this.idPaciente = idPaciente;
    }

    public Integer getIdPersonalR(){
        return idPersonalR;
    }

    public void setIdPersonalR(Integer idPersonalR){
        this.idPersonalR = idPersonalR;
    }
    public Date getFechaUso(){
        return fecha;
    }

    public void setFechaUso(Date fecha){
        this.fecha = fecha;
    }
}