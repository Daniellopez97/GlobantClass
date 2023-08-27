//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
//de 2 dígitos, etcétera (hasta 5 dígitos).


package guia.globant;
import java.util.Scanner;

public class Ejercicio_17_Contardigitos {
    
    public static void main(String[] arg){
       
      Scanner leer = new Scanner(System.in);
      
      System.out.println("Cual es el tamaño del vector");
      int n = leer.nextInt();
      
      int undig = 0;
      int dosdig = 0;
      int tresdig = 0;
      int cuadig = 0;
      int cindig = 0;
      
      int[] vector = new int[n];
      
      for ( int i=0; i<n; i++){
         System.out.println("Ingresa el numero " + (i+1));
          vector[i]= leer.nextInt();
          
      }
      
      for ( int i=0; i<n; i++){
           
         if (vector[i]/10 < 1){
             
             undig = undig + 1;   
         }
         else if (vector[i]/10 >= 1 && vector[i]/10 < 10) {
             dosdig = dosdig + 1; 
         }
         
         else if (vector[i]/10 >= 10 && vector[i]/10 < 100) {
              tresdig = tresdig + 1;
         }
         
         else if (vector[i]/10 >= 100 && vector[i]/10 < 1000) {
             cuadig = cuadig + 1;
         }
         
         else if (vector[i]/10 >= 1000 && vector[i]/10 < 10000) {
             cindig = cindig + 1;
         }
      }
      
      System.out.println("El total de numeros de un solo digito son: " + undig );
      System.out.println("El total de numeros de dos digitos son: " + dosdig );
      System.out.println("El total de numeros de tres digitos son: " + tresdig );
      System.out.println("El total de numeros de cuatro digitos son: " + cuadig );
      System.out.println("El total de numeros de cinco digitos son: " + cindig );
    }
}
