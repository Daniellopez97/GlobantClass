
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



  
  public boolean disparo(revolverAgua r) {
    if (r.mojar()) {
      this.mojado = true;
      return true;
    } 
    r.siguienteChorro();
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
