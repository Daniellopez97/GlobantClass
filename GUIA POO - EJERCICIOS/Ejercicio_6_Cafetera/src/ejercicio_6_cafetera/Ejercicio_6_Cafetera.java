
package ejercicio_6_cafetera;


import Servicio.ServicioCafetera;
import java.util.Scanner;

public class Ejercicio_6_Cafetera {

    public static void main(String[] args) {
     
        ServicioCafetera sc = new ServicioCafetera();
        int tamañoTaza = 0;
        int CantidadCafe = 0;
              // Crear menu
        int opcion = 0;
         while ( opcion != 4)
         {
        System.out.println("******* Menu de opciones ******");
        

        System.out.println("1) Servir taza");
        System.out.println("2) Vaciar cafetera");
        System.out.println("3) Agregar cafe");
        System.out.println("4) Salir");
        
        Scanner leer = new Scanner(System.in);
        opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                      sc.servirTaza(tamañoTaza);
                break;   
            case 2:
                      sc.vaciarCafetera();
                  break;
            case 3:
                   sc.agregarCafe(CantidadCafe );
                  break;
            case 4:            
                   System.out.println("Menu Finalizado");
                 break;
                    }
        
    }
    }
    
}
