//Crear un programa que dibuje una escalera de números, donde cada línea de números
//comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
//usuario al comenzar. Ejemplo: si se ingresa el número 3: 
package Ejercicios_Extras;

import java.util.Scanner;


public class EjercicioExtra_13 {
public static void main(String[] arg){
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingresa el tamaño de la escalera");
       int n = leer.nextInt();
       int escalera=0;
       
       for ( int i=0; i<n; i++){
           
           if (i==0) {
          escalera = (i+1);
           }
           else {
               
          escalera = escalera*(10) + i+1;     
           }
           
        System.out.println(escalera);
       }
       
    }
    
}
