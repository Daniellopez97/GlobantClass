package Entities;



public class revolverAgua {

    private int posActual;
    private int posWater;

    public revolverAgua(int posActual, int posWater) {
        this.posActual = posActual;
        this.posWater = posWater;
    }

    public revolverAgua() {
    }

    public void llenarRevolver() {

        posActual = (int) (Math.random() * 6); // posicion actual
        posWater = (int) (Math.random() * 6); // Posicion de agua en el revolver
    }

    public boolean mojar() {

        boolean validator = false;
        if (posActual == posWater) {
            validator = true;
        }

        return validator;

    }

    public void siguienteChorro() {

        if (posActual < 6) {
            posActual += 1;
        } else {
            posActual = 1;
        }

    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public void setPosWater(int posWater) {
        this.posWater = posWater;
    }

    public int getPosActual() {
        return posActual;
    }

    public int getPosWater() {
        return posWater;
    }

}
