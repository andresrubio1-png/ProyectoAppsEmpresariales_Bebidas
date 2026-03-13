/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyectoempresariales.Controlador;

import com.mycompany.proyectoempresariales.Vista.IGuiCambiable;

/**
 *
 * @author andre
 */
public interface IGuiService {
    
    public  void registrarGUI(IGuiCambiable gui);
    public  void eliminarGUI(IGuiCambiable gui);
    public  void cambioEnGUI();
    
}
