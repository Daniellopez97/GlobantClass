//Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
// equivalente en romano
package Ejercicios_Extras;
import java.util.Scanner;

public class EjercicioExtra_4 {
    
     public static void main(String[] arg){
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingresa un numero entre 1 y 9");
       int numero = leer.nextInt();
       
       switch (numero) {
          
           case 1:
               System.out.println(numero + " es equivalente en numero romano a I");
               break;
           case 2:
               System.out.println(numero + " es equivalente en numero romano a II");
               break;
           case 3:
               System.out.println(numero + " es equivalente en numero romano a III");
               break;
           case 4:
               System.out.println(numero + " es equivalente en numero romano a IV");
               break;
           case 5:
               System.out.println(numero + " es equivalente en numero romano a V");
               break;
           case 6:
               System.out.println(numero + " es equivalente en numero romano a VI");
               break;
           case 7:
               System.out.println(numero + " es equivalente en numero romano a VII");
               break;
           case 8:
               System.out.println(numero + " es equivalente en numero romano a VIII");
               break;
           case 9:
               System.out.println(numero + " es equivalente en numero romano a IX");
               break;
           case 10:
               System.out.println(numero + " es equivalente en numero romano a X");
               break;
           default:
               System.out.println(numero + " No se encuentra entre el 1 y 10, ingresa un numero correcto");
       }
         
     }
}
