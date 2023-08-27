/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Extras;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EjercicoExtra_9 {
     public static void main(String[] arg){
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingresa un numero");
       int a = leer.nextInt();
       System.out.println("Ingresa otro numero");
       int b = leer.nextInt();
       
       System.out.println("La division de " + a + "/" +b);
       int residuo = 0;
       int cont = 0;
       do {
         residuo =  a - b;
         cont = cont + 1;
         System.out.println( a + "-" + b + "=" + residuo + " " + cont + " restas realizada");
          a = residuo;
           
       } while (residuo>b);
           
     System.out.println("dado a que " + residuo +  " es menor que " + b + ", entonces: el residuo es " + residuo + " y el cociente es " + cont);   
       
     }
    
}