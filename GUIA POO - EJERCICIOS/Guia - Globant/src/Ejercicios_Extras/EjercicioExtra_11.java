//Escribir un programa que lea un número entero y devuelva el número de dígitos que
//componen ese número. Por ejemplo, si introducimos el número 12345, el programa
//deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
//de división. Nota: recordar que las variables de tipo entero truncan los números o
//resultados.
package Ejercicios_Extras;
import java.util.Scanner;
public class EjercicioExtra_11 {
public static void main(String[] arg){
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingresa un numero");
       int n = leer.nextInt();
       int cont = 0;
       while (n>0) { 
         n = (n/10); 
         cont = cont + 1;    
       }
      System.out.println("La cantidad de digitos que contiene el numero son " + cont); 
      }  
}
