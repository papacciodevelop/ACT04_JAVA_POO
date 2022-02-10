/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad04_0485.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Heladeria {

        
     
        
    public static void main(String[] args) {

        //var menu
        int menu = 0;
        
        
        
        
        Comida cacaHue = new Comida("Cacahuetes", 1.5, 99.0);
        Horchata hor1 = new Horchata(250.0, 30, " Horchata", 2.5, 20.0);
        SaborHelado sab1 = new SaborHelado(15.0, " Azucar", " Vainilla", 1.0, 30.0);
        SaborHelado sab2 = new SaborHelado(15.0, " aspartamo", " Chocolate", 1.0, 15.0);
        SaborHelado sab3 = new SaborHelado(20.0, " azucar", " Cookies", 1.25, 35.0);
        SaborHelado sab4 = new SaborHelado(5.0, " aspartamo", " Fresa", 1.0, 10.0);

        SaborHelado[] saborhel = new SaborHelado[]{sab1, sab2};
        SaborHelado[] saborhel2 = new SaborHelado[]{sab3, sab4};
        Cucurucho cuc1 = new Cucurucho("Galleta ", 1.0, 20.0, saborhel);
        Cucurucho cuc2 = new Cucurucho("Galleta ", 1.5, 25.0, saborhel2);
    
       List data = new ArrayList();
        data.add(cacaHue);
        data.add(hor1);
        data.add(cuc1);
        data.add(cuc2);
      
        //MENU
        
        do {
        
        System.out.println("1 - Mostrar Pedido");
        System.out.println("2 - Modificar");
        System.out.println("3 - Salir");
       
        

        Scanner br = new Scanner(System.in); //Se crea el lector          
        int valortecladoanadido = br.nextInt();
            switch(valortecladoanadido){
                    
              case 1:
                  mostrarPedido(data);
                break;
              case 2:
                  modificarPedido(data);
                  break;
                  
              case 3:
                  menu = 1;
                  break;
                
            
            }
            
            
            
        }while(menu == 0);
        

    }
    
    
    public static void  mostrarPedido(List data){  
        for (Object object : data) {         
            System.out.println(data.indexOf(object) +"- "+ object.toString() );  
        }
    }
    

    
    public static void modificarPedido(List data){   
         for (Object object : data) {         
            System.out.println(data.indexOf(object) +"- "+ object.toString() );  
        }
        try {
            
  
        System.out.println("Selecciona nº de elemento que quieres sustituir");
        Scanner br = new Scanner(System.in); //Se crea el lector          
        int numeroCambio = br.nextInt();
       
        System.out.println("Introduce nuevos valores de Horchata ");
        System.out.println("Para los valores con decimal USA COMA , EJEM 23,2");
        //nombre
        System.out.println("Introduce nombre");
        Scanner aa = new Scanner(System.in); //Se crea el lector          
        String aaTextoNombre = aa.next();
        //Kcal
        System.out.println("Introduce las kcal");
        Scanner a2 = new Scanner(System.in); //Se crea el lector          
        double a2kcal = a2.nextDouble();
        //precio
        System.out.println("Introduce las precio");
        Scanner a3 = new Scanner(System.in); //Se crea el lector          
        double a3precio = a3.nextDouble();
        //cantidad
        System.out.println("Introduce la cantidad");
        Scanner a4 = new Scanner(System.in); //Se crea el lector          
        double a4Cantidad = a4.nextDouble();
        //porcentaje chufa
        System.out.println("Introduce el % de chufa");
        Scanner a5 = new Scanner(System.in); //Se crea el lector          
        double a5porcenta = a5.nextDouble();

         Horchata hor1 = new Horchata(a4Cantidad,a5porcenta , aaTextoNombre, a3precio, a2kcal);
        //modificar
        data.set(numeroCambio, hor1);
         
        
        } catch (Exception e) {
            System.out.println("ERROR DEBES USAR , (COMA) en los valores numericos ");
        }
        
        
        }
        
        
        
        
        
        
    }
    
    
    
    

