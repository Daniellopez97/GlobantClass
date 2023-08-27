
package Servicio;

import Entidades.Puntos;
import java.util.Scanner;


public class PuntosServicio {
    
    Puntos datos = new Puntos();
    Scanner leer = new Scanner(System.in);
    
    
    
    
    public void crearPuntos(){
        
        System.out.println("Ingresa la primera coordenada");
        System.out.println("X :");
        datos.setX1(leer.nextInt());
        System.out.println("Y : ");
        datos.setY1(leer.nextInt());
        
        System.out.println("Ingresa la segunda coordenada");
        System.out.println("X :");
        datos.setX2(leer.nextInt());
        System.out.println("Y : ");
        datos.setY2(leer.nextInt());
        
    }
    
    public void calcularDistancia(){
        
        
        double  distancia = Math.pow((datos.getX2()-datos.getX1()),2) + Math.pow((datos.getY2()-datos.getY1()), 2);
        System.out.println(distancia);
        distancia = Math.sqrt(distancia);
        
        System.out.println("La distancia entre los puntos es de : " + distancia);
              
    
        
    }
    
}
