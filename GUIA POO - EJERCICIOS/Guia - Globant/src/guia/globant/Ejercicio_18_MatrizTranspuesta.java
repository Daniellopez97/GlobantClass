//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
//traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
//cambiando sus filas por columnas (o viceversa).
package guia.globant;
import java.util.Scanner;



public class Ejercicio_18_MatrizTranspuesta {

public static void main(String[] arg){
    
    Scanner leer = new Scanner(System.in);
    
    int n = leer.nextInt();
    int[][] matriz = new int[n][n];
    
    for ( int i=0; i<n; i++){
        for( int j=0;j<n; j++){
            int numero = (int)(Math.random()*10);
            matriz[i][j]= numero;
            System.out.print(matriz[i][j] + " ");
        }
      System.out.println(" ");  
    }
    System.out.println(" ");  
    for ( int i=0; i<n; i++){
        for( int j=0;j<n; j++){
            
            
            System.out.print(matriz[j][i] + " ");
        }
      System.out.println(" ");  
    }
    
  
            
}    
}
