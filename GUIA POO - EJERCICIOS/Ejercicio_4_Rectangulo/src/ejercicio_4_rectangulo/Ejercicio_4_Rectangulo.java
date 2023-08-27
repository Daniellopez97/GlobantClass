
package ejercicio_4_rectangulo;

import Entidades.Rectangulo;
import Servicio.ServicioRectangulo;


public class Ejercicio_4_Rectangulo {

 
    public static void main(String[] args) {
        
        ServicioRectangulo Registro1 = new ServicioRectangulo();
        Rectangulo v1 = Registro1.CrearRectangulo();
        
        Registro1.CalcularSuperficie(v1);
        Registro1.CalcularPerimeto(v1);
        Registro1.DibujarRectangulo(v1);
        
       
    }
    
}
