
package ejercicio_4_extra_codigopostal;

import Service.CiudadService;


public class Ejercicio_4_Extra_CodigoPostal {

    public static void main(String[] args) {
        
        CiudadService cs = new CiudadService();
        
        cs.register10City();
        cs.printCity();
        cs.searchCity();
        cs.registerCity();
        cs.removeCity();
        cs.printCity();
        

    }
    
}
