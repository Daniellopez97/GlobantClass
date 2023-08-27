
package Entities;

import java.util.HashMap;



public class Ciudad {
    
    private String nameCiudad;
    private int codigoPostal;
    private HashMap <String, Integer> ciudadMap = new HashMap();

    
 public void agregarCiudad( String nameCiudad, int coidgoPostal){
     
     ciudadMap.put(nameCiudad, coidgoPostal);
     
 }   
    
    public Ciudad() {
    }

    public Ciudad(String nameCiudad, int codigoPostal) {
        this.nameCiudad = nameCiudad;
        this.codigoPostal = codigoPostal;
    }

    public String getNameCiudad() {
        return nameCiudad;
    }

    public void setNameCiudad(String nameCiudad) {
        this.nameCiudad = nameCiudad;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public HashMap<String, Integer> getCiudad() {
        return ciudadMap;
    }

    public void setCiudad(HashMap<String, Integer> ciudad) {
        this.ciudadMap = ciudad;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nameCiudad=" + nameCiudad + ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudadMap+ '}';
    }
    
    
    
    
}
