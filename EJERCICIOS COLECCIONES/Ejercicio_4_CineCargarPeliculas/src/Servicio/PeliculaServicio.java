package Servicio;

import Entidades.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaServicio {

    private ArrayList<Pelicula> ListaPeliculas = new ArrayList();
    private Scanner read = new Scanner(System.in);

    public void ingresarpelicula() {

        String respuesta;
        do {
            System.out.println("Titulo de la pelicula");
            String titulo = read.nextLine();
            System.out.println("Cual es el director de la pelicula");
            String director = read.nextLine();

            System.out.println("Cual es la duracion de la pelicula (en horas)");
            int duracion = read.nextInt();

            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            ListaPeliculas.add(pelicula);

            System.out.println("Deseas ingresar otra pelicula  SI/NO");
            respuesta = read.next().toUpperCase();
            read.nextLine();
        } while (respuesta.equals("SI"));

    }

    public void MostrarPeliculas() {

        for (Pelicula ListaPelicula : ListaPeliculas) {

            System.out.println("Titulo: " + ListaPelicula.getTitulo());
            System.out.println("Director: " + ListaPelicula.getDirector());
            System.out.println("Duracion: " + ListaPelicula.getDuracion() + " Horas");
            System.out.println("_ _ _ _ _ _ _ _");

        }
    }
    
    public void OrdenarMayor1hora() {

          System.out.println("____________________________________________");
        System.out.println("***PELICULAS QUE DURAN MAS DE UNA HORA***");
        for (Pelicula ListaPelicula : ListaPeliculas) {
            
            if( ListaPelicula.getDuracion()>1){        
            System.out.println("Titulo: " + ListaPelicula.getTitulo());
            System.out.println("Director: " + ListaPelicula.getDirector());
            System.out.println("Duracion: " + ListaPelicula.getDuracion() + " Horas");
            System.out.println("_ _ _ _ _ _ _ _");                
            }
            
           

            
        }
    }
    

    public void OrdenarMayorDuracion() {

        Collections.sort(ListaPeliculas, Comparadores.OrdenarPorDuracionMayor);
        System.out.println("____________________________________________");
        System.out.println("***PELICULAS DE DURACION MAYOR A MENOR***");

        MostrarPeliculas();
    }

    public void OrdenarMenorDuracion() {

        Collections.sort(ListaPeliculas, Comparadores.OrdenarPorDuracionMenor);
        System.out.println("____________________________________________");
        System.out.println("****PELICULAS DE DURACION DE MENOR A MAYOR***");

        MostrarPeliculas();
    }

    public void OrdenarPorTitulo() {

        Collections.sort(ListaPeliculas, Comparadores.OrdenarPorTitulo);
        System.out.println("____________________________________________");
        System.out.println("***PELICULAS ORDENADAS POR TITULO***");

        MostrarPeliculas();
    }

       public void OrdenarPorDirector() {

        Collections.sort(ListaPeliculas, Comparadores.OrdenarPorDirector);
        System.out.println("____________________________________________");
        System.out.println("***PELICULAS ORDENADAS POR DIRECTOR***");

        MostrarPeliculas();
    }

      
}
