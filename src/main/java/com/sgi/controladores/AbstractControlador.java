/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sgi.controladores;

import com.sgi.dao.DAO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RyuujiMD
 * @param <T>
 */
public abstract class AbstractControlador<T>{
    private final DAO<T> dao;
    public static final int NUEVO = 1;
    public static final int MODIFICAR = 2;
    public static final int ELIMINAR = 3;
    private T seleccionado;
    private final Class<T> seleccionadoClass;

    public T getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(T seleccionado) {
        this.seleccionado = seleccionado;
    }        

    public DAO<T> getDao() {
        return dao;
    }

    public AbstractControlador(Class<T> clase) {
        this.seleccionadoClass = clase;
        this.dao = new DAO<>(clase);
    }        

    private void guardar(T objeto) {
        this.dao.guardar(objeto);
    }

    private void modificar(T objeto) {
        this.dao.modificar(objeto);
    }

    private void eliminar(T objeto) {
        this.dao.eliminar(objeto);
    }
    
    public List<T> buscarTodos(){
        return this.dao.buscarTodos();
    }
    
    public T buscarPorId(Object id){
        return this.dao.buscarPorId(id);
    }
    
    public int conteo(){
        return this.dao.contar();
    }
    
    public void prepararCrear(){
        try {
            seleccionado = seleccionadoClass.newInstance();
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(AbstractControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void accion(int accion) {
        if (accion == AbstractControlador.NUEVO) {
            this.guardar(seleccionado);
        } else if (accion == AbstractControlador.MODIFICAR) {
            this.modificar(seleccionado);
        } else if (accion == AbstractControlador.ELIMINAR) {
            this.eliminar(seleccionado);
        }
    }
}
