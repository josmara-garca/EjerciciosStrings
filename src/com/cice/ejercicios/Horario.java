/*
 * 
 */
package com.cice.ejercicios;

import java.util.Scanner;

/**
 *
 * @author TrendingPC
 */
public class Horario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double hora = 10.00;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Horas de la noche: de 21,00 a 4,00");
        System.out.println("Horas de la mañana: de 5,00 a 12,00");
        System.out.println("Horas de la tarde: de 13,00 a 20,00");
        System.out.println("===================================");
        
        System.out.print("Elige una hora (de 1,00 a 24,00):  ");
        hora = sc.nextDouble();
        
        if (hora >= 21.00){
            if (hora <= 24.00)                
            System.out.println("Es por la noche");
            
        }if (hora >= 1.00){
            if (hora <= 4.00)
            System.out.println("Es por la noche");    
                
        }if (hora >= 5.00){
            if (hora <= 12.00)
            System.out.println("Es por la mañana");
            
        }if (hora >= 13.00){
            if (hora <= 20.00)
            System.out.println("Es por la tarde");
        }if (hora >= 25.00){
            System.out.println("Hora no existente");
          
        }if (hora < 1.00){
            System.out.println("Hora no existente");
        }
    
        
    }
}

    

      

    


           

        
    
    
    

   

