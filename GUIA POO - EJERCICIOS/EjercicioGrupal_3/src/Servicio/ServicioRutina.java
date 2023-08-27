
package Servicio;



import Entidades.Cliente;
import Entidades.Rutina;
import java.util.ArrayList;
import java.util.Scanner;


public class ServicioRutina {
    
      ServicioCliente ServicioCliente;
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
   private  ArrayList <Rutina> rutinas = new ArrayList<>();
   private  ArrayList <Object> RutinasClientes = new ArrayList<>();
   private ServicioCliente serviciocliente;

    public ServicioRutina(ServicioCliente serviciocliente) {
        this.serviciocliente = serviciocliente;
    }



   
   
 
  public void crearRutina() {
      
   

    System.out.println("Cual es el id ");
    long id = leer.nextLong();
    leer.nextLine(); 
    
   System.out.println("Cual es el nombre de la rutina");
    String nombre = leer.nextLine();

    System.out.println("Cual es la duracion de la rutina ( en minutos)");
    int duracion= leer.nextInt();
   

    System.out.println("Cual es el nivel de dificultad");
    String  dificultad = leer.nextLine();
   leer.nextLine();
    
    System.out.println("Cual es la descripcion de la ruta");
    String descripcion = leer.nextLine();

    
    Rutina rutina = new Rutina(id,nombre,duracion,dificultad,descripcion);
    
    rutinas.add(rutina);
    

          }

public void obtenerRutinas() {
    
     for ( Rutina rutina: rutinas) {
           
            System.out.println("Id: " + rutina.getId());
            System.out.println("Nombre: " + rutina.getNombre());
            System.out.println("Dificultad: " + rutina.getNivelDificultad());
            System.out.println("Duracion: " + rutina.getDuracion());
            System.out.println("Descripcion: " +  rutina.getDescripcion());
             System.out.println("------------------------------------------");
      
       }  
        
    

}
public void actualizarRutina() {
     System.out.println("Cual es el id de la rutina  que deseas modificar");
         
         long idAux = leer.nextLong();
         for ( Rutina rutina: rutinas) {
                    
            if ( rutina.getId()== idAux) {
                
         System.out.println("Que atributo deseas modificar");
         System.out.println("1) nombre:");
         System.out.println("2) Nivel dificultad:");
         System.out.println("3) duracion:");
         System.out.println("4) descripcion:");
          int opcion = leer.nextInt();
          
          switch (opcion) {
                case 1:
                    
                     System.out.println("Ingresa el nombre correcto");
                      leer.nextLine();
                     String  NuevoNombre= leer.nextLine();
                     rutina.setNombre(NuevoNombre);   
                     break;
                
                case 2:
                     System.out.println("ingresa el nivel de dificultad correcto");
                       String  NuevoDificultad= leer.nextLine();
                      rutina.setNivelDificultad(NuevoDificultad);
                      break;
                case 3:
                    
                     System.out.println("ingresa la duracion correcta(en minutos)");  
                      rutina.setDuracion(leer.nextInt());
                      break;

                case 4:
                    System.out.println("ingresa la descripcion correcta:");
                    leer.nextLine();
                    rutina.setDescripcion(leer.nextLine());
                    break;
            
            }
 
           }
  }
         
}

public void eliminarRutina() {
    
        System.out.println("Cual es el id del cliente que deseas eliminar");     
      long idAux2 = leer.nextLong();  
         for ( Rutina rutina: rutinas) {
   
          if ( rutina.getId()== idAux2) {
              
               rutinas.remove(rutina);
               break;
          }
         }
}


 
public void AsignarRutina() {
    System.out.println("Digita el id del cliente al que deseas asignarle rutina:");
    long idAux1 = leer.nextLong();

    Cliente clienteSeleccionado = null;
    // Buscar el cliente con el ID proporcionado
    for (Cliente cliente : serviciocliente.getClientes()) {
        if (cliente.getId() == idAux1) {
            clienteSeleccionado = cliente;
            break;
        }
    }

    if (clienteSeleccionado != null) {
        System.out.println("Cliente seleccionado:");
        System.out.println("Id: " + clienteSeleccionado.getId());
        System.out.println("Nombre: " + clienteSeleccionado.getNombre());

        System.out.println("Cual es el ID de la rutina que deseas asignar?");
        long idAux2 = leer.nextLong();

        Rutina rutinaSeleccionada = null;
        // Buscar la rutina con el ID proporcionado
        for (Rutina rutina : rutinas) {
            if (rutina.getId() == idAux2) {
                rutinaSeleccionada = rutina;
                break;
            }
        }

        if (rutinaSeleccionada != null) {
            System.out.println("Rutina seleccionada:");
            System.out.println("Id: " + rutinaSeleccionada.getId());
            System.out.println("Nombre: " + rutinaSeleccionada.getNombre());

            // Agregar el cliente y la rutina seleccionados a la lista RutinasClientes
            RutinasClientes.add(clienteSeleccionado);
            RutinasClientes.add(rutinaSeleccionada);

     
         
        } else {
            System.out.println("No se encontró la rutina con el ID proporcionado.");
        }
    } else {
        System.out.println("No se encontró el cliente con el ID proporcionado.");
    }
}
  

public void  imprimirAsignadas () {
    
    System.out.println("Lista RutinasClientes:");
            for (Object obj : RutinasClientes) {
                if (obj instanceof Cliente) {
                    Cliente cliente = (Cliente) obj;
                    System.out.println("Cliente - Id: " + cliente.getId() + ", Nombre: " + cliente.getNombre());
                    System.out.println("______________________________________________");
                } else if (obj instanceof Rutina) {
                    Rutina rutina = (Rutina) obj;
                    System.out.println("Rutina - Id: " + rutina.getId() );
                    System.out.println("Nombre Rutina: " +  rutina.getNombre());
                    System.out.println("Nombre Rutina: " +  rutina.getDescripcion());
                }
    
}

}


}