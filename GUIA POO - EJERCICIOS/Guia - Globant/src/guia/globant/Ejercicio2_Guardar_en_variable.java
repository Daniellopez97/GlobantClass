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
public class Ejercicio2_Guardar_en_variable {
    
    public static void main (String[] arg) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Cual es tu nombre");
        String nombre = leer.next();
        
        System.out.println("El nombre ingresado es: " +  nombre);
    }
    
}
    

