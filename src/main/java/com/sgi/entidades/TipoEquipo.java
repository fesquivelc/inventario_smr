package com.sgi.entidades;

import java.io.Serializable;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public  class TipoEquipo implements Serializable {


    @Column(unique=true,nullable=false,length=140)
    @Basic
    private String nombre;


    @Column(unique=true,nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @OneToMany(fetch=FetchType.LAZY,targetEntity=Equipo.class,mappedBy="tipoEquipo")
    private List<Equipo> equipos;


    @Column(length=140)
    @Basic
    private String descripcion;

    public TipoEquipo(){

    }


   public String getNombre() {
        return this.nombre;
    }


  public void setNombre (String nombre) {
        this.nombre = nombre;
    }



   public Long getId() {
        return this.id;
    }


  public void setId (Long id) {
        this.id = id;
    }



   public List<Equipo> getEquipos() {
        return this.equipos;
    }


  public void setEquipos (List<Equipo> equipos) {
        this.equipos = equipos;
    }



   public String getDescripcion() {
        return this.descripcion;
    }


  public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }

}

