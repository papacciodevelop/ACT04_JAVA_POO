/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad04_0485.ejercicio03.vehiculos;

import actividad04_0485.ejercicio03.seguros.Seguro;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class GestiónConcesionario {

    public static void main(String[] args) throws Exception {

        Seguro[] seguros = new Seguro[2];
        seguros[0] = new Seguro("Seguros Ocaso", "Cobertura total", 6.4, 5);
        seguros[1] = new Seguro("Seguros Monfort", "Cobertura terceros", 5.4, 15);

        Vehiculo[] flota = new Vehiculo[4];

        flota[0] = new Coche("0004GLP", "Toyota Versus", 4, 14, 'A');
        flota[1] = new Coche("8392DDS", "Toyota Celica", 6, 4, 'B');
        flota[2] = new Carga(550, "6384SSD", "Fort Transist", 8, 7);
        flota[3] = new Carga(4000, "0034PRJ", "Renault Voyager", 5, 15);

        IAlquilable[] vehiculoySeguro = null;

        int valorSalida = 0;

        do {
            System.out.println("1 - Mostrar Información de la flota");
            System.out.println("2 - Mostrar la información de los seguros disponibles");
            System.out.println("3 - Reiniciar el alquiler");
            System.out.println("4 - Establecer elnumero de dias del alquiler");
            System.out.println("5 - Mostrar el alquiler");
            System.out.println("0 -  Salir");

            Scanner br = new Scanner(System.in); //Se crea el lector          
            int valortecladoanadido = br.nextInt();

            switch (valortecladoanadido) {

                case 1:
                    MostrarFlota(flota);
                    break;

                case 2:
                    MostrarSeguros(seguros);
                    break;

                case 3:
                    vehiculoySeguro = reiniciarAlquiler(seguros, flota);
                    break;

                case 4:
                    establedeDiasAlquiler(vehiculoySeguro);
                    break;
                case 5:
                    mostrarAlquiler(vehiculoySeguro);
                    break;
                case 0:
                    valorSalida = 1;
                    break;

            }

        } while (valorSalida == 0);

    }

    public static void MostrarFlota(Vehiculo[] flota) {
        System.out.println("Nuestra flota de vehiculos disponible es: ");
        for (int i = 0; i < flota.length; i++) {
            System.out.println(i + " " + flota[i].toString());
        }
    }

    public static void MostrarSeguros(Seguro[] seguro) {
        System.out.println("--- Nuestros seguros disponibles ---");
        for (int i = 0; i < seguro.length; i++) {
            System.out.println(i + " " + seguro[i].toString());
        }
    }

    public static IAlquilable[] reiniciarAlquiler(Seguro[] seguro, Vehiculo[] flota) throws Exception {

        IAlquilable[] vehiculoySeguro = null;
        try {

            //cantidad de vehiculos
            System.out.println("Introduce la cantidad vehiculos para alquilar: (entre 1 y 5) ");
            Scanner cantAlqTeclad = new Scanner(System.in); //Se crea el lector          
            int catTeclado = cantAlqTeclad.nextInt();

            //cantidad de Seguros
            System.out.println("Introduce la cantidad seguros para alquilar: (entre 1 y 5) ");
            Scanner cantAlqTeclad2 = new Scanner(System.in); //Se crea el lector          
            int SeguroTeclado = cantAlqTeclad2.nextInt();

            //comprobar que los valores son correctos
            if (catTeclado >= 1 && catTeclado <= 5 && SeguroTeclado >= 1 && SeguroTeclado <= 5) {
                int totalArray = catTeclado + SeguroTeclado;
                //   inicializa el array con los valores indicados
                vehiculoySeguro = new IAlquilable[totalArray];

                int contARR = 0;

                for (int z = 0; z < flota.length; z++) {
                    System.out.println("Numero " + z + " " + flota[z]);
                }

                for (int f = 0; f < catTeclado; f++) {

                    System.out.println("Introduce el numero del vehiculo a introducir");
                    Scanner numVehiTecl = new Scanner(System.in); //Se crea el lector          
                    int numVehiulo = numVehiTecl.nextInt();
                    if (numVehiulo <= flota.length) {

                        for (int j = 0; j < flota.length; j++) {

                            vehiculoySeguro[f] = flota[numVehiulo];

                        }

                    }
                    contARR = f;
                }

                //   System.out.println("Lo que hay en contARR "+contARR);
                // System.out.println("Tamaño del array " + vehiculoySeguro.length);
                System.out.println("Los seguros son: ");
                for (int i = 0; i < seguro.length; i++) {
                    System.out.println("Seguro " + i + " " + seguro[i]);
                }

                for (int s = 0; s < SeguroTeclado; s++) {
                    contARR++;
                    System.out.println("Introduce el numero del seguro a introducir");
                    Scanner numSeguroTecl = new Scanner(System.in); //Se crea el lector          
                    int numSeguro = numSeguroTecl.nextInt();
                    if (numSeguro <= seguro.length) {

                        for (int j = 0; j < seguro.length; j++) {

                            for (int i = contARR; i < vehiculoySeguro.length; i++) {
                                vehiculoySeguro[contARR] = seguro[numSeguro];
                            }

                            contARR++;
                        }

                    }

                }

                System.out.println("El alquiler queda asi: ");
                for (int z = 0; z < vehiculoySeguro.length; z++) {
                    System.out.println("Numero " + z + " " + vehiculoySeguro[z]);
                }

            } else {
                System.out.println("ERROR");
            }

        } catch (Exception e) {
            // System.out.println("Algún dato es erroneo."+ e.getLocalizedMessage());
            e.addSuppressed(e);
            e.getCause();
            System.out.println("ERROR");
        }
        return vehiculoySeguro;

    }

    public static void mostrarAlquiler(IAlquilable[] vehiculoySeguro) {

        if (vehiculoySeguro != null) {

            System.out.println("Alquiler");
            for (IAlquilable iAlquilable : vehiculoySeguro) {
                System.out.println(iAlquilable.toString());
            }

        } else {
            System.out.println("No hay ningun alquiler");
        }

    }

    private static void establedeDiasAlquiler(IAlquilable[] vehiculoySeguro) {

        if (vehiculoySeguro != null) {

            System.out.println("Introduce el numero de dias del alquiler ENTRE 1 Y 30 DIAS:");
            Scanner numSeguroTecl = new Scanner(System.in); //Se crea el lector          
            int numDias = numSeguroTecl.nextInt();

            if (numDias >= 1 && numDias <= 30) {

                System.out.println("Alquiler");
                for (int i = 0; i < vehiculoySeguro.length; i++) {

                    vehiculoySeguro[i].setNumeroDias(numDias);
                }

            } else {
                System.out.println("LOS DIAS NO COINCIDEN");
            }
        } else {
            System.out.println("No hay ningun alquiler");
        }

    }

}
