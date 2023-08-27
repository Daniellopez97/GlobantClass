package ejerciciogrupal_2;

import Servicio.AlquilerServicio;
import Servicio.PeliculaServicio;
import java.util.Scanner;

public class EjercicioGrupal_2 {

    public static void main(String[] args) {

        PeliculaServicio ps = new PeliculaServicio();
        AlquilerServicio as = new AlquilerServicio(ps);

        int opcion;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Elegir una opcion");
            System.out.println("1. cargar peliculas");
            System.out.println("2. Listar peliculas disponibles");
            System.out.println("3. Buscar pelicula por Titulo");
            System.out.println("4. Buscar pelicula por genero");
            System.out.println("5. Alquilar peliculas");
            System.out.println("6. Listar peliculas alquiladas");
            System.out.println("7. Buscar peliculas alquiladas por fecha de alquiler");
            System.out.println("8. Ingresos totales");
            System.out.println("9. Salir");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    ps.cargar();
                    break;
                case 2:
                    ps.imprimirPeliculas();
                    break;

                case 3:
                    as.BuscarTitulo();
                    ;
                    break;

                case 4:
                    as.BuscarGenero();
                    break;
                case 5:
                    as.crearAlquiler();
                    ;
                    break;
                case 6:
                    as.imprimirAlquileres();
                    break;

                case 7:
                    as.BuscarFecha();
                    break;

                case 8:

            }
        } while (opcion <= 8);

    }

}
