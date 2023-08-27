
package ejercicio_4_cinecargarpeliculas;

import Servicio.PeliculaServicio;


public class Ejercicio_4_CineCargarPeliculas {


    public static void main(String[] args) {
 
        PeliculaServicio ps = new PeliculaServicio();
        
        ps.ingresarpelicula();
        ps.MostrarPeliculas();
        ps.OrdenarMayor1hora();
        ps.OrdenarMayorDuracion();
        ps.OrdenarMenorDuracion();
        ps.OrdenarPorTitulo();
        ps.OrdenarPorDirector();
    }
    
}
