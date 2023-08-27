
package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;

public class ServicioCafetera {
    
    Scanner leer = new Scanner(System.in);
     Cafetera datos = new Cafetera();
    public Cafetera llenarCafetera()
    {
     
        
        
        System.out.println("Cual es la capacidad maxima de la cafetera:");   
        datos.setCapacidadMaxima(leer.nextInt());
        
         System.out.println("Cual  es la cantidad actual en la cafetera:");
         datos.setCantidadActual(leer.nextInt());
        
         System.out.println("la cafetera se ha llenado a su maximo");
         datos.setCantidadActual(datos.getCapacidadMaxima());
        
        return datos;
    }
    
    public void servirTaza(  int tamañoTaza ){
          System.out.println("Cual es el tamaño de la taza");
          tamañoTaza = leer.nextInt();
          
          if ( datos.getCantidadActual()<tamañoTaza) {
              tamañoTaza = datos.getCantidadActual();
              
              System.out.println("No alcanza para llenar la taza, quedo en la taza " + tamañoTaza );
              
              datos.setCantidadActual(0);
          }
          else
          {
              System.out.println("La taza fue llenada totalmente, cantidad en taza" + tamañoTaza);
              
              datos.setCantidadActual(datos.getCantidadActual()-tamañoTaza);
          }
          
        
    }
    
    public void vaciarCafetera() {
         datos.setCantidadActual(0);
        System.out.println("Se ha vaciado la cafetera" ); 
        System.out.println("Cantidad actual : " + datos.getCantidadActual() ); 
    }
    
    public void agregarCafe( int cantidadCafe) {
        
        System.out.println("Cual es la cantidad de cafe a añadir");
        cantidadCafe = leer.nextInt();
        
        if (cantidadCafe + datos.getCantidadActual()>datos.getCapacidadMaxima())
            
        {
            System.out.println("la cafetera ha alcanzado su capacidad maxima " + datos.getCantidadActual());
        }
        else
        {
           datos.setCantidadActual(datos.getCantidadActual()+cantidadCafe);
            System.out.println("Se ha añadido el cafe corrrectamente, el cafe acual es : " + datos.getCantidadActual());
        }
          
    }
    
}
