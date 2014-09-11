/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgi.main;

import com.sgi.vistas.Principal;
import javax.swing.UIManager;

/**
 *
 * @author RyuujiMD
 */
public class Main {

    public static void main(String[] args) {
//         System.setProperty(
//            "Quaqua.tabLayoutPolicy","wrap"
//
//         );
//
//         try {
//              UIManager.setLookAndFeel(ch.randelshofer.quaqua.QuaquaManager.getLookAndFeel());         
//         } catch (Exception e) {             
//         }
        try {
            UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
        } catch (Exception e) {
        }
        Principal prueba = new Principal();
        prueba.setVisible(true);
    }
}
