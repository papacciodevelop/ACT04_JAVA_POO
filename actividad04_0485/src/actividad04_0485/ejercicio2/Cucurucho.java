/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad04_0485.ejercicio2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Cucurucho extends Comida {

    SaborHelado[] saborhelado = new SaborHelado[1];

    public Cucurucho(String Nombbre, double Precio, double kcal, SaborHelado[] saborhelado) {
        super(Nombbre, Precio, kcal);
        this.saborhelado = saborhelado;
    }


    @Override
    public String toString() {  
       
       String dat1 = " Nombre " + Nombbre + kcal + " kcal " + " Precio: " + Precio + "€"  +"\n ";
       List<SaborHelado> dat2 = Arrays.asList(saborhelado);
       // NO CONSIGO SACAR EL LISTADO ENUMERADO DEL ARRAY 
      
        return dat1 +dat2 ;

    }

    public void addBolaHelado(SaborHelado sabor) {
        System.out.println("Cantidad de bolas que puedes añadir" + saborhelado.length);
        System.out.println("¿En que posición deseas añadir?" + saborhelado.length);
        Scanner br = new Scanner(System.in); //Se crea el lector          
        int valortecladoanadido = br.nextInt();
        for (int i = 0; i < saborhelado.length; i++) {

            if (i == valortecladoanadido) {
                saborhelado[i] = sabor;

            } else {
                System.out.println("Esa posicion no es correcta");

            }

        }

    }

    public double calculaPrecioTotal() {
        double valorTotal = 0;
        for (int i = 0; i < saborhelado.length; i++) {
            valorTotal += saborhelado[i].Precio;

        }
        valorTotal += getPrecio();

        return valorTotal;
    }

}
