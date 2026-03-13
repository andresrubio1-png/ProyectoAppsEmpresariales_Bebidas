package com.mycompany.proyectoempresariales.Controlador;

import com.mycompany.proyectoempresariales.Modelo.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andres
 * //PRUEBA NUMERO TRES OMG
 * PRUEBA CUATRO GG
 */
public class BebidaService implements IBebidaService{

    //Creacion de la coleccion de bebidas disponibles a despacho
    private static BebidaService bebidaService; //Singleton
    private static List<Bebida> Bebidas = new ArrayList(); 
    private BebidaService(){
    
    }
    public static BebidaService getInstance(){
        if(bebidaService == null){
            bebidaService = new BebidaService();
        }
        return bebidaService;
    }
    
    //Método de agregación 
    @Override
    public  Bebida addBebidas(Bebida bebida){
        Bebidas.add(bebida);
        GuiService.cambioEnGUI();
        return bebida;
    }

    //Metodo de busqueda general
    @Override
    public  Bebida BuscarBebida(int Codigo){
        for(Bebida b: Bebidas){
            if(b.getCodigo()== Codigo)
                return b;
        }
        return null;
    }

    //Metodo de listar TODO
    @Override
    public  List<Bebida> listarBebidas(){
        return Bebidas;
    }

    //Metodo de listar SOLO GASEOSAS
    @Override
    public  List<Gaseosa> listarGaseosas(){
        List<Gaseosa> gaseosas = new ArrayList();
        for(Bebida b: Bebidas){
            if(b instanceof Gaseosa){
                gaseosas.add((Gaseosa) b);
            }
        }
        return gaseosas;
    }

    //Metodo de listar SOLO LICORES
    @Override
    public  List<Alcoholica> listarLicores(){
        List<Alcoholica> alcoholica = new ArrayList();
        for(Bebida b: Bebidas){
            if(b instanceof Alcoholica){
                alcoholica.add((Alcoholica) b);
            }
        }
        return alcoholica;
    }

    //Metodo de eliminacion del sistema
    @Override
    public  void eliminardelSistema(Bebida b){
            b.setStock(0);
            b.setEstado("No disponible");
            GuiService.cambioEnGUI();
        
    }

    //Calcular Ganancia de venta x Stock
    @Override
    public  double ganancia(Bebida b){
        double Ganancia = 0;
        Ganancia = b.calcularValorFinal()*b.getStock();
        return Ganancia;
    }

}
    

