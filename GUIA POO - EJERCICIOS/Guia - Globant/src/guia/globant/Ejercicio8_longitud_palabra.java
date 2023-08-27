
package guia.globant;
import java.util.Scanner;


public class Ejercicio8_longitud_palabra {
    public static void main(String[] arg){
        
      Scanner leer = new Scanner(System.in);
      
      System.out.println("Ingresa una palabra o frase");
      
     String palabra = leer.next();
     
     if (palabra.length()==8)
     {
         System.out.println("CORRECTO");
     }
     else {
         System.out.println("INCORRECTO");
     }
      
      
    }
    
}
