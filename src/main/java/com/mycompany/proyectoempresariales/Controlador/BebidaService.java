
package com.mycompany.proyectoempresariales.Controlador;
import  com.mycompany.proyectoempresariales.Modelo.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Andres
 */
public class BebidaService {
    //Creacion de la coleccion de bebidas disponibles a despacho
    private static List<Bebida> Bebidas = new ArrayList();
    
    //Metodo de agregacion 
    public static Bebida addBebidas(Bebida bebida){
        Bebidas.add(bebida);
        return bebida;
    }
    //Metodo de busqueda general
    public static Bebida BuscarBebida(int Codigo){
        for(Bebida b: Bebidas){
            if(b.getCodigo()== Codigo)
                return b;
        }
        return null;
    }
    //Metodo de listar TODO
    public static List<Bebida> listarBebidas(){
    return Bebidas;
}
    //Metodo de listar SOLO GASEOSAS
    public static List<Gaseosa> listarGaseosas(){
        List<Gaseosa> gaseosas = new ArrayList();
        for(Bebida b: Bebidas){
            if(b instanceof Gaseosa){
             gaseosas.add((Gaseosa) b);
        }
        }
        return gaseosas;
    }
    //Metodo de listar SOLO LICORES
    public static List<Alcoholica> listarLicores(){
        List<Alcoholica> alcoholica = new ArrayList();
        for(Bebida b: Bebidas){
            if(b instanceof Alcoholica){
             alcoholica.add((Alcoholica) b);
        }
        }
        return alcoholica;
    }
    //Metodo de eliminacion del sistema
    public static void EliminardelSistema(int Codigo){
        Bebida b = BuscarBebida(Codigo);
        b.setStock(0);
        b.setEstado("Sin Stock");
    }
    //Calcular Ganancia de venta x Stock
    public static double ganancia(Bebida b){
        double Ganancia = 0;
        Ganancia = b.calcularValorFinal()*b.getStock();
        return Ganancia;
    }
    
    
}
