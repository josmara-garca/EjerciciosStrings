/*
 * Pedir al usuario que introduzca dos numeros enteros y vamos a decir si son iguales o
 * a es meor que b, o a es mayor que b
 * 
 */
package com.cice.ejercicios;

import java.util.Scanner;

/**
 *
 * @author TrendingPC
 */
public class ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 1;
        int b = 2;
        
        // el scanner
        Scanner sc = new Scanner(System.in);
        
        //Pedir al usuario que introduzca dos numeros enteros.
        System.out.println("EJERCICIO 1");
        System.out.println("===========");
        System.out.print("Introduce un numero entero; ");
        
        //almaceno el numero que me escribe el usuario
        a = sc.nextInt();
        
        //solicito el segundo numero
        System.out.print("introduce otro numero entero: ");
        
        //almaceno el segundo nuemro
        b = sc.nextInt();
        
        //comprobamos si a es mayor, menor o igual que b
        
        if (a > b){
            
            System.out.println("A("+ a +")es mayor que B("+ b +")");
            
        } else if (a < b){
            
            System.out.println("A("+ a +")es menor que B("+ b +")");
            
        } else {
            
            System.out.println("A("+ a +")es igual que B("+ b +")");
            
        }
    }
    
}
