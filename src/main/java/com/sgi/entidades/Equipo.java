package com.sgi.entidades;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public  class Equipo implements Serializable {


    @Column(unique=true,updatable=false,nullable=false,length=140)
    @Basic
    private String nombre;


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @Basic
    private String imagenUrl;


    @ManyToOne(targetEntity=TipoEquipo.class)
    private TipoEquipo tipoEquipo;

    public Equipo(){

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



   public String getImagenUrl() {
        return this.imagenUrl;
    }


  public void setImagenUrl (String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }



   public TipoEquipo getTipoEquipo() {
        return this.tipoEquipo;
    }


  public void setTipoEquipo (TipoEquipo tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }

}

