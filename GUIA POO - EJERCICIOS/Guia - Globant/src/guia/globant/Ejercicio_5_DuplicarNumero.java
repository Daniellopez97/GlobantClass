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
public class Ejercicio_5_DuplicarNumero {
    
    public static void main(String[] arg) {
        
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingresa un numero");
       
       float numero = leer.nextFloat();
       
       System.out.println("El numero doble " + numero*2);
       System.out.println("El numero triple " + numero*3); 
       System.out.println("El numero triple " + Math.sqrt(numero)); 
    }
    
}
