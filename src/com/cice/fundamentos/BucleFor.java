/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.fundamentos;

/**
 *
 * @author TrendingPC
 */
public class BucleFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Entre otras cosas sirven para recorrer arrays
        
        int [] arrayEnteros = {1, 2, 3, 4, 5};
        
        //con un solo sout puedo pintar todas las posiciones
        
        for ( int i = 0; i < 5; i ++) {
            //System.out.println("El valor de i es:" +i);
            //o mejor:
            System.out.println("El valor del array en su posicion actual es:" + arrayEnteros[i]);
            
        }   
    
        // Escribir un bucle y pintarlo para los numero pares del 1 al 100
        for (int i = 0; i <= 100; i ++){
            
            if (i % 2 == 0){    
                System.out.println (i);
            }        
        }           
        for (int i = 0; i < arrayEnteros.length; i ++) {
            System.out.println(arrayEnteros [i]);
            
            
            
            
        }        
            }    
         
        }
        
    
        
        
         
        
    
    

