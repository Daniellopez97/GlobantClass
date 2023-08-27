package Servicio;

import Entidades.Alquiler;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AlquilerServicio {

    Scanner leer = new Scanner(System.in);
    Alquiler datos = new Alquiler();
    private List<Alquiler> PeliculasAlquiladas = new ArrayList<>();
    private PeliculaServicio peliculaServicio; // necesario para obtener los atributos de peliculaservicio
    private double costo;
    private LocalDate fechasalida;
    private LocalDate fechaentrada;

    // Utilizamos un constructor para acceder al objeto PeliculaServicio - acceso a atributos y metodos

    public AlquilerServicio(PeliculaServicio peliculaServicio) {
        this.peliculaServicio = peliculaServicio;
    }


    public void crearAlquiler() {
        int cont;
        String tituloalquilado = "";

        do {
            cont = 0;
            System.out.println("****** Las películas disponibles actualmente ******");
            peliculaServicio.imprimirPeliculas();

            System.out.println("¿Cuál película deseas alquilar?");
            datos.setNombrepelicula(leer.next());

            for (Pelicula pelicula : peliculaServicio.getPeliculas()) {       // Se utiliza el getter, no es necesario crear una lista para almacenar la lista de peliculaservicio 
                if (pelicula.getTitulo().equals(datos.getNombrepelicula())) {
                    tituloalquilado = datos.getNombrepelicula();
                    cont = 1;
                }
            }

            if (cont == 1) {
                System.out.println("El título se encuentra disponible para su alquiler.");
            } else {
                System.out.println("Lo sentimos, en este momento no tenemos disponible el título que buscas.");
            }
        } while (cont == 0);

        // Registro de alquiler, fecha de ingreso y regreso de la película
        System.out.println("****** ¿Cuál es la fecha en la que se está realizando el alquiler? (formato: dd/mm/yyyy) ******");
        String fechaString = leer.next();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        fechasalida = LocalDate.parse(fechaString,formato);

        System.out.println("****** ¿Cuál es la fecha para devolver la película alquilada? (formato: dd/mm/yyyy) ******");
        fechaString = leer.next();
        formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        fechaentrada = LocalDate.parse(fechaString, formato);

        ingresototal();

        Alquiler alquiler = new Alquiler(fechasalida, fechaentrada, costo, tituloalquilado);

        PeliculasAlquiladas.add(alquiler);
    }

    public void imprimirAlquileres() {
        System.out.println("Lista de películas alquiladas:");
        for (Alquiler alquiler : PeliculasAlquiladas) {
            System.out.println("Título: " + alquiler.getNombrepelicula());
            System.out.println("Fecha de salida: " + alquiler.getFechainicio());
            System.out.println("Fecha de regreso: " + alquiler.getFechaFin());
            System.out.println("Costo del servicio: $" + alquiler.getPrecio());
            System.out.println("____________________________");
        }
    }

    public double ingresototal() {
        int dias = fechasalida.until(fechaentrada).getDays();
        System.out.println("El número de días que solicitaste el alquiler es de " + dias);

        System.out.println("El costo total del alquiler es:");

        if (dias > 3) {
            costo = 10 + ((dias - 3) * (10 * 0.1));
            System.out.println("$" + costo + " (incluido intereses)");
        } else {
            costo = 10;
            System.out.println("$" + costo + " (sin intereses)");
        }

        return costo;
    }

    public void BuscarTitulo() {

        System.out.println("¿Ingresa el nombre de la pelicula que deseas verificar si existe o no ?");
        String titulobuscar = leer.next();
        int contaux = 0;

        for (Pelicula pelicula : peliculaServicio.getPeliculas()) {
            if (pelicula.getTitulo().equals(titulobuscar)) {
                contaux = 1;
            } else {
                contaux = contaux + 0;
            }

        }
        if (contaux == 1) {
            System.out.println(" El titulo si existe");
        } else {

            System.out.println(" El titulo no existe");
        }

    }

    public void BuscarGenero() {

        System.out.println("¿Ingresa el nombre de la pelicula que deseas verificar si existe o no ?");
        String generobuscar = leer.next();
        int contaux = 0;

        for (Pelicula pelicula : peliculaServicio.getPeliculas()) {
            if (pelicula.getGenero().equals(generobuscar)) {
                contaux = 1;
            } else {
                contaux = contaux + 0;
            }
        }

        if (contaux == 1) {
            System.out.println(" El titulo si existe");
        } else {

            System.out.println(" El titulo no existe");
        }

    }

    public void BuscarFecha() {
        int contaux = 0;
        System.out.println("¿Buscar un alquiler por fecha ?");

        String fechabuscar = leer.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechabuscada = LocalDate.parse(fechabuscar, formatter);

        for (Alquiler alquiler : PeliculasAlquiladas) {
            if (alquiler.getFechainicio().equals(fechabuscada)) {
                System.out.println(" El titulo si existe");
                System.out.println("____________________________");
                System.out.println("Título: " + alquiler.getNombrepelicula());
                System.out.println("Fecha de salida: " + alquiler.getFechainicio());
                System.out.println("Fecha de regreso: " + alquiler.getFechaFin());
                System.out.println("Costo del servicio: $" + alquiler.getPrecio());
                System.out.println("____________________________");

            } else {
                contaux = 1;
            }

            if (contaux == 1) {
                System.out.println(" No se dispone un titulo con esa fecha de alquiler");

            }
        }
    }
}
            
            
