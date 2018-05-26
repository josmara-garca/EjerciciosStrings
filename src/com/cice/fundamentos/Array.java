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
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Un array es un objeto de java que permite almacenar en su interior varios datos del mismo tipo.
        // ARRAY DE UNA DIMENSION
        int [] arrayEnteros = {1, 2, 3, 4, 5};
        //     arrayEnteros = [0. 1, 2, 3, 4 ]
        // arrayEnteros [0 - 4]
        System.out.println(arrayEnteros [0]);
        System.out.println("El valor de la posición 0 debe ser 1, y el valor recogido es: " + arrayEnteros [0]);
        System.out.println("El valor de la posición 4 debe ser 5, y el valor recogido es: " + arrayEnteros [4]);
        
        String [] arrayString = new String [7];
        arrayString [0] = "lunes";
        arrayString [1] = "martes";
        arrayString [2] = "miércoles";
        arrayString [3] = "jueves";
        arrayString [4] = "viernes";
        arrayString [5] = "sábado";
        arrayString [6] = "Domingo";
        
        System.out.println(arrayString [2]);
        //tambien puede ser: 
        String array2[] = new String[3];
        
        //ARRAY DE DOS DIMENSIONES
        
        int array2D [][] = new int [2][5];
        //ahora defino los datos para cada posición:
        //la primera caja es la o; y la primera posición es la 0
        
        array2D [0] [0] = 0;
        array2D [0] [1] = 1;
        array2D [0] [2] = 2;
        array2D [0] [3] = 3;
        array2D [0] [4] = 4;
        
        //la segunda caja es la 1, y su primera posición también es 0
        
        
        array2D [1] [0] = 5;
        array2D [1] [1] = 6;
        array2D [1] [2] = 7;
        array2D [1] [3] = 8;
        array2D [1] [4] = 9;
        
        System.out.println(array2D [0][4]);
        
    }
    
}
