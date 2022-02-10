/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad04_0485.ejercicio1.cuentaCorriente;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class TestCuenta {

    public static void main(String[] args) throws IOException {

        Cuenta[] cuentas = new Cuenta[3];
        cuentas[0] = new Cuenta(200, 1200.98, "Jose Ignaco");
        cuentas[1] = new Cuenta(400, 650.23, "Luis Gutierrez");
        cuentas[2] = new Cuenta(600, 4350.23, "Raluka Petresku");
        int valorSalida = 0;
        
        
        do{
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Ingresar dinero");
        System.out.println("3 - Sacar dinero");
        System.out.println("4 - Realizar transferencia");

        Scanner br = new Scanner(System.in); //Se crea el lector          
        int valortecladoanadido = br.nextInt();

        switch (valortecladoanadido) {

            case 1:

                ConsultaSaldo(cuentas);
                break;

            case 2:
                 IngresarDinero(cuentas);
                break;

            case 3:
                   SacarDinero(cuentas);
                break;

            case 4:
                TransferenciaDinero(cuentas);
                break;
            case 5:
                valorSalida = 1;
                break;

        }
        
        }while(valorSalida == 0);

    }

    //Consultar saldo
    public static void ConsultaSaldo(Cuenta cuentas[]) {

        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("Numero de cuenta: "+ cuentas[i].numeroCuenta);
        }
        
        System.out.println("Introduce la cuenta");
        Scanner br = new Scanner(System.in); //Se crea el lector          
        int valortecladoanadido = br.nextInt();

        for (int i = 0; i < cuentas.length; i++) {
           
            if (valortecladoanadido == cuentas[i].numeroCuenta) {
                System.out.println("El saldo es: " + cuentas[i].saldo);
            }

        }

    }
    
    //ingresar dinero
     public static void IngresarDinero(Cuenta cuentas[]) {
     
         for (int i = 0; i < cuentas.length; i++) {
            System.out.println("Numero de cuenta: "+ cuentas[i].numeroCuenta);
        }       
        System.out.println("Introduce la cuenta");
        Scanner br = new Scanner(System.in); //Se crea el lector          
        int valortecladoanadido = br.nextInt();
        System.out.println("Introduce la cantidad a ingresar:");
        Scanner tecladoCuenta = new Scanner(System.in); //Se crea el lector          
        double valorCambiar = tecladoCuenta.nextDouble();
        
        
        for (int i = 0; i < cuentas.length; i++) {
           
            if (valortecladoanadido == cuentas[i].numeroCuenta) {
                 System.out.println("El  saldo  es: " + cuentas[i].saldo);
                System.out.println("El nuevo saldo es: " + (cuentas[i].saldo+valorCambiar));
            }

        }
     }
     
     
     //sacar dinero
         public static void SacarDinero(Cuenta cuentas[]) {
     
         for (int i = 0; i < cuentas.length; i++) {
            System.out.println("Numero de cuenta: "+ cuentas[i].numeroCuenta);
        }       
        System.out.println("Introduce la cuenta");
        Scanner br = new Scanner(System.in); //Se crea el lector          
        int valortecladoanadido = br.nextInt();
        System.out.println("Introduce la cantidad a retirar:");
        Scanner tecladoCuenta = new Scanner(System.in); //Se crea el lector          
        double valorCambiar = tecladoCuenta.nextDouble();
        
        
        for (int i = 0; i < cuentas.length; i++) {
           
            if (valortecladoanadido == cuentas[i].numeroCuenta) {
                 System.out.println("El  saldo  es: " + cuentas[i].saldo);
                System.out.println("El nuevo saldo es: " + (cuentas[i].saldo-valorCambiar));
            }

        }

     }
    
    
     //sacar dinero
         public static void TransferenciaDinero(Cuenta cuentas[]) {
     
         double cantidadTraspaso;
         for (int i = 0; i < cuentas.length; i++) {
            System.out.println("Numero de cuenta: "+ cuentas[i].numeroCuenta);
        }       
        System.out.println("Introduce la cuenta desde donde quiere hacer la transferencia");
        Scanner br = new Scanner(System.in); //Se crea el lector          
        int valortecladoanadido = br.nextInt();
        
        System.out.println("Introduce la cantidad a retirar:");
        Scanner tecladoCuenta = new Scanner(System.in); //Se crea el lector          
        double valorcantidadRetirada = tecladoCuenta.nextDouble();
        
        System.out.println("Introduce la cuenta donde hacer el ingreso:");
        Scanner tecladoCuentaingreso = new Scanner(System.in); //Se crea el lector          
        double valorCambiar = tecladoCuentaingreso.nextDouble();
        
        for (int i = 0; i < cuentas.length; i++) {
           
            if (valortecladoanadido == cuentas[i].numeroCuenta) {
                
                System.out.println("El  saldo  es: " + cuentas[i].saldo);
                System.out.println("El nuevo saldo es: " + (cuentas[i].saldo-valorcantidadRetirada));
            }

            if(valorCambiar == cuentas[i].numeroCuenta){
                System.out.println("Valores cuentas donde se realizan los ingresos ");
             System.out.println("En la cuenta "+valorCambiar+ " El  saldo  es: " + cuentas[i].saldo);
             System.out.println("El nuevo saldo es: " + (cuentas[i].saldo+valorcantidadRetirada));
            
            }
            
            
            
        }

     }
    
    
    
    
    

}
