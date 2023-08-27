
package Servicio;

import Entidades.DNIs;
import java.util.Scanner;

public class DNIsServicio {
    
    Scanner leer = new Scanner(System.in);
    DNIs datos = new DNIs();
    
    
    public void crearNif() {
        
    System.out.println("Cual es el DNI de la persona, max 8 digitos");
        
    datos.setDNI(leer.nextLong());
    
    String DniCadena = String.valueOf(datos.getDNI());
    
    while ( !(DniCadena.length()==8)){
    
        System.out.println("El DNI no es correcto, debe ser un numero de 8 digitos, ingresa el correcto");
        datos.setDNI(leer.nextLong());
        DniCadena = String.valueOf(datos.getDNI());
    }
        
    
        long calculo = ((datos.getDNI())%23); // Se calcula el resto
        
         String [] vector = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
         
         for (int i = 0; i < 23; i++) {
             
             if (calculo == i){
                 
                 datos.setLetra(vector[i]);
             }
            
        }
                     
    }
    
    public void mostrar(){
        
        System.out.println(datos.getDNI() + "-" + datos.getLetra());
    }
    
}
