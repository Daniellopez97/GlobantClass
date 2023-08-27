//Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
//muestre la suma de sus elementos.
package Ejercicios_Extras;

import java.util.Scanner;


public class EjercicioExtra_22 {
   public static void main(String[] arg){   
    Scanner leer = new Scanner(System.in);
       System.out.println("Ingresa el tamaño de la matriz");
       int n = leer.nextInt();
       int m = leer.nextInt();
       int [][] matriz = new  int[n][m];
      rellenarmatriz (n,m, matriz );
      mostrarmatriz (n,m, matriz );
      suma (n,m, matriz );
    
  
   }
   
   public static void rellenarmatriz (int n, int m, int [][] matriz ) {
       for (int i=0; i<n; i++) {
        
        for (int j=0; j<m; j++)
        
        {
            int numero = (int)(Math.random()*10);
            matriz [i][j]= numero;
             
        }
    }
    
   } 
       
   public static void mostrarmatriz (int n, int m, int [][] matriz ) {
       for (int i=0; i<n; i++) {
        
        for (int j=0; j<m; j++)
        
        {
            
            System.out.print (matriz [i][j] + " ");
             
        }
        
      System.out.println ("");
    }
    
   } 
   
   
   public static void suma (int n, int m, int [][] matriz ) {
       int suma = 0;
       
       for (int i=0; i<n; i++) {
        
        for (int j=0; j<m; j++)
        
        {
            
            suma = suma + matriz [i][j];
             
        }
        
      
    }
       
    System.out.println("La suma de los elementos de la matriz es igual a :" + suma);
    
   } 
}
