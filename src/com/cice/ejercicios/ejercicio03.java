/*
 * Escribir un programa que dado el precio de un producto, calcule el precio aplicando
 * un descuento del 15 %. (tipo de dato double)
 * tiene que pintar el precio original y el rebajado
 */
package com.cice.ejercicios;

import java.util.Scanner;

/**
 *
 * @author TrendingPC
 */
public class ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        double precio = 24.24;
        double descuento = precio * 0.85;
        
        System.out.println("EJERCICIO 03");
        System.out.println("=============");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el precio original:  ");
        
        precio = sc.nextDouble();
        
        System.out.print("Introduce el descuento: ");
        
        descuento = sc.nextDouble();
        
        System.out.println("El precio original es: " + precio);
        System.out.println("El precio con descuento es: " + precio * 0.85);
        
        
        
        
        
        
    
    }
    
}
