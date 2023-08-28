package Entities;

public class revolverAgua {
  private int posActual;
  
  private int posWater;
  
  public revolverAgua(int posActual, int posWater) {
    this.posActual = posActual;
    this.posWater = posWater;
  }
  
  public revolverAgua() {}
  
  public void llenarRevolver() {
    this.posActual = (int)(Math.random() * 6.0D);
    this.posWater = (int)(Math.random() * 6.0D);
  }
  
  public boolean mojar() {
    boolean validator = false;
    if (this.posActual == this.posWater)
      validator = true; 
    return validator;
  }
  
  public void siguienteChorro() {
    if (this.posActual < 6) {
      this.posActual++;
    } else {
      this.posActual = 1;
    } 
  }
  
  public void setPosActual(int posActual) {
    this.posActual = posActual;
  }
  
  public void setPosWater(int posWater) {
    this.posWater = posWater;
  }
  
  public int getPosActual() {
    return this.posActual;
  }
  
  public int getPosWater() {
    return this.posWater;
  }
}
