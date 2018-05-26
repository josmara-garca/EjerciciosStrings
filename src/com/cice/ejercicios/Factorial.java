/*

*/
  
package com.cice.ejercicios;

import java.util.Scanner;


/**
 *
 * @author TrendingPC
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        long factorial = 1;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Elige un numero entero: ");
        num = sc.nextInt();
        
        for(int i = num; i > 0; i--){
            factorial = factorial * i;
            
        }
       
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
        
    }
               

            
        
    


      
      
      
      
           
    
    
        
        

    

