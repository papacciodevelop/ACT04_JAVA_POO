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
public abstract class Vehiculo implements IAlquilable {

    private String matricula;
    private String modelo;
    private int numPlazas;
    private int diasAlquila = 0;
    private static final double precioBaseAlquilerDia = 50.0;

    public Vehiculo(String matricula, String modelo, int numPlazas, int diasAlquila) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.numPlazas = numPlazas;
        this.diasAlquila = diasAlquila;

    }

    public void pideDatos() {

        try {

            //MATRICULA
            System.out.println("Introduce la matricula");
            Scanner br = new Scanner(System.in); //Se crea el lector          
            String matriculaTeclado = br.next();
            matricula = matriculaTeclado;

            //MODELO
            System.out.println("Introduce modelo");
            Scanner mod = new Scanner(System.in); //Se crea el lector          
            String modTeclado = mod.next();
            modelo = modTeclado;

            //NUMERO DE PLAZAS 
            System.out.println("Introduce  numero de plazas");
            Scanner plaz = new Scanner(System.in); //Se crea el lector          
            int plazTeclado = plaz.nextInt();
            numPlazas = plazTeclado;

            //NUMERO DE DIAS DE ALQUILER 
            System.out.println("Introduce la numero de dias");
            Scanner alqui = new Scanner(System.in); //Se crea el lector          
            int alquiTeclado = alqui.nextInt();
            diasAlquila = alquiTeclado;

        } catch (Exception e) {
            System.out.println("Algún dato es erroneo.");
        }

    }

    @Override
    public double getPrecioTotalAlquilerPorDias() {
        double total = diasAlquila * precioBaseAlquilerDia;
        return total;

    }

    @Override
    public void setNumeroDias(int valor) {

        diasAlquila = valor;
        System.out.println("Numero de días actualizado a " + diasAlquila);

    }

    @Override
    public String toString() {
        return "Vehiculo  " + " matricula=" + matricula + ", modelo=" + modelo + ", Plazas=" + numPlazas + ", dias Alquila=" + diasAlquila + " precio " + precioBaseAlquilerDia;
    }

    /*
    GETTERS Y SETER
     */
    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public int getDiasAlquila() {
        return diasAlquila;
    }

    public void setDiasAlquila(int diasAlquila) {
        this.diasAlquila = diasAlquila;
    }

    public double getprecioBaseAlquilerDia() {
        return precioBaseAlquilerDia;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
