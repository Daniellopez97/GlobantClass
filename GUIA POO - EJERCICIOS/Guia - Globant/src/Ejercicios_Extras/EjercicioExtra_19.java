//Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
//comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
//elementos).
package Ejercicios_Extras;

import java.util.Scanner;


public class EjercicioExtra_19 {
   public static void main(String[] arg){   
    Scanner leer = new Scanner(System.in);
       System.out.println("Ingresa el tamaño de los vectores");
       int n = leer.nextInt();
       int [] vector1 = new  int[n];
       int [] vector2 = new  int[n];
    for( int i=0; i<n; i++){
       System.out.println("Vector 1: Ingresa el numero # " + (i+1));
        vector1[i]= leer.nextInt();
    }
     for( int i=0; i<n; i++){
       System.out.println("Vector 2: Ingresa el numero # " + (i+1));
        vector2[i]= leer.nextInt();
    }
    

    for( int i=0; i<n; i++){
        
       if  (vector1[i]!= vector2[i]) {
          System.out.println("Los elementos de los vectores son diferentes"); 
          System.out.println("Vector 1 en la posicion " + i + " Con valor = " + vector1[i] ); 
          System.out.println("Vector 2 en la posicion " + i + " Con valor = " + vector2[i] );
          break;
       
       }
       else {
           System.out.println("Los vectores son iguales en la posicion " + i); 
       }
    } 
    
    
   }
}
