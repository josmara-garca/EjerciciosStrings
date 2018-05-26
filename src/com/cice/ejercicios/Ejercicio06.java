/*
 * Crear un array con las notas de un alumno, mostrar la media y que pinte una calificacion
 * teniendo en cuenta que las calificaciones son {3, 5, 7, 6, 9}
 * y las notas son insuficiente (0-4.9) suf. (5- 5.9) bien (6- 6.9) not. (7- 8.9)
 * sobr. (9-10)
 */
package com.cice.ejercicios;

/**
 *
 * @author TrendingPC
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    double [] notas = {3, 5, 7, 6, 9};
    
    double notaMedia = 0;
    
    double sumaNotas = 0;
    
    for (double nota: notas){
        
        sumaNotas += nota;
        
        
    }
    notaMedia = sumaNotas / notas.length;
    
   /* if (notaMedia < 5){
        System.out.println("La nota media ("+notaMedia+") es: INSUFICIENTE. Debes estudiar mas");
    }else if (notaMedia < 6){
        System.out.println("La nota media ("+notaMedia+") es: SUFICIENTE. Bien pero hay que mejorar");
    }else if (notaMedia < 7){
        System.out.println("La nota media ("+notaMedia+") es: BIEN. Sigue así");
    }else if (notaMedia < 9){
        System.out.println("La nota media ("+notaMedia+") es: NOTABLE. Muy bien");
    }else{
        System.out.println("La nota media ("+notaMedia+") es: SOBRESALIENTE. ENHORABUENA");
    */
    //CASTING es la conversion de un double o float en dato int
    //en este caso para redondear los decimales al entero y utiizar switch:
    
    int notaEntero = (int) notaMedia;
    
    switch(notaEntero){
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
            System.out.println("La nota media es de INSUFICIENTE");
            break;
        case 5:
            System.out.println("La nota media es de SUFICIENTE");
            break;
        case 6:
            System.out.println("La nota media es de BIEN");
            break;
        case 7:
        case 8:
            System.out.println("La nota media es de NOTABLE");
            break;
        case 9:
        case 10:
            System.out.println("La nota media es de SOBRESALIENTE");
            break;
                 
            
    }
    
    }
          
    }                 
        
    
    
    
        
        
            
        
        
        
        
    
        
    
    

