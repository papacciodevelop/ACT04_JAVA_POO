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
public class Comida {
    
    String Nombbre;
    double Precio;
    double kcal;

    
    /**
     * GETTERS Y SETTERS
     * @return 
     */
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

    @Override
    public String toString() {
        return  "Nombre: " + Nombbre + " , " +  kcal +"kcal" +  " , precio:" + Precio +"€" ;
    }

    public Comida(String Nombbre, double Precio, double kcal) {
        this.Nombbre = Nombbre;
        this.Precio = Precio;
        this.kcal = kcal;
    }

        
    
    
    
}
