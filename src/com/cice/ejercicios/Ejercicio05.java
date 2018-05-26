/*
 * Desarrollar un programa que a partir de un determinado número,
 * vaya realizando la suma de todos los números consecutivos a dicho
 * número.
 * El proceso finalizará cuando se alcance o supere el valor de 100.
 * Se mostrará solo el resultado final.
 */
package com.cice.ejercicios;

import java.util.Scanner;

/**
 *
 * @author TrendingPC
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //variables a usar
       int numero = 0;
       int suma = 0;
       
        System.out.println("EJERCICIO");
        System.out.println("==========");
        
        //el scanner
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número entero: ");
        
        numero = sc.nextInt();
        
        for (int i = numero; suma <= 100; i++){
        
            suma += i;
        
        }
            System.out.println("Dado el numero  (" + numero + ") la suma de los consecutivos es: " +suma);
            
        
        
    }
        
       
}
        
    
    

