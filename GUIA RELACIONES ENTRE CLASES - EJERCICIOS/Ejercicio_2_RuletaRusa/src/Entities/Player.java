
package Entities;

public class Player {
  private int id;
  
  private String name = "Player";
  
  private boolean mojado;
  
  public Player(int id) {
    this.id = id;
    this.name = "Jugador " + id;
    this.mojado = false;
  }

  public boolean Shooting(stirWater r) {
    if (r.Wet()) {
      this.mojado = true;
      return true;
    } 
    r.nextSquirt();
    return false;
  }
  
  public int getId() {
    return this.id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public boolean isMojado() {
    return this.mojado;
  }
  
  public void setMojado(boolean mojado) {
    this.mojado = mojado;
  }
  
  public Player() {}
}
