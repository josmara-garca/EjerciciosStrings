/*
 *Juego "acierta la contraseña". Pedir al jugador 1 que introduzca una palabra contraseña.
 *Luego se mostrara al jugador 2 un mensaje con la primera y ultima letras de la contraseña.
 *Debera intentar adivinar la contraseña. A cada intento se mostrara mensaje diciendo si el
 *intento tiene mas o menos caracteres que la contraseña. Al acertar, mensaje de enhorabuena.
 */
package ejerciciosStrings;

import java.util.Scanner;



/**
 *
 * @author TrendingPC
 */
public class Strings001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       String contraseña ;
       String a;
       String palabra;
       int l ;
       
        Scanner sc = new Scanner(System.in);
         System.out.print("Jugador 1. Introduce contraseña: ");
         contraseña = sc.nextLine();
         System.out.println("La primera letra es: " + contraseña.charAt(0));
            System.out.println("La ultima letra es: " + contraseña.charAt(contraseña.length()-1));
        
        
        do{
            
            System.out.print("Jugador 2. La contraseña es: ");
            palabra = sc.nextLine();
            if (contraseña.length() > palabra.length()) {
                System.out.println("La contraseña tiene mas caracteres");
            }else if (contraseña.length() == palabra.length()) {
                    System.out.println("La contraseña tiene los mismos caracteres que tu palabra");
                
            } else {
                System.out.println("La contraseña tiene menos caracteres");
            }
            System.out.print("Error, sigue jugando... ");

        } while (!contraseña.equalsIgnoreCase(palabra));
        System.out.print("Enhorabuena !!!!");

    }
}


