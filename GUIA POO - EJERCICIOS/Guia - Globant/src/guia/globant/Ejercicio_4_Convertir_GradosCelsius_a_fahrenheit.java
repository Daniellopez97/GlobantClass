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
public class Ejercicio_4_Convertir_GradosCelsius_a_fahrenheit {
    
 public static void main (String[] arg){

Scanner leer = new Scanner(System.in);

System.out.println("Ingresa Los grados centrigados a convertir a fahrenheit");

double grados= leer.nextDouble();

double convertir = 32 + (9*grados/5);

System.out.println("Los " + grados + " C° es equivalente a " + convertir + " F°");

 }  
}
