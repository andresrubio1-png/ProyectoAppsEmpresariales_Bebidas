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
    private List<Gaseosa> Gaseosas;

    // Colección de proveedores
    private static List<Proveedor> proveedores = new ArrayList<>();

    public Proveedor(int Codigo, String Nombre, String Telefono) throws Exception {
        setCodigo(Codigo);
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Gaseosas = new ArrayList<>();
    }

    public void setCodigo(int Codigo) throws Exception {
        if (Codigo < 1) {
            throw new Exception("Código no válido!");
        }
        this.Codigo = Codigo;
    }

    // Agregar gaseosa al proveedor
    public void agregarGaseosa(Gaseosa gaseosa) {
        if (gaseosa != null) {
            Gaseosas.add(gaseosa);
        }
    }

    // ===============================
    // OPERACIONES SOBRE PROVEEDORESS
    // ===============================

    // Crear proveedor
    public static void crearProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    // Eliminar proveedor
    public static boolean eliminarProveedor(int codigo) {
        return proveedores.removeIf(p -> p.getCodigo() == codigo);
    }

    // Listar proveedores
    public static List<Proveedor> listarProveedores() {
        return proveedores;
    }
}
