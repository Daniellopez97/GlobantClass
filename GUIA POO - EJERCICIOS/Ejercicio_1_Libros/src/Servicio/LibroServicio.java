
package Servicio;

import Entidades.Libro;
import java.util.Scanner;


public class LibroServicio {
      Libro l1 = new  Libro();
        
        Scanner leer = new Scanner(System.in);
    
    public Libro RegistrarLibro() {
        
      
        
        System.out.println("Ingrese el ISBN del libro");
        l1.setIsbn(leer.nextInt());
         System.out.println("Cual es el titulo del libro");
        l1.setTitulo(leer.next());
         System.out.println("Ingrese el Autor del libro");
        l1.setAutor(leer.next());
         System.out.println("Ingrese el numero de paginas del libro");
        l1.setPaginas(leer.nextInt());
        
        
     return l1;   
    }
    
}
