
package Servicio;

import Entidades.Movil;
import java.util.Scanner;

public class MovilServicio {
    Scanner leer = new Scanner(System.in);
    Movil datos = new Movil();
    
    int [] vector = new int [7];
    
    public void cargarCelular() {
        
        System.out.println("Ingrese la marca del celular");
        datos.setMarca(leer.next());
        
       System.out.println("Ingrese el modelo");
       datos.setModelo(leer.nextInt());
        
       System.out.println("Cual es el precio del celular");
       datos.setPrecio(leer.nextDouble());
       
        System.out.println("Cual es la capacidad en memoria Ram");
        datos.setMemoriaRam(leer.nextInt());
        
        System.out.println("Cual es la capacidad en almacenamiento") ;
        datos.setAlmacenamiento(leer.nextInt());
        
    }
    
     public void ingresarCodigo() {
         
         for (int i = 0; i < 7; i++) {
             
               System.out.println("Ingrese el numero  #" + (i+1) + " del codigo");
               vector [i] = leer.nextInt();
             
         }
        
    }
    
    
}
