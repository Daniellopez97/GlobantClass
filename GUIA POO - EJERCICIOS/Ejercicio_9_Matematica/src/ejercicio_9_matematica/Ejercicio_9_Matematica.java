
package ejercicio_9_matematica;

import Entidades.Matematica;
import Servicio.MatematicaServicio;

public class Ejercicio_9_Matematica {


    public static void main(String[] args) {
        
        Matematica m = new Matematica();
        MatematicaServicio cs = new MatematicaServicio();
        
        m.setNumero1(Math.random()*10);
        m.setNumero2(Math.random()*10);
        
        System.out.println(" Los numeros generados son :");
        System.out.println(" Numero (#1) " + m.getNumero1() );
        System.out.println(" Numero (#2) " + m.getNumero2() );  
        

        cs.devolverMayor(m);
        cs.calcularPotencia(m);
        cs.calcularRaiz(m);
    }
    
}
