
package Servicio;

import Entidades.Raices;
import java.util.Scanner;

public class RaicesServicio {
    
    Scanner leer = new Scanner(System.in);
    Raices datos = new Raices();
    
    
    public void ingresardatos(){
        
        System.out.println("Ingresa el dato A");
        datos.setA(leer.nextInt());
         System.out.println("Ingresa el dato B");
        datos.setB(leer.nextInt());
         System.out.println("Ingresa el dato C");
        datos.setC(leer.nextInt());
    }
    
    
    public double getDiscriminante() {
        
        double discriminante = Math.pow(datos.getB(), 2) - (4*datos.getA()*datos.getC());
        
        
        return discriminante;
        
    }
    
    
    public boolean tieneRaices( double discriminante) {
        
        boolean validador= false;
        
        if (discriminante >=0){
            validador = true;
        }
        
      
        return validador;
    }
    
     public boolean tieneRaiz( double discriminante) {
         
       boolean validador2 = false;
       
             if (discriminante ==0){
            validador2 = true;
             }
             
             
       return validador2;
     }
     
     public void obtenerraices(boolean validador){
         
         if (validador = true) {
             
             
             
         }
         
     }
    
}
