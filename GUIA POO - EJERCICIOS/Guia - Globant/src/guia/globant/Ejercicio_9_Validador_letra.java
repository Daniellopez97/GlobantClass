
package guia.globant;
import java.util.Scanner;


public class Ejercicio_9_Validador_letra {
    public static void main(String[] arg){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una palabra");
        String palabra = leer.next();
        
        if (palabra.substring(0,1).equals("A"))
            
        {
            System.out.println("Correcto");
        }
         else
        {
            System.out.println("Incorrecto");
        }
    }
}
