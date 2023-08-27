//Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
//matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
//signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
//denota por AT y se obtiene cambiando sus filas por columnas (o viceversa). 
package guia.globant;
import java.util.Scanner;

public class Ejercicio_19_MatrizAntiSimetrica {
    public static void main(String[] arg){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Cual es el tamaño de la matriz");
        int n = leer.nextInt();
    int[][] matriz = new int[n][n];
    int[][] auxiliar = new int[n][n];
    int cont = 0;
    
    for ( int i=0; i<n; i++){
        for( int j=0;j<n; j++){
            System.out.println("Ingresa el dato de la posicion "  + i + "," + j );
            int num = leer.nextInt();
            matriz[i][j]= num;
        }
    }
    
      for ( int i=0; i<n; i++){
        for( int j=0;j<n; j++){
            System.out.print(matriz[i][j] + " ");
        }
      System.out.println(" ");  
    }
    
      System.out.println( " ");
      
     for ( int i=0; i<n; i++){
        for( int j=0;j<n; j++){
            
            auxiliar [i][j]=matriz[j][i];
            
            System.out.print(auxiliar[i][j] + " ");
         
          if (matriz [i][j] == (-1) *auxiliar [i][j]) {
              
              cont = cont + 0;
          }
              else {
              
              cont = cont + 1;
                      }
          }
        System.out.println(" ");
        }
     
      System.out.println(" ");
      
      if (cont == 0) {
          
           System.out.println(" La matriz es antisimetrica ");
      }
           else {
          System.out.println(" La matriz No es antisimetrica ");
      }
                   
                   
          
      
    }
    

}
