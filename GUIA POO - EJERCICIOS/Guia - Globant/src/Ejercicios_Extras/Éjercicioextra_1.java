
//Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
//usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.

package Ejercicios_Extras;
import java.util.Scanner;

public class Éjercicioextra_1 {
public static void main(String[] arg){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un tiempo en minutos");
        int ingreso = leer.nextInt();
        Convertir(ingreso); 

    }
public static void Convertir(int ingreso) {
       int horas =0;
       int dias =0;
         if (ingreso<1440){
             horas = ingreso/60;
             System.out.println(ingreso + " minutos es equivalente = " + horas + " horas");
         }
        else if (ingreso%1440==0) {
             
            dias = ingreso/1440;
            System.out.println(ingreso + " minutos es equivalente = " + dias + " dias");            
         }
        else  {
          dias = ingreso/1440;  //  Es una forma de truncar el valor ( al valor mas pequeño)
          horas = (ingreso - 1440*(dias))/60;
          System.out.println(ingreso + " minutos es equivalente = " + dias + " dias y " +  horas + " horas");
        }       
     }
}
