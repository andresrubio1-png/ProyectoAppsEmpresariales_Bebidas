/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoempresariales.Modelo;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class Proveedor {

    private int Codigo;
    private String Nombre;
    private String Telefono;
    private String Estado;
    private List<Gaseosa> Gaseosas = new ArrayList<>();

    public Proveedor(int Codigo, String Nombre, String Telefono) throws Exception {
        setCodigo(Codigo);
        this.Nombre = Nombre;
        this.Telefono = Telefono;
    }

    public void setCodigo(int Codigo) throws Exception {
        if (Codigo < 1) {
            throw new Exception("Código no válido!");
        }
        this.Codigo = Codigo;
    }
}