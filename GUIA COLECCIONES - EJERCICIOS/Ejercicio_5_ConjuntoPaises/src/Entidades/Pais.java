
package Entidades;

import java.util.HashSet;
import java.util.TreeSet;


public class Pais {
    
    private TreeSet<String> Paises = new TreeSet();

    public Pais() {
    }
    
    public void Agregarpais(String pais){
        Paises.add(pais);
    }

    public TreeSet<String> getPaises() {
        return Paises;
    }

    public void setPaises(TreeSet<String> Paises) {
        this.Paises = Paises;
    }

    @Override
    public String toString() {
        return "Pais{" + "Paises=" + Paises + '}';
    }
    
    
    
    
}
