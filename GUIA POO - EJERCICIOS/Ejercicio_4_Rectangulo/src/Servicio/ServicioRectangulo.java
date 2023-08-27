
package Servicio;

import Entidades.Rectangulo;
import java.util.Scanner;


public class ServicioRectangulo {
    
    public Rectangulo CrearRectangulo(){
        
        Scanner leer = new Scanner(System.in);
        Rectangulo v1 = new Rectangulo();
        System.out.println("Cual es la altura del rectangulo");
        
        v1.setAltura(leer.nextInt());
        
         System.out.println("Cual es la base del rectangulo");
        
        v1.setBase(leer.nextInt());
       
       return v1;
        
    }
    public void CalcularSuperficie ( Rectangulo v1){
        
        int superficie = v1.getAltura()*v1.getBase();
        System.out.println("La superficie del rectangulo es de :" + superficie); 
        
    }
    public void CalcularPerimeto ( Rectangulo v1){
        
        int perimetro = (v1.getAltura()+v1.getBase())*2;
        System.out.println("El perimetro del rectangulo es de :" + perimetro); 
        
    }
    public void DibujarRectangulo( Rectangulo v1){
        
        for (int i = 0; i < v1.getBase(); i++) {
            
            for (int j = 0; j < v1.getAltura(); j++) {
                
                if (i==0 || i==v1.getBase()-1  ||  j== v1.getAltura()-1 || j==0) {
                    
                    System.out.print("*"); 
                }
                else {
                      System.out.print(" ");  
            }
               
        }
            System.out.println("");    
        
        }
        
    } 
}
