package Servicio;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeliculaServicio {

    List<Pelicula> peliculas = new ArrayList<>();
    Scanner leer = new Scanner(System.in);

    public void cargar() {
        System.out.print("Ingrese el título de la película: ");
        String titulo = leer.nextLine();

        System.out.print("Ingrese el género de la película: ");
        String genero = leer.nextLine();

        System.out.print("Ingrese el año de la película: ");
        int anio = leer.nextInt();

        System.out.print("Ingrese la duración de la película (en minutos): ");
        int duracion = leer.nextInt();

        Pelicula pelicula = new Pelicula(titulo, genero, anio, duracion);
        peliculas.add(pelicula);

        leer.nextLine();
        System.out.println("Película creada exitosamente.");

    }

    public void imprimirPeliculas() {
        System.out.println("Lista de películas:");
        for (Pelicula pelicula : peliculas) {
            System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Género: " + pelicula.getGenero());
            System.out.println("Año: " + pelicula.getAnio());
            System.out.println("Duración: " + pelicula.getDuracion() + " minutos");
            System.out.println();
        }

    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
}
