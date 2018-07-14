/*
 * Pedimos al usuario introducir una frase palabra por palabra.
 * Cuando termine la frase debe pulsar la palabra "fin". Momento en que se
 * mostrara la frase completa por consola. Dara igual que las palabras sean
 * mayusculas o minusculas. El programa funcionara igual.
 */
package ejerciciosStrings;

import java.util.Scanner;

/**
 *
 * @author TrendingPC
 */
public class Strings002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        String frase = " ";
        String palabra;
       
        System.out.print("Introduce palabras para ir formando una frase y fin para terminar: ");       
        palabra = sc.nextLine();
        
        while (!palabra.toLowerCase().equals("fin")){
            frase = frase + " " + palabra;
            System.out.print("Introduce otra palabra o fin para salir: ");
            palabra = sc.nextLine();
        } 
        System.out.println(frase);
           
    }
    
}
