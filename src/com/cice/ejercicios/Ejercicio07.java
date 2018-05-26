/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.ejercicios;

import java.util.Scanner;

/**
 *
 * @author TrendingPC
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int op = 0;
        int a = 0;
        int b = 0;
        
        Scanner sc = new Scanner(System.in);
        do{
            
            System.out.println("MENU PRINCIPAL CALCULADORA V1.0");
            System.out.println("===============================");
            System.out.println("Elije una opción");
            System.out.println("1- suma");
            System.out.println("2- resta");
            System.out.println("0- salir");
            System.out.println("================================");
            System.out.print("Has elejido la opción: ");
            op = sc.nextInt();
            
            if (op == 1){
            
                System.out.print("Introduce el numero a: ");
                a = sc.nextInt();
            
                System.out.print("Introduce el numero b: ");
                b = sc.nextInt();
                
                System.out.println("El resultado de la suma es: " +(a + b));
                
                
                
            }else if (op == 2){
            
                System.out.print("Introduce el numero a: ");
                a = sc.nextInt();
                
                System.out.print("Introduce el numero b: ");
                b = sc.nextInt();
                
                System.out.println("El resultado de la resta es: " + (a - b));
            
            }else{
                    
                System.out.println("HASTA PRONTO !!!");
        }
            
        }while (op != 0);{
        System.out.println("HASTA PRONTO !!!!!");
    }
    }
       
        
}    
    
    

