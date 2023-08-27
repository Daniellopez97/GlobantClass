
package ejercicio_12_persona;

import Servicio.PersonaServicio;

public class Ejercicio_12_Persona {

    public static void main(String[] args) {
   
        PersonaServicio ps = new PersonaServicio();
         
        ps.crearPersona();

        ps.calcularEdad(); // Devuelve la edad
       
        ps.menorQue(ps.calcularEdad());
        ps.mostrarPersona(ps.calcularEdad());
    }
    
}
