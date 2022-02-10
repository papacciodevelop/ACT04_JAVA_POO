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
public class SaborHelado extends Comida{
    
       double porcentajeGrasa;
       String TipoEdulcorante;

    public SaborHelado(double porcentajeGrasa, String TipoEdulcorante, String Nombbre, double Precio, double kcal) {
        super(Nombbre, Precio, kcal);
        this.porcentajeGrasa = porcentajeGrasa;
        this.TipoEdulcorante = TipoEdulcorante;
    }

    @Override
    public String toString() {
       int count=0;
       
        return "bola-" + " Nombre: " + Nombbre+ ","+ kcal+" kcal "+ " Precio: "+Precio+" grasa:"+porcentajeGrasa+ " , "+" edulcorante:"+TipoEdulcorante +"\n";
    }
  
    
    
    
    
    
}
