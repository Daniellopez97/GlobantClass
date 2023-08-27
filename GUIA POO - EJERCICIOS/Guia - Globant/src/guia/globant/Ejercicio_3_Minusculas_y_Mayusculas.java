/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.globant;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_3_Minusculas_y_Mayusculas {
    
   public static void main (String[] arg){
       
       Scanner leer = new Scanner(System.in);
       
       System.out.println("Ingresa una frase");
       
       String frase = leer.nextLine();
       
       System.out.println(frase.toUpperCase());
       System.out.println(frase.toLowerCase());
   }
    
}
