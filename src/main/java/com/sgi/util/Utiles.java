/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgi.util;

import com.sgi.controladores.AbstractControlador;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author RyuujiMD
 */
public class Utiles {

    public static boolean mensajeConfirmacion(Component padre, int tipoMensaje, String nombre) {
        String mensaje;
        if (nombre == null) {
            nombre = "";
        } else {
            nombre = nombre + " ";
        }
        switch (tipoMensaje) {
            case AbstractControlador.NUEVO:
                mensaje = "¿DESEA GUARDAR EL NUEVO ELEMENTO" + nombre + "?";
                break;
            case AbstractControlador.ELIMINAR:
                mensaje = "¿DESEA ELIMINAR EL ELEMENTO" + nombre + "?";
                break;
            case AbstractControlador.MODIFICAR:
                mensaje = "¿DESEA EDITAR EL ELEMENTO" + nombre + "?";
                break;
            default:
                return false;
        }
        return JOptionPane.showConfirmDialog(padre, mensaje, "MENSAJE DEL SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION;

    }
}
