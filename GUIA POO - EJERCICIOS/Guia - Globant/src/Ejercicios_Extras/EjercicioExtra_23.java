
package Ejercicios_Extras;

import java.util.Scanner;


public class EjercicioExtra_23 {
  public static void main(String[] arg){   
    
     
      
       String [][] matriz = new String [20][20];
       rellenarmatriz (matriz );
       mostrarmatriz (matriz );
  }
  
  public static void rellenarmatriz (String [][]matriz ) {
      
       for (int i=0; i<20; i++) {
           
           for(int j=0;j<20; j++){
               int numero = (int)(Math.random()*10);
               String numcadena = String.valueOf(numero);
             
                matriz[i][j]= numcadena;   
           }
       }
  }    
 public static void mostrarmatriz (String [][]matriz ) {
      
       for (int i=0; i<20; i++) {
           
           for(int j=0;j<20; j++){
               
              System.out.print(matriz[i][j] + "");
           }
          System.out.println("");
       }
   
     }
  
 public static void ingresarpalabras (String [][]matriz ) {
     int cont = 0;
Scanner leer = new Scanner(System.in);     
     while (cont< 5) {
         
          System.out.print("Ingresa la palabra " + (cont + 1));
         String palabra = leer.next();
         int filaaleatoria = (int)(Math.random()*20);
           for (int i=filaaleatoria; i<20; i++) {
                for(int j=0;j<20; j++){ 
                    
                    
         
                }
           }
         
         
         cont = cont + 1;
     } 
             
             
             
             
     
 }
 
}
