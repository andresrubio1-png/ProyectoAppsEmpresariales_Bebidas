/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoempresariales.Controlador;

import com.mycompany.proyectoempresariales.Vista.IGuiCambiable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class GuiService {
    private static List <IGuiCambiable> guis = new ArrayList<>();
    
    public static void registrarGUI(IGuiCambiable gui){
        guis.add(gui);
    }
    
    public static void eliminarGUI(IGuiCambiable gui){
        guis.remove(gui);
    } 
    
   public static void cambioEnGUI(){
        for(IGuiCambiable gui : guis){
            gui.cambio();
        }
    }
}
