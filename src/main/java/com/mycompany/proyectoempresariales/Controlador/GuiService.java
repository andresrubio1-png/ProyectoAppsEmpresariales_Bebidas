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
public class GuiService implements IGuiService{
    private static GuiService guiService; //Singleton
    private  List <IGuiCambiable> guis = new ArrayList<>();
    private GuiService(){
    
    }
    public static GuiService getInstance(){
        if(guiService == null){
            guiService = new GuiService();
        }
        return guiService;
    }
    
    @Override
    public  void registrarGUI(IGuiCambiable gui){
        guis.add(gui);
    }
    @Override
    public  void eliminarGUI(IGuiCambiable gui){
        guis.remove(gui);
    } 
    @Override
   public  void cambioEnGUI(){
        for(IGuiCambiable gui : guis){
            gui.cambio();
        }
    }
}
