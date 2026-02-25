package com.mycompany.proyectoempresariales.Modelo;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author Andres
 */
@Data
public class Gaseosa extends Bebida{
    //Variable Global
    private static double ImpuestoAzucar = 0.2;
    private double CantidadGas;
    private String Sabor;
    private int Calorias;
    private boolean Retornable;
    // Constructores

    public Gaseosa(double CantidadGas,String Sabor,int Calorias,boolean Retornable,int Codigo, String Nombre,
            double Volumen, double Precio, int Stock, double CantidadAzucar, String TipoEnvase, Date FechaVencimiento,String Estado) throws Exception {
        super(Codigo, Nombre, Volumen, Precio, Stock, CantidadAzucar, TipoEnvase, FechaVencimiento,Estado);
        setCantidadGas(CantidadGas);
        this.Sabor=Sabor;
        setCalorias(Calorias);
        this.Retornable = Retornable;
        
    }
    public boolean getRetornable(){
        return Retornable;
    }
    //Verificar que la cantidad de gas sea mayor a 0
    public void setCantidadGas(double CantidadGas) throws Exception{
        if(CantidadGas<0){
            throw new Exception("Bebida no válida!");
        }
        this.CantidadGas = CantidadGas;
    }
    //Verificar que las calorias sean mayor a 0
    public void setCalorias(int Calorias) throws Exception{
        if(Calorias < 0){
            throw new Exception("Bebida no válida!");
        }
         this.Calorias = Calorias;   
    }
    
    //Metodos
    @Override
    public double calcularValorFinal() {
       double precio = getPrecioProduccion();
       if(getCantidadAzucar()> 9){ //Si la cantidad de gramos de azucar es mayor a 9g se aplica el impuesto de azucar
           precio += (precio*ImpuestoBebida)+
                   ((precio*ImpuestoAzucar)); 
       }
       else
           precio += (precio*ImpuestoBebida);
       return precio;
       
    }

    @Override
    public String getTipo() {
        return "Gaseosa";
    }



    
}
