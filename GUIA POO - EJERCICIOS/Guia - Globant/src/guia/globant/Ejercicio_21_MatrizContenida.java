
package guia.globant;
import java.util.Scanner;


public class Ejercicio_21_MatrizContenida {
    
   public static void main(String[] arg){
       
       Scanner leer = new Scanner(System.in);
       
       int [][] matriz = new int [10][10];
       int [][] Submatriz = new int [3][3];
       RellenarMatriz (matriz);
       ImprimirMatriz (matriz);
       
       for (int i=0; i<10 ; i++) {
           for (int j=0; j<10; j++){
            int ingreso2 = leer.nextInt();
            Submatriz [i][j] = ingreso2;
           }
           }
               
            
       
   } 
   public static void RellenarMatriz (int[][] matriz) {
       for (int i=0; i<10 ; i++) {
           for (int j=0; j<10; j++){
               
               int ingreso = (int)(Math.random()*10);
               matriz [i][j]= ingreso;
       }
    }
    }  
   public static void ImprimirMatriz (int[][] matriz) {
       for (int i=0; i<10 ; i++) {
           for (int j=0; j<10; j++){
               
               System.out.print(matriz [i][j] + " ");
       }
     System.out.println(" ");
    }
    }
   public static void Validarmatriz (int[][] matriz, int[][] submatriz) {
        int auxf = 0;
        int auxc = 0;
       for (int i=0; i<10 ; i++) {
       
           for (int j=0; j<10; j++){
               
               if ( submatriz[auxf][auxc] == matriz[i][j] )
               {
                   auxc= auxc + 1;
             
            
                   
                   
                   
       
                  
                   if (auxc==2){
                       auxf= auxf + 1;
                       auxc= 0;
                   }
                   else {
                      auxf=0;
                      auxc=0;
                   }
                       
 
               }
               
               
          
       }
     
    }
    }
   
}
