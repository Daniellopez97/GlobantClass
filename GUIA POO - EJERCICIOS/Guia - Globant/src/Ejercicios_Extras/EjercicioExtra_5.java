
package Ejercicios_Extras;
import java.util.Scanner;

public class EjercicioExtra_5 {
    public static void main(String[] arg){
       Scanner leer = new Scanner(System.in);
       System.out.println("Que tipo de socio es");
       String socio = leer.next();
       socio = socio.toUpperCase();
       System.out.println("Digite el Costo del tratamiento");
       double costo = leer.nextDouble();
       
       switch (socio) {
          
           case "A":
               costo = costo*0.5;
               System.out.println("El socio " + socio + " debera pagar en efectivo: $" + costo);
               break;
           case "B":
               costo = costo*0.65;
               System.out.println("El socio " + socio + " debera pagar en efectivo: $" + costo);
               break;
           case "C":
              System.out.println("El socio " + socio + " debera pagar en efectivo: $" + costo);
              break;
           default:
               System.out.println("Dato incorecto");
       }    
    }
}
