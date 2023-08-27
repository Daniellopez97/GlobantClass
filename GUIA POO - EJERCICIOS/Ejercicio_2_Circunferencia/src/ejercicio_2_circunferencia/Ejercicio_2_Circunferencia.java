
package ejercicio_2_circunferencia;

import Entidades.Circunferencia;
import Servicio.CircunferenciaServicio;

public class Ejercicio_2_Circunferencia {

    
    public static void main(String[] args) {
        
        CircunferenciaServicio C1 = new  CircunferenciaServicio();
        Circunferencia radio =  C1.crearCircunferencia();
        C1.area(radio);
        C1.perimetro(radio);

    }
    
}
