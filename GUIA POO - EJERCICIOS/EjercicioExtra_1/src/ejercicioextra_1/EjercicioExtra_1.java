
package ejercicioextra_1;

import Servicio.CancionServicio;

public class EjercicioExtra_1 {


    public static void main(String[] args) {
        
        CancionServicio cs = new CancionServicio();
        
        String titulo = "pollitos";
        String autor = "daniel";
        
        cs.registrarinfo(titulo, autor);

    }
    
}
