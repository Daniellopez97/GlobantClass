package ejercicio_6_store;

import Service.StoreService;
import java.util.Scanner;

public class Ejercicio_6_Store {

    public static void main(String[] args) {
        Scanner Read = new Scanner(System.in);
        StoreService ss = new StoreService();
        int answer;
        do {

            System.out.println("********MENU PRINCIPAL**********");

            System.out.println("1) Ingresar productos");
            System.out.println("2) Eliminar un producto");
            System.out.println("3. Modificar el precio de un producto");
            System.out.println("4) Imprimir  productos registrados");
            System.out.println("5) SALIR");

            answer = Read.nextInt();

            switch (answer) {

                case 1:
                    ss.registerProduct();
                    break;
                case 2:
                    ss.removeProduct();
                    break;

                case 3:
                    ss.modifyPrice();
                    break;
                case 4:
                    ss.printProduct();
                    break;

            }

    
            
            
            
            
            
        } while (!(answer == 5));
        
     
    }


}
