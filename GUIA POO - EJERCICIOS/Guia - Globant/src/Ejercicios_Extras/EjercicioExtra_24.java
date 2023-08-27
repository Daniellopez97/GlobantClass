// Fibonacci
package Ejercicios_Extras;

import java.util.Scanner;


public class EjercicioExtra_24 {
     public static void main(String[] arg){   
    Scanner leer = new Scanner(System.in);
       System.out.println("Ingresa el tamaño de la sucesion de fibanacci");
       int n = leer.nextInt();
     int a = 0;
     int b = 1;
     int c = 0;
     System.out.print(b + ",");
     for( int i=0; i<n-1; i++){ 
        c = a + b;
        System.out.print(c + ",");
        
        a= b;
        b= c;
      
      }


     
   }
}