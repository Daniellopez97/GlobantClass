
package ejerciciogrupal_3;

import Servicio.ServicioCliente;
import Servicio.ServicioRutina;
import java.util.Scanner;


public class EjercicioGrupal_3 {


    
    
    public static void main(String[] args) {
         ServicioCliente sc = new ServicioCliente();
         ServicioRutina sr = new ServicioRutina(sc);
       
         int opcion=0;
        Scanner leer = new Scanner(System.in);
       
       do {
                 System.out.println("Cual opcion seleccionas");
                 System.out.println("1) Registrar un cliente");
                 System.out.println("2) Mostrar clientes registrados");
                 System.out.println("3) Actualizar informacion de clientes");
                 System.out.println("4) Eliminar cliente");
                 System.out.println("__________________________");
                 System.out.println("5) Registrar una rutina");
                 System.out.println("6) Mostrar rutinas registradas");
                 System.out.println("7) Actualizar informacion de rutinas");
                 System.out.println("8) Eliminar rutina");
                 System.out.println("9) Asignar rutina al cliente");
                 System.out.println("10) Imprimir rutinas asignadas");
                 System.out.println("__________________________");
                 System.out.println("11) SALIR");
                 
                 
                 opcion=leer.nextInt();

                switch (opcion) {
                    
                    case 1:
                     sc.registrarCliente();
                     break;
               
                    case 2:
                     sc.obtenerClientes();
                     break;
                     
                    case 3:
                     sc.actualizarCliente();
                     break;
                     
                    case 4:
                     sc.eliminarCliente();
                     break;
                     
                    case 5:
                     sr.crearRutina();
                     break;
                     
                    case 6:  
                     sr.obtenerRutinas();
                     break;
                    
                    case 7:
                     sr.actualizarRutina();
                     break;
                    
                    case 8:
                       sr.eliminarRutina();
                       break;
                       
                    case 9:
                        sr.AsignarRutina();
                        break;
                        
                    case 10:
                        sr.imprimirAsignadas();
                        break;
      
                   }
} while (opcion<=10);
        
        
       
    }


    
}
