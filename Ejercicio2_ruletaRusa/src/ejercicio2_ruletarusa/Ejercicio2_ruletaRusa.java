
package ejercicio2_ruletarusa;

import Service.GameService;

public class Ejercicio2_ruletaRusa {

    public static void main(String[] args) {
        
        GameService gs = new GameService();
       
        gs.llenarJuego();
        gs.ronda();
       
 
    }
    
}
