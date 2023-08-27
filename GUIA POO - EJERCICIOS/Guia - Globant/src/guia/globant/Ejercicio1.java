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
public class Ejercicio1 {
    
   public static void main (String[] args){
       
       Scanner leer = new Scanner(System.in);
       
       System.out.println("Ingresa un numero");
       int numero1 = leer.nextInt();
       
        System.out.println("Ingresa el siguiente numero");
       int numero2 = leer.nextInt();
       
       int suma = numero1 + numero2;
       
        System.out.println("La suma es igual a:" + suma);
   }
    
    
    
}
