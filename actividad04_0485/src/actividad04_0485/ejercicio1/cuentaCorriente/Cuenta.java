/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad04_0485.ejercicio1.cuentaCorriente;

import java.io.IOException;

/**
 *
 * @author carlo
 */
public class Cuenta {
    int numeroCuenta;
    double saldo;
    String titular;

    
    
    /**
     * CONSTRUCTOR
     * @param numeroCuenta
     * @param saldo
     * @param titular 
     */
    public Cuenta(int numeroCuenta, double saldo, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    /**
     * GETTERS Y SETERS
     * @return 
     */
    public int getNumeroCuenta() throws IOException {
       numeroCuenta = Utilidades.pideEntero(titular);
        
        return numeroCuenta;
    }

    public double getSaldo() throws IOException {
        saldo = Utilidades.pideDouble(titular);
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    

    
    
}
