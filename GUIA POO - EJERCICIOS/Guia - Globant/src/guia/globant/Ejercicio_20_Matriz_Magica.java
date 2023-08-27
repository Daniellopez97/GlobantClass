//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
//suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
//permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
//El programa deberá comprobar que los números introducidos son correctos, es decir,
//están entre el 1 y el 9.
package guia.globant;

import java.util.Scanner;

public class Ejercicio_20_Matriz_Magica {
   public static void main(String[] arg){
        
      
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el tamaño de la matriz");
        
        int n = leer.nextInt();
        int[][] matriz = new int [n][n];
        RellenarMatriz (n, matriz);
        int sumareferencia= matriz[0][0]+ matriz[0][1] + matriz[0][2];
        
       
       
        int Contador1= Validarfilas(matriz,n, sumareferencia);
        int Contador2=ValidarColumnas(matriz,n,sumareferencia);
        int Contador3=ValidarDiagonalizq(matriz,n,sumareferencia );
        int Contador4=ValidarDiagonalder(matriz,n,sumareferencia );
        
        if (Contador1==0 && Contador2==0 && Contador3==0 && Contador4==0 ){
            System.out.println("La matriz es magica");
        }
        else {
            System.out.println("No es magica");
        }
       
    }
   public static void RellenarMatriz ( int n, int[][] matriz) {
       Scanner leer = new Scanner(System.in);
       for (int i=0; i<n ; i++) {
           for (int j=0; j<n; j++){
               System.out.println("Ingresa el Numero en la posicion" + i + "," + j);
               int ingreso = leer.nextInt();
               if (ingreso>=1 && ingreso<=9) {
                 matriz[i][j] = ingreso;   
               }
               else
                  {
                    while (ingreso<1 || ingreso>9) {
                      
                     System.out.println("El numero debe estar entre el 1 y el 9, Ingresa un numero CORRECTO");
                       ingreso = leer.nextInt();   
                    }
                    System.out.println("Numero correcto");
                     matriz[i][j] = ingreso; 
                    }
             
           }   
       }
        
  
    }
   public static int Validarfilas(int[][] matriz, int n, int sumareferencia ) {
       
      
       int contf = 0;
        for (int i=0; i<n ; i++) {
           int suma=0;
           for (int j=0; j<n; j++){
               suma = suma + matriz[i][j];    
           }
          
           if (sumareferencia == suma){
               contf = contf + 0;
           }
           else {
               contf = contf + 1;
           }
     
    }
       
  return contf;   
    
}
   public static int ValidarColumnas(int[][] matriz, int n, int sumareferencia ) {
     int contc = 0;
        for (int i=0; i<n ; i++) {
           int suma=0;
           for (int j=0; j<n; j++){
               
               suma = suma + matriz[j][i];
                  
           }
           if (sumareferencia == suma){
               contc = contc + 0;
           }
           else {
               contc = contc + 1;
           } 
    }
       
  return contc;    
        
    }
   public static int ValidarDiagonalizq(int[][] matriz, int n, int sumareferencia ) {
     int contdi = 0;
     int suma=0;
        for (int i=0; i<n ; i++) {
           for (int j=0; j<n; j++){
               if (i==j) {
                suma = suma + matriz[j][i];   
               }      
           }
       
    }
   if (sumareferencia == suma){
               contdi = contdi + 0;
           }
           else {
               contdi = contdi + 1;
           }      
       
  return contdi;    
        
    }
   public static int ValidarDiagonalder(int[][] matriz, int n, int sumareferencia ) {
     int contde = 0;
     int auxi = n-1;
     int auxd = 0;
     int suma=0;
        for (int i=0; i<n ; i++) {
           for (int j=0; j<n; j++){
               if (i==auxd && j == auxi) 
               
               {
                suma = suma + matriz[j][i];
                
                auxd = auxd + 1;
                auxi = auxi - 1;
               }      
           }
       
    }
        
   if (sumareferencia == suma){
               contde = contde + 0;
           }
           else {
               contde = contde + 1;
           }      
       
  return contde;    
        
    } 
}