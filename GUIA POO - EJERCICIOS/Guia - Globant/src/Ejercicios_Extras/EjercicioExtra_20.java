//Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
//parámetro. Después haremos otra función o procedimiento que imprima el vector.
package Ejercicios_Extras;

import java.util.Scanner;


public class EjercicioExtra_20 {
 public static void main(String[] arg){   
    Scanner leer = new Scanner(System.in);
       System.out.println("Ingresa el tamaño del vector");
       int n = leer.nextInt();
       int [] vector = new  int[n];
       rellenarvector (vector,n);
       imprimirvector (vector,n);
    } 
 public static void rellenarvector (int []vector, int n ) {
      
       for (int i=0; i<n; i++) {
        int numero = (int)(Math.random()*10);
        vector[i]= numero;
     }
      
    } 
 public static void imprimirvector (int []vector, int n ) {
      
       for (int i=0; i<n; i++) {
        System.out.println("Vector"+ "[" + i + "] = " + vector[i] ); 
       }
      
    }
}
