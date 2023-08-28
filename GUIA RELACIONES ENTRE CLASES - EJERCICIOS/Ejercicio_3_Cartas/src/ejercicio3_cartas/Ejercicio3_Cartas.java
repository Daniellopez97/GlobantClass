
package ejercicio3_cartas;

import Service.CartaService;
import java.util.Scanner;



public class Ejercicio3_Cartas {

  
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        CartaService cs = new CartaService();
        
        cs.crearBaraja();
         int  opcion;
                 
                 
        do {
        System.out.println("MENU DE OPCIONES:");
        System.out.println("1. Barajar Cartas");
        System.out.println("2. Mostrar la siguiente carta en la baraja");
        System.out.println("3. Cantidad de cartas disponibles en la baraja");
        System.out.println("4. Dar cartas");
        System.out.println("5. Mostrar Cartas que han salido de la bajara");
        System.out.println("6. Mostrar Cartas en la baraja");
        System.out.println("7. SALIR");
        
        
       opcion  =  read.nextInt();
        switch (opcion){
            
            case 1:
                cs.barajar();
                break;
            case 2:
                cs.siguienteCarta();
                break;
            case 3:
                cs.cartasDisponibles();
                break;
                
            case 4:
                cs.darCartas();
                break;
                
            case 5:
                cs.CartasMonton();
                break;
                
            case 6:
                cs.mostrarBaraja();
                break;
            
        }
        } while (!(opcion==7));

    }
    
}
