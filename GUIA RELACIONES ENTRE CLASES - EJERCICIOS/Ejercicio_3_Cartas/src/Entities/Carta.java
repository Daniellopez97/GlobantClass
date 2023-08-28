
package Entities;


public class Carta {
    
    
    private int  numCarta;
    private String palo;

    public Carta() {
    }

    public Carta(int numCarta, String palo) {
        this.numCarta = numCarta;
        this.palo = palo;
    }

    public int getNumCarta() {
        return numCarta;
    }

    public void setNumCarta(int numCarta) {
        this.numCarta = numCarta;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{"  + numCarta + " de " + palo + '}';
    }

    

}

