/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sgi.controladores;


import com.sgi.entidades.Equipo;
import java.util.logging.Logger;

/**
 *
 * @author RyuujiMD
 */
public class EquipoControlador extends AbstractControlador<Equipo>{   

    public EquipoControlador() {
        super(Equipo.class);
    }
    private static final Logger LOG = Logger.getLogger(EquipoControlador.class.getName());
}
