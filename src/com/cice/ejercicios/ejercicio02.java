/*
 * Escribir nombre completo en una linea y fecha de nacimiento en otra
 */
package com.cice.ejercicios;

import java.util.Scanner;

/**
 *
 * @author TrendingPC
 */
public class ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre = "nombre";
        String fecha = "fecha";
        
        
        
        
      
        System.out.println("EJERCICIO 02");
        System.out.println("=============");
        
        //el scanner
        Scanner sc = new Scanner(System.in);
        
        //primer mensaje
        System.out.print("Introduce tu nombre completo: ");
        
        //almaceno mi nombre
        nombre = sc.nextLine();
        
        //segundo mensaje
        System.out.print("Introduce tu fecha de nacimiento: ");
        
        //almaceno mi fecha nacimiento
        fecha = sc.nextLine();
        
        //pintar
        System.out.println("Tu nombre es" + nombre);
        System.out.println("Tu fecha de nacimiento es " + fecha);
        
               
        
        
    }
    
}
