
package Ejercicios_Extras;
//Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
//N, con los valores ingresados por el usuario.
import java.util.Scanner;


public class EjercicioExtra_18 {
public static void main(String[] arg){   
    Scanner leer = new Scanner(System.in);
       System.out.println("Ingresa el tamaño del vector");
       int n = leer.nextInt();
       int [] vector = new  int[n];
       int suma = 0;
       for( int i=0; i<n; i++){
       System.out.println("Ingresa el numero # " + (i+1));
        vector[i]= leer.nextInt();
        suma = suma + vector[i];
       }  
    System.out.println("La suma de los numeros ingresados es " + suma);
  }
}
