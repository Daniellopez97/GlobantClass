
package ejercicio_2_ruletarusa;

import Service.GameService;


public class Ejercicio_2_RuletaRusa {

  
    public static void main(String[] args) {
    
        GameService gs = new GameService();
        
          gs.llenarjuego();
          gs.ronda();
    }
    
}
