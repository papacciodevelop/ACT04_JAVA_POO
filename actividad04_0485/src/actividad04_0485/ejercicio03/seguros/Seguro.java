/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad04_0485.ejercicio03.seguros;

import actividad04_0485.ejercicio03.vehiculos.IAlquilable;

/**
 *
 * @author carlo
 */
public class Seguro implements IAlquilable {

    private String NombreSeguro;
    private String Descripcion;
    private double PrecioAlquilerDia;
    private int NumDiasAlquila = 1;
    private static final double PrecioAlquilerSeguro = 10.50;

    @Override
    public String toString() {
        return "Seguro" + "  NombreSeguro=  " + NombreSeguro + ", Descripcion=  " + Descripcion + ", PrecioAlquilerDia= " + PrecioAlquilerDia + ", NumDiasAlquila= " + NumDiasAlquila + " PrecioAlquilerSeguro " + PrecioAlquilerSeguro;
    }

    public Seguro(String NombreSeguro, String Descripcion, double PrecioAlquilerDia, int NumDiasAlquila) {
        this.NombreSeguro = NombreSeguro;
        this.Descripcion = Descripcion;
        this.PrecioAlquilerDia = PrecioAlquilerDia;
        this.NumDiasAlquila = NumDiasAlquila;
    }

    public Seguro(String NombreSeguro, String Descripcion, double PrecioAlquilerDia) {
        this.NombreSeguro = NombreSeguro;
        this.Descripcion = Descripcion;
        this.PrecioAlquilerDia = PrecioAlquilerDia;
    }

    public String getNombreSeguro() {
        return NombreSeguro;
    }

    public void setNombreSeguro(String NombreSeguro) {
        this.NombreSeguro = NombreSeguro;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecioAlquilerDia() {
        return PrecioAlquilerDia;
    }

    public void setPrecioAlquilerDia(double PrecioAlquilerDia) {
        this.PrecioAlquilerDia = PrecioAlquilerDia;
    }

    public int getNumDiasAlquila() {
        return NumDiasAlquila;
    }

    public void setNumDiasAlquila(int NumDiasAlquila) {
        this.NumDiasAlquila = NumDiasAlquila;
    }

    @Override
    public double getPrecioTotalAlquilerPorDias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNumeroDias(int valor) {

        NumDiasAlquila = valor;
        System.out.println("Numero de días actualizado a " + NumDiasAlquila);

    }

}
