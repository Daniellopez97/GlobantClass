
package Servicio;

import Entidades.Cliente;
import java.util.ArrayList;
import java.util.Scanner;


public class ServicioCliente {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
   private  ArrayList <Cliente> Clientes = new ArrayList<>();

    public void registrarCliente()
    {
        
      System.out.println("Cual es el nombre del cliente");
    String nombre = leer.nextLine();

    System.out.println("Cual es el id del cliente");
    long id = leer.nextLong();
    leer.nextLine(); 

    System.out.println("Cual es la edad del cliente");
    int edad = leer.nextInt();
    leer.nextLine();

    System.out.println("Cual es la altura del cliente");
    double altura = leer.nextDouble();
    leer.nextLine(); 
    
    System.out.println("Cual es el peso del cliente");
    int peso = leer.nextInt();
    leer.nextLine();

    System.out.println("Cual es el objetivo del cliente");
    String objetivo = leer.nextLine();

    
    Cliente cliente = new Cliente(id,nombre, edad, altura, peso, objetivo);        
    Clientes.add(cliente);  
        
    }
    
     public void obtenerClientes()
             
    {
        
       for ( Cliente cliente: Clientes) {
           
            System.out.println("Id: " + cliente.getId());
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("edad: " + cliente.getEdad());
            System.out.println("altura: " + cliente.getAltura());
            System.out.println("peso: " + cliente.getPeso());
            System.out.println("objetivo: " + cliente.getObjectivo());
             System.out.println("------------------------------------------");
      
       }  
        
    }
     
      public void actualizarCliente()
    {
         System.out.println("Cual es el id del cliente que deseas modificar");
         
         long idAux = leer.nextLong();
         for ( Cliente cliente: Clientes) {
                    
            if ( cliente.getId()== idAux) {
                
         System.out.println("Que atributo deseas modificar");
         System.out.println("1) nombre:");
         System.out.println("2) edad:");
         System.out.println("3) altura:");
         System.out.println("4) peso:");
         System.out.println("5) objetivo:");
          int opcion = leer.nextInt();
          
          switch (opcion) {
                case 1:
                    
                     System.out.println("Ingresa el nombre correcto");
                      leer.nextLine();
                     String  NuevoNombre= leer.nextLine();
                     cliente.setNombre(NuevoNombre);   
                     break;
                
                case 2:
                    
                     System.out.println("ingresa la edad correcta");
                      cliente.setEdad(leer.nextInt());
                      break;
                case 3:
                    
                     System.out.println("ingresa la altura correcta");  
                      cliente.setAltura(leer.nextDouble());
                      break;

                case 4:
                    
                    System.out.println("ingresa el peso correcto");
                    cliente.setPeso(leer.nextInt());
                    break;
 
                case 5:
                    System.out.println("ingresa el objetivo correcto:");
                    leer.nextLine();
                    cliente.setObjectivo(leer.nextLine());
                    break;
            
            }
 
           }
  }
      
  }
     
    public void eliminarCliente(){
                      
      System.out.println("Cual es el id del cliente que deseas eliminar");     
      long idAux2 = leer.nextLong();  
         for ( Cliente cliente: Clientes) {
   
          if ( cliente.getId()== idAux2) {
              
               Clientes.remove(cliente);
               break;
    
          }  
          
          // En este caso, debemos romper el ciclo,  dado a que si mantengo el recorrido for, una vez eliminado un elemento de la lista, me va generar error,  debido  a que estoy interrumpiendo el recorrido del for
          // por lo cual, utilizar break, para finalizar el ciclo.

       }       
    }

    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }

    public void setClientes(ArrayList<Cliente> Clientes) {
        this.Clientes = Clientes;
    }

    


}
    
    

