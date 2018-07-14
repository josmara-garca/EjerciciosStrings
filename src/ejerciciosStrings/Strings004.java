/*
 * Introducirmuna frase y comprobar cuantas veces aparece una letra.
 */
package ejerciciosStrings;

/**
 *
 * @author TrendingPC
 */
public class Strings004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        String cadena = "Jose maria garcia parrondo";
        int valor = 0;
        int pos = 0;
        pos = cadena.indexOf('a');
        while (pos != -1) {
            pos = cadena.indexOf('a', pos + 1);
            valor++;
        }
        if (valor == 0) {
            System.out.println(pos);
        } else {
            System.out.println("La letra aparece: " + valor + " veces");

        }
    }
}
