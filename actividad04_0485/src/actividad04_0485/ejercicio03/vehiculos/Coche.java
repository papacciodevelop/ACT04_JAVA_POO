/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad04_0485.ejercicio03.vehiculos;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Coche extends Vehiculo {

    private static final char[] gamaCoche = new char[]{'A', 'B', 'C', 'D'};
    private char gamaseleccionada;

    public Coche(String matricula, String modelo, int numPlazas, int diasAlquila, char gamaseleccionada) {
        super(matricula, modelo, numPlazas, diasAlquila);
        this.gamaseleccionada = gamaseleccionada;
    }

    @Override
    public double getPrecioTotalAlquilerPorDias() {
        double precioPordia = 1.5;
        double totaldiaAlquiler = super.getDiasAlquila() * precioPordia;
        double totalplazaaquiler = super.getNumPlazas() * precioPordia;
        double result = totaldiaAlquiler + totalplazaaquiler;
        return result;

    }

    @Override
    public void pideDatos() {

        try {

            super.pideDatos();

            //CATEGORIA DEL VEHICULO
            System.out.println("Introduce la categoría del vehiculo A -B -C -D ");
            Scanner cat = new Scanner(System.in); //Se crea el lector          
            char catTeclado = cat.next().charAt(0);//nos aseguramos de leer soloun caracter
            for (int i = 0; i < gamaCoche.length; i++) {
                if (gamaCoche[i] == catTeclado) {
                    System.out.println(gamaCoche[i]);
                    gamaseleccionada = catTeclado;
                } else {
                    System.out.println("No coincide con la gama");
                }
            }

        } catch (Exception e) {
            System.out.println("Algún dato es erroneo.");
        }

    }

    @Override
    public String toString() {

        return "Vehiculo " + "matricula=" + super.getMatricula() + ", modelo=" + super.getModelo() + ", Plazas=" + super.getNumPlazas() + ", dias Alquila=" + super.getDiasAlquila() + " precio " + getPrecioTotalAlquilerPorDias() + " Gama del coche  -" + gamaseleccionada;

    }

}
