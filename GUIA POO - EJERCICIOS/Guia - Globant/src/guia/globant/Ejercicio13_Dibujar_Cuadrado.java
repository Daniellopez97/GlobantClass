
package guia.globant;
import java.util.Scanner;


public class Ejercicio13_Dibujar_Cuadrado {
   public static void main(String[] arg){
       
       Scanner leer = new Scanner(System.in);
       System.out.println("Cual es el tamaño del ");
       int tamaño = leer.nextInt();
      
       
       for (int i=0; i<tamaño; i++){
           for (int j=0; j<tamaño; j++){
               
              if (i==0 || i==tamaño-1 || j==0 || j==tamaño-1) {
                  System.out.print("*");
              }
                  else {
                 System.out.print(" ");
                        }
              }
            System.out.println("");    
       }
      
       }
      
   }

