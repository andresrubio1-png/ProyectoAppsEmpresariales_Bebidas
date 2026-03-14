/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyectoempresariales.Controlador;

import com.mycompany.proyectoempresariales.Modelo.Gaseosa;
import com.mycompany.proyectoempresariales.Modelo.Proveedor;
import java.util.List;

/**
 *
 * @author andre
 */
public interface IProveedorService {
    public  void agregarGaseosa(Gaseosa gaseosa, Proveedor proveedor) throws Exception;
    public  void addProveedor(Proveedor proveedor) throws Exception;
    public void  updateProveedor(Proveedor proveedor,String nombre,String telefono,
        String estado);
    public  void eliminarProveedor(Proveedor proveedor);
    public  List<Proveedor> listarProveedores();
    public  Proveedor buscarProveedor(int codigo);
    
    
        
    
    
}
