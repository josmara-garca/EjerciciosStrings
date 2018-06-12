/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio08;

/**
 *
 * @author TrendingPC
 */
public class SumaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int []array = {1,2,3,4,5};
        int resultado = 0;
        
        for(int i: array){
            resultado += i;
           
        }
        System.out.println("La suma de los números del array es: " + resultado);
        
    }
}
