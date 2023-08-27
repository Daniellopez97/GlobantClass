
package ejercicio_3_extra_biblioteca;

import Service.LibroService;
import java.util.Scanner;


public class Ejercicio_3_Extra_Biblioteca {

    public static void main(String[] args) {
        
        LibroService ls = new LibroService();
        Scanner read = new Scanner(System.in);
        
        int answer;
        do {
        System.out.println("MENU PRINCIPAL");
        System.out.println("1) Registrar libros");
        System.out.println("2) Solicitar prestamo");
        System.out.println("3) Devolver libros.");
        System.out.println("4) Imprimir libros disponibles");
        System.out.println("5) SALIR");
       
        answer = read.nextInt();

            switch (answer) {

                case 1:
                   ls.registerBook();
                    break;
                case 2:
                    ls.loan();
                    break;

                case 3:
                   ls.returnBook();
                    break;
                case 4:  
                    ls.printBook();
                    break;
            }
            
            } while (!(answer==5));
        } 
    
}
