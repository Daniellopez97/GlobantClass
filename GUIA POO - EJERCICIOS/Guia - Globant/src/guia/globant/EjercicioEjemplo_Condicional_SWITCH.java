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
public class EjercicioEjemplo_Condicional_SWITCH {
    
    public static void main(String[] arg){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Cual es el tipo de Motor");
        int tipomotor = leer.nextInt();
        
        switch (tipomotor) {
       
             case 1:
             System.out.println("La bomba es una bomba de agua");
             break;
             
             case 2:
             System.out.println("La bomba es una bomba de gasolina");  
             break;
             
             case 3:
             System.out.println("La bomba es una bomba de hormigón");  
             break;
             
             case 4:
             System.out.println("La bomba es una bomba de pasta alimenticia");  
             break;
             
             default:
             System.out.println("No existe un valor válido para tipo de bomba");    
        }                     
}
}