
package guia.globant;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_14_Conversor_Monedas {
    public static void main(String[] arg){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("CUANTOS EUROS DESEAS CONVERTIR");
        double euros = leer.nextDouble();
                
        
        System.out.println(" ACUAL MONEDA DESEAS CONVERTIR");
        System.out.println("A) DOLARES");
        System.out.println("B) YENES");
        System.out.println("C) LIBRAS");
        String cambio = leer.next();
        cambio= cambio.toUpperCase();
        convertirmoneda ( euros, cambio);
    }
    public static void convertirmoneda ( double euros, String cambio) {
        
        if (cambio.equals("A")){
          
           System.out.println("Los " + euros + " euros, equivalen a " + euros*1.28611 + " Dolares"  ); 
           
        }
        else if (cambio.equals("B")) {
            System.out.println("Los " + euros + " euros, equivalen a " + euros*129.852 + " Yenes"  ); 
        }
        else if (cambio.equals("C")){
             System.out.println("Los " + euros + " euros, equivalen a " + euros*0.86 + " Libras"  ); 
        }
        else
        {
            System.out.println("OPCION INCORRECTA");  
        }
    }
}


