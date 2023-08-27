
package ejercicio_1_libros;


import Servicio.LibroServicio;


public class Ejercicio_1_Libros {

    public static void main(String[] args) {
    
        LibroServicio registro1 = new LibroServicio();
        
       registro1.RegistrarLibro();  // no llamar, no utilizar entidades,  la clase libro no tocarla.. El servicio
       
        System.out.println(registro1);
        
        
    }
    
}
