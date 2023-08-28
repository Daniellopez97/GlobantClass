
package Service;

import Entities.Player;
import Entities.revolverAgua;
import java.util.ArrayList;

public class GameService {
  private int capMax = 6;
  private ArrayList<Player> Players = new ArrayList<>();
  
  private revolverAgua r = new revolverAgua();
  
  public void llenarjuego() {
    for (int i = 1; i < capMax + 1; i++)
      Players.add( new Player(i));
    
    r.llenarRevolver();
    System.out.println("juego preparado, los 6 jugadores se encuentran listos");
    System.out.println("LA POSICION DEL AGUA ASESINA ES : " + r.getPosWater());
    System.out.println("_________________________________________");
  }
  
  public void  ronda() {
    for (Player Player : Players) {
      System.out.println("Posicion Actual del revolver: " + this.r.getPosActual());
      System.out.println("El " + Player.getName() + " se esta preparando para disparar....................");
      if (Player.disparo(this.r)) {
        System.out.println("EL JUEGO HA TERMINADO,  EL " + Player.getName() + " Se ha matado con agua");
        break;
      } 
      System.out.println("TE SALVASTE, PASALE EL REVOLVER AL SIGUIENTE JUGADOR");
      System.out.println("____________________________________________");
    } 
  }
}
