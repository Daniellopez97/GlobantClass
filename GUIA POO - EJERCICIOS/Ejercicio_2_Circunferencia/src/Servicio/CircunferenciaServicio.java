
package Servicio;

import Entidades.Circunferencia;
import java.util.Scanner;




public class CircunferenciaServicio {
    
    public  Circunferencia crearCircunferencia()
    {
        System.out.println("Cual es el radio");
        
        Circunferencia radio1 = new Circunferencia();
        Scanner leer = new Scanner(System.in);
        
        radio1.setRadio(leer.nextDouble());
        
        return radio1;
    }
    
    public void area( Circunferencia radio1 )
            
    {
        
       double area = Math.pow(radio1.getRadio(), 2) *Math.PI;
        
        System.out.println("El area de la circunferencia es " + area);
                 
    }
    
    public void perimetro ( Circunferencia radio1){
        
        double perimetro = 2*Math.PI*radio1.getRadio();
         System.out.println("El perimetro  de la circunferencia es " + perimetro);
    }
    
}
