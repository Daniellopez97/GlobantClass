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
public class Ejercicio6_Par_Impar {
    public static void main(String[] arg) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero para validar si es par/impar");
        int numero = leer.nextInt();
        
        if (numero %2==0){
           System.out.println("Es un numero par");
        }
        else {
        System.out.println("es un numero Impar");
        }
            
      
        
        
    }}
