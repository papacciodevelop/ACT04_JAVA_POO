/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad04_0485.ejercicio2;

/**
 *
 * @author carlo
 */
public class Horchata extends Comida{
    
    double cantidad;
    double porcentajeChufa;
  
 
    public Horchata(double cantidad, double porcentajeChufa, String Nombbre, double Precio, double kcal) {
        super(Nombbre, Precio, kcal);
        this.cantidad = cantidad;
        this.porcentajeChufa = porcentajeChufa;
    }

    @Override
    public String toString() {
        return "Nombre " + Nombbre +" "+ kcal+"kcal"+ " Precio: "+Precio + "€ "+" Cantidad: "+cantidad+" chufa: "+porcentajeChufa+"%";
    }

    
    
    
    
    
    
    
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPorcentajeChufa() {
        return porcentajeChufa;
    }

    public void setPorcentajeChufa(double porcentajeChufa) {
        this.porcentajeChufa = porcentajeChufa;
    }

    public String getNombbre() {
        return Nombbre;
    }

    public void setNombbre(String Nombbre) {
        this.Nombbre = Nombbre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public double getKcal() {
        return kcal;
    }

    public void setKcal(double kcal) {
        this.kcal = kcal;
    }
    
    
    
    
    
    
    
}
