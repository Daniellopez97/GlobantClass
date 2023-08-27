
package Entidades;

import java.util.ArrayList;


public class Raza {
    
   private ArrayList <String>Razas = new ArrayList();

    public Raza() {
    }
    
     public void agregarRaza(String raza) {
        Razas.add(raza);
    }

    public ArrayList<String> getRazas() {
        return Razas;
    }
    
    

    public void setRazas(ArrayList<String> Razas) {
        this.Razas = Razas;
    }

    
  
    @Override
    public String toString() {
        return "Raza{" + "Razas=" + Razas + '}';
    }
    
    
}
