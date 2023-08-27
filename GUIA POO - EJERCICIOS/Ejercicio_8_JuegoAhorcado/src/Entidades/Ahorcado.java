
package Entidades;

public class Ahorcado {
    
    String [] palabraBuscar;
    private int longitudPalabra;
    private int intentosMax;
    private int letrasEncontradas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraBuscar, int longitudPalabra, int intentosMax, int letrasEncontradas) {
        this.palabraBuscar = palabraBuscar;
        this.longitudPalabra = longitudPalabra;
        this.intentosMax = intentosMax;
        this.letrasEncontradas = letrasEncontradas;
    }

    public String[] getPalabraBuscar() {
        return palabraBuscar;
    }

    public void setPalabraBuscar(String[] palabraBuscar) {
        this.palabraBuscar = palabraBuscar;
    }

    public int getLongitudPalabra() {
        return longitudPalabra;
    }

    public void setLongitudPalabra(int longitudPalabra) {
        this.longitudPalabra = longitudPalabra;
    }

    public int getIntentosMax() {
        return intentosMax;
    }

    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }
    

  
    
    
    
    
}
