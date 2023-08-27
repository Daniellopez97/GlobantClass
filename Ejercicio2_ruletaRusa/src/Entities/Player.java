
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
            mojado = true;
            return true;

        } else {
            r.siguienteChorro();
            return false;
        }

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public Player() {
    }
    
    
    
}
