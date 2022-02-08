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
                break;

            case 3:

                break;

            case 4:
                break;

        }

    }

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
    
    
     public static void IngresarDinero(Cuenta cuentas[]) {
     
         for (int i = 0; i < cuentas.length; i++) {
            System.out.println("Numero de cuenta: "+ cuentas[i].numeroCuenta);
        }
        
        System.out.println("Introduce la cuenta");
        Scanner br = new Scanner(System.in); //Se crea el lector          
        int valortecladoanadido = br.nextInt();

        for (int i = 0; i < cuentas.length; i++) {
           
            if (valortecladoanadido == cuentas[i].numeroCuenta) {
               // cuentas[i].saldo
                System.out.println("El saldo es: " + cuentas[i].saldo);
            }

        }
     
     
     
     }
    
    
    
    
    
    
    
    

}
