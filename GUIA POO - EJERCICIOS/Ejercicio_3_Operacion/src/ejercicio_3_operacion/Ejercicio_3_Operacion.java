
package ejercicio_3_operacion;

import Entidades.Operacion;
import Servicio.OperacionServicio;


public class Ejercicio_3_Operacion {

    public static void main(String[] args) {
        
        OperacionServicio Op1 = new OperacionServicio();
        Operacion numero = Op1.crearOperacion();
        
        Op1.Sumar(numero);
        Op1.Restar(numero);
       Op1.Multiplicar(numero);
       Op1.Dividir(numero);
    }
    
}
