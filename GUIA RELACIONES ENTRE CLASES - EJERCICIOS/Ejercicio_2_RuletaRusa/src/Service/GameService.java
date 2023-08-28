
package Service;

import Entities.Player;
import Entities.stirWater;
import java.util.ArrayList;

public class GameService {
  private int capMax = 6;
  private ArrayList<Player> Players = new ArrayList<>();
  
  private stirWater r = new stirWater();
  
  public void createGame() {
    for (int i = 1; i < capMax + 1; i++)
      Players.add( new Player(i));
    
    r.fillGun();
    System.out.println("Game ready, the six players are ready");
    System.out.println("The position killer water is : " + r.getPosWater());
    System.out.println("_________________________________________");
  }
  
  public void  round() {
    for (Player Player : Players) {
      System.out.println("Posicion Actual del revolver: " + this.r.getPosActual());
      System.out.println("El " + Player.getName() + " se esta preparando para disparar....................");
      if (Player.Shooting(this.r)) {
        System.out.println("EL JUEGO HA TERMINADO,  EL " + Player.getName() + " Se ha matado con agua");
        break;
      } 
      System.out.println("TE SALVASTE, PASALE EL REVOLVER AL SIGUIENTE JUGADOR");
      System.out.println("____________________________________________");
    } 
  }
}
