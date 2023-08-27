
package ejercicio_11_fecha;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio_11_Fecha {

    public static void main(String[] args) {
         
        Scanner leer = new Scanner(System.in);
        int dia, mes, anio;
        
        System.out.println("Cual fue el año de nacimiento");
           anio = leer.nextInt();
          System.out.println("Cual fue el mes de nacimiento");
           mes = leer.nextInt(); 
         System.out.println("Cual fue el dia de nacimiento");
           dia = leer.nextInt();
         
         Date fecha = new Date(anio-1900,mes-1,dia);
         Date fechaActual = new Date();       
         
         int anios= fechaActual.getYear()-fecha.getYear();
         
         System.out.println(fecha);
                 
         System.out.println("Los años que hay entre las dos fechas son " + anios + " Años");
         
    }
    
}
