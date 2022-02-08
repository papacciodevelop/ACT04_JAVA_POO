/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad04_0485.ejercicio1.cuentaCorriente;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Utilidades {

    public static int pideEntero(String pregunta) throws IOException {

        boolean comprobador = false;
        int valorEntero = 0;
        int value = 0;
        do {
            System.out.println("El valor de entrada es: " + pregunta);
            System.out.println("Introduce un numero");
            Scanner sc = new Scanner(System.in);
            try {
                boolean valor = sc.hasNextInt();
                if (valor = false) {
                    throw new RuntimeException("solo valores enteros");

                } else {
                    value = sc.nextInt();
                    System.out.println("el valor introducidoes correcto" + value);
                    comprobador = true;
                }

            } catch (InputMismatchException e) {
                /*
			 * Pero si el usuario introduce algo que no es numérico, se sale del rango o no
			 * es la base deseada, atrapamos la excepción , lanzamos un mensaje y volvemos a repetir
                 */
                System.out.println("Ese valor no es válido");
                comprobador = false;
            }

        } while (comprobador == false);
        return value;
    }

    public static double pideDouble(String pregunta) throws IOException {

        boolean comprobador = false;
        String valorRecibido = pregunta;
        System.out.println("El valor del parametro introducido es: " + valorRecibido);
        System.out.println("  ");
        double dato = 0;
        do {
            System.out.println("Introduce un numero");
            Scanner escaner = new Scanner(System.in);

            try {
                boolean valor = escaner.hasNextDouble();
                System.out.println(valor + " lo que hay en valor");

                if (valor != false) {
                    dato = escaner.nextDouble();
                    
                    System.out.println("el valor introducidoes correcto" + dato);
                    comprobador = true;
                }else{
                    throw new InvalidParameterException("VALOR NO VALIDO");
                }
                
            } catch (InvalidParameterException e) {
                System.out.println("Ese valor no es válido");
                comprobador = false;
            }

        } while (comprobador == false);
        return dato;
    }

}
