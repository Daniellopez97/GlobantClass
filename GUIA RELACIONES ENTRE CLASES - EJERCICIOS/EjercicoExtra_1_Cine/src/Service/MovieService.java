
package Service;

import Entities.Cinema;
import Entities.Movie;
import Entities.Viewer;
import java.util.ArrayList;
import java.util.Scanner;


public class MovieService {
    
    private Scanner read = new Scanner(System.in);
    private String auxTheater [][] = new String [8][9];
    private ArrayList <Viewer> ListViewer =new ArrayList();
    Cinema cinema = new Cinema();
    private Movie movie;
    private Viewer viewer;
    
    
    
    public void registerMovie() {
        
        System.out.println("Cual es el nombre de la pelicula");
        String title = read.next();
        System.out.println("Duracion de la pelicula");
        int duration = read.nextInt();
        System.out.println("edad minima para ver la pelicula");
        int minAge = read.nextInt();
        
        System.out.println("Cual es el director de la pelicula");
        String director = read.next();
        
         movie = new Movie( title,duration,minAge,director);
        
    }
    
    public void  createRandomViewer() {
        
        for (int i = 0; i < 100; i++) {
            
            String name = "daniel " + i;
            int age = (int) (Math.random()*90);
            double priceTicket = Math.random()*500;
            
        viewer = new Viewer(name,age,priceTicket);
        ListViewer.add(viewer);
        }

    }

    public void fillTeather() {

        cinema.setMovie(movie.getTitle());
        cinema.setPriceTicket(200);

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 6; j++) {

                auxTheater[i][j] = " ";
            }

        }
        cinema.setTheater(auxTheater);
    }
    
    public void simulacion() {

        for (Viewer viewer1 : ListViewer) {
  
            if (viewer1.getAvailableMoney() >= cinema.getPriceTicket() && viewer1.getAge() >= movie.getMinAge()) {
              boolean flag = true;
                do {

                    int fila = (int) (Math.random() * 8);
                    int col = (int) (Math.random() * 6);

                    if (cinema.getTheater()[fila][col].equals(" ")) {

                        cinema.getTheater()[fila][col] = "X";
                        flag = false;
                    }

                } while (flag);

            } else if (viewer1.getAvailableMoney() <= cinema.getPriceTicket()) {

                System.out.println(viewer1.getName() + " No dispone del dinero necesario para el ticket, el saldo actual es : " + viewer1.getAvailableMoney());

            } else {

                System.out.println(viewer1.getName() + " tiene " + viewer1.getAge() + " Años, y la pelicula es para personas mayores de " + movie.getMinAge() + " Años");
            }

        }

    }

    public void printCinema() {
        
           for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 6; j++) {
                
                System.out.print(cinema.getTheater()[i][j] + " ");
                
            }
            
               System.out.println("");
            }

        

}

}

