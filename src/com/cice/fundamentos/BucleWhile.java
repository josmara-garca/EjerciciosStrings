/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.fundamentos;

import java.util.Scanner;



/**
 *
 * @author TrendingPC
 */
public class BucleWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //ejecuta la sentencia mientras se cumpla la condicion del while.
        // CUIDADO CON EL BUCLE INFINITO !!!!!:
        
        /*int a = 1;
        int b = 0;
        while (a > b){
             System.out.println("a es mayor que b");
             // esta sentencia se ejecutaria hasta el infinito (hasta agotar memoria)
        
             a = b;
             //ahora ya no. Porque ya no se cumple a > b. solo se escribiria una vez.
             
        // ESTRUCTURA DO WHILE
        do {
            System.out.println("a puede que sea mayor que b");
        }while (a > b);
        // solo ejecutara la sentencia una vez porque a no es mayor que b. (si no,infinito)
        
        */
        
        int opcion = 0;
        
        //el scanner
        
        Scanner sc = new Scanner(System.in);
        
        do {
            
            System.out.println("MENU PRINCIPAL");
            System.out.println("==============");
            System.out.println("Elige una opción");
            System.out.println("1- suma");
            System.out.println("2- resta");
            System.out.println("0- salir");
            System.out.println("===============");
            opcion = sc.nextInt() ;
            
        }while (opcion != 0);
        
        }
    }

        
        
    
    

