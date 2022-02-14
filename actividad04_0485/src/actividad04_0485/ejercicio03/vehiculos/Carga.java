/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad04_0485.ejercicio03.vehiculos;

/**
 *
 * @author carlo
 */
public class Carga extends Vehiculo {

    double PMA;

    public Carga(double PMA, String matricula, String modelo, int numPlazas, int diasAlquila) {
        super(matricula, modelo, numPlazas, diasAlquila);
        this.PMA = PMA;
    }

    @Override
    public double getPrecioTotalAlquilerPorDias() {
        double calc = PMA * 1.5;

        double total = super.getprecioBaseAlquilerDia() + calc;
        return total; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Vehiculo " + "matricula=" + super.getMatricula() + ", modelo=" + super.getModelo() + ", numPlazas=" + super.getNumPlazas() + ", diasAlquila= " + super.getDiasAlquila() + " Carga " + " PMA= " + PMA + "  precio total alquiler " + getPrecioTotalAlquilerPorDias();
    }

}
