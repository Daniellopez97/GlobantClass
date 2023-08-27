//Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
//restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
//matemática y deben devolver sus resultados para imprimirlos en el main. 

package Ejercicios_Extras;

import java.util.Scanner;


public class EjercicioExtra_15 {
   public static void main(String[] arg){   
    Scanner leer = new Scanner(System.in);
       System.out.println("Ingresa dos numeros");
       
       int n1 = leer.nextInt();
       int n2 = leer.nextInt();
       
       System.out.println("Que operacion deseas realizar:");
       System.out.println("A) SUMA");
       System.out.println("B) RESTA");
       System.out.println("C) MULTIPLICACION");
       System.out.println("D) DIVISION");
       
       String eleccion = leer.next();
       eleccion = eleccion.toUpperCase();
       
        switch (eleccion) {
            
            case "A":
              
              System.out.println(suma( n1, n2));
              break;
            case "B":
              System.out.println(resta( n1, n2));
              break;
            case "C":
              System.out.println (multiplicacion( n1, n2));
              break;
            case "D":
             System.out.println (division( n1, n2));
             break;
        }
   }     
        
      public static int suma( int n1, int n2){
      int suma = n1 + n2;   
         
      return suma;
   }
      public static int resta( int n1, int n2){
      int resta = n1 - n2;   
         
      return resta;
   }
      public static int multiplicacion( int n1, int n2){
      int multiplicacion = n1 * n2;   
         
      return multiplicacion;
   }
      public static int division( int n1, int n2){
      int division = n1 / n2;   
         
      return division;
   }
}

