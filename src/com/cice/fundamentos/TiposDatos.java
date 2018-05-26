
package com.cice.fundamentos;


public class TiposDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int entero = 0;
        float comaFlotante = 1.15f; //debemos definir el valor como tal
        double decimal = 1.359;
        long enteroGranCapacidad = 122222000; 
        char caracter = 'C';
        boolean booleano = true; //solo true o false
        
        String caracteres = "Esto es una cadena de caracteres";
        
        entero = 2;
        System.out.println(entero);
        
        //operaciones matematicas
       // +;  -;  *;  /;  %
       
        System.out.println(comaFlotante + 1.15f);
        
        System.out.println(24 % 12);
        
        // comparaciones
        // <;  >;  >=;  <=; ==; !=;
        
        System.out.println("==========");
        
        System.out.println(2 > 6);
        System.out.println(2 < 4);
        System.out.println(2 == 3);
        System.out.println(2 >= 3);
        System.out.println(3 >= 6);
        System.out.println(2 != 3);
        
        System.out.println("El valor de entero es: " + entero +"y el valor de decimal es:" +decimal);
        System.out.println(entero > 6);
        
        
        
        
        
    }
    
}
