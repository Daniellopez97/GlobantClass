package Service;

import Entities.Libro;
import java.util.HashSet;
import java.util.Scanner;

public class LibroService {

    private Scanner read = new Scanner(System.in);
    private HashSet<Libro> libroSet = new HashSet();

   public void registerBook() {

        String answer = "";
        do {
            System.out.println("Ingresa el titulo del libro");
            String titulo = read.nextLine();

            System.out.println("Ingresa el autor del libro");
            String autor = read.nextLine();

            System.out.println("Ingresa el Numero de ejemplares del libro");
            int numEjem = read.nextInt();

            Libro libro = new Libro(titulo, autor, numEjem);
            libroSet.add(libro);

            System.out.println("Deseas ingresar otro libro SI/NO");
            answer = read.next();

            read.nextLine();
        } while (answer.equals("SI"));

    }

    public void loan() {

        System.out.println("Cual libro deseas para prestamo");

        String tituloPrestamo = read.nextLine();
        boolean flag = true;

        for (Libro libro : libroSet) {

            if (libro.getTitulo().equals(tituloPrestamo)) {

                if (libro.getNumEjemplar() >= 1) {
                    libro.setNumEjemplarPrestado(libro.getNumEjemplarPrestado() + 1);
                    libro.setNumEjemplar(libro.getNumEjemplar() - 1);
                    System.out.println("Prestamo Exitoso, disfruta del libro");
                    flag = false;

                } else {
                    System.out.println("El libro actualmente no cuenta con ejemplares disponibles, intentalo en otra ocasion.");
                    flag = false;
                }

              
            }

        }
          if (flag) {
                    System.out.println("El libro aun no se tiene disponible en la biblioteca");
                }

    }

    public void returnBook() {
        System.out.println("Cual libro deseas  devolver a la biblioteca");

        String tituloReturn = read.nextLine();
        boolean flag= true;

        for (Libro libro : libroSet) {

            if (libro.getTitulo().equals(tituloReturn)) {

                if (libro.getNumEjemplarPrestado() >= 1) {
                    libro.setNumEjemplarPrestado(libro.getNumEjemplarPrestado() - 1);
                    libro.setNumEjemplar(libro.getNumEjemplar() + 1);
                    System.out.println("El libro fue recibido exitosamente en la biblioteca, Gracias por la entrega");
                    flag= false;

                } else {
                    System.out.println(" No se puede devolver el libro, porque no se tienen ejemplares prestados");
                     flag= false;
                }

            }
     
        }
               if (flag){
                System.out.println("El libro no se encuentra en nuestra base de datos, intenta de nuevo");
            
            }
    }
        

    public void printBook() {

        for (Libro libro : libroSet) {

            System.out.println("Libro: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("No Ejemplares Disponibles: " + libro.getNumEjemplar());
            System.out.println("No Ejemplares en prestamo:" + libro.getNumEjemplarPrestado());
            System.out.println("__________________________________");

        }
    }

}
