/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoempresariales.Modelo;


import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Proveedor {

    private int Codigo;
    private String Nombre;
    private String Telefono;
    private String Estado;
    @Builder.Default
    private List<Gaseosa> Gaseosas = new ArrayList<>();

    public Proveedor(int Codigo, String Nombre, String Estado, String Telefono) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Estado = Estado;
        this.Telefono = Telefono;
        this.Gaseosas = new ArrayList<>();
    }



    public void setCodigo(int Codigo) throws Exception {
        if (Codigo < 1) {
            throw new Exception("Código no válido!");
        }
        this.Codigo = Codigo;
    }
}