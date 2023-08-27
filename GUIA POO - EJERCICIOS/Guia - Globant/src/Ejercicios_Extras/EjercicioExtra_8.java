
//Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
//detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
//la cantidad de números impares. Al igual que en el ejercicio anterior los números
//negativos no deben sumarse. Nota: recordar el uso de la sentencia break.

package Ejercicios_Extras;
import java.util.Scanner;


public class EjercicioExtra_8 {
    public static void main(String[] arg){
       Scanner leer = new Scanner(System.in);
       
       int n = 0;
       int par = 0;
       int impar = 0;
       int cont= 0;
      
       do {
          System.out.println("ingrese un numero");
           n = leer.nextInt();
          
   
          if (n>0){
                   
          cont = cont + 1;
            if (n%2==0){
             par = par + 1;   
            }
          else {
           impar = impar + 1;
          }  
          }
        
       } while (n%5!=0 );
       
       System.out.println("Total de numeros: " + cont);
       System.out.println("Numeros Par: " + par);
       System.out.println("Numeros Impar: " + impar);
       
    }
}
