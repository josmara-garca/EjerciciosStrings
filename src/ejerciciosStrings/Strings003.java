/*
 * Dada una frase y una palabra, hacer un programa que muestre si la
 * palabra aparece en la frase, o no. En caso afirmativo, cuantas veces aparece.
 * (Elegir frase y palabra o pedirlas por escaner).
 */
package ejerciciosStrings;

import java.util.Scanner;



/**
 *
 * @author TrendingPC
 */
public class Strings003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
         String frase = "tres eran tres las tres hijas de elena";
         String palabra = "tres";
         int veces = 0;
         int pos;
   
        pos = frase.indexOf(palabra);
        while (pos != -1) {
            veces++;
            pos = frase.indexOf(palabra, pos + 1);
        }
        if (veces == 0) {
            System.out.println("No esta la palabra");
        } else {
            System.out.println("La palabra aparece: " + veces + " veces");
        }
    }

}


