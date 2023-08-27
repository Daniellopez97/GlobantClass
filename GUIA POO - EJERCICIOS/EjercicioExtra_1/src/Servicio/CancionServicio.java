
package Servicio;

import Entidades.Cancion;


public class CancionServicio {
    
    Cancion datos = new Cancion();
    
     String titulo;
    String autor;
    
    public void registrarinfo( String titulo, String autor){
        
       datos.setAutor(autor);
       datos.setTitulo(titulo);
       
        System.out.println( datos.toString());
           
    }
}
