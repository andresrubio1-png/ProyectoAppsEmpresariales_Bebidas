/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyectoempresariales.Controlador;

import com.mycompany.proyectoempresariales.Modelo.Alcoholica;
import com.mycompany.proyectoempresariales.Modelo.Bebida;
import com.mycompany.proyectoempresariales.Modelo.Gaseosa;
import java.util.List;

/**
 *
 * @author andre
 */
public interface IBebidaService {
    public  Bebida addBebidas(Bebida bebida);
    public Bebida BuscarBebida (int Codigo);
    public  List<Bebida> listarBebidas();
    public  List<Gaseosa> listarGaseosas();
    public  List<Alcoholica> listarLicores();
    public  void eliminardelSistema(Bebida b);
    public  double ganancia(Bebida b);
}
