
package Servicio;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {
    
    Persona datos = new Persona();
    Scanner leer = new Scanner(System.in);


    public void crearPersona() {
        
        System.out.println("Cual es el nombre");
        datos.setNombre(leer.next());
        
        System.out.println("Cual es el año de nacimiento");
        int anio = leer.nextInt();
        System.out.println("Cual es el mes de nacimiento");
         int mes = leer.nextInt();
        System.out.println("Cual es el dia de nacimiento");
         int dia = leer.nextInt();
        
        Date fecha = new Date ( anio-1900, mes-1, dia);
       datos.setFechanacimiento(fecha);
        
         System.out.println(datos.getFechanacimiento());
        
    }
    
    public int calcularEdad() {
 
        Date fechaActual = new Date();
        
        int edad = fechaActual.getYear() - datos.getFechanacimiento().getYear();
  
        
        return edad;
        
       
      
    }
    
    public void menorQue(int edad) {
        
        System.out.println("Ingresa una edad para conocer si es menor a la persona");
        int edad2 = leer.nextInt();
        
        if (edad2 < edad)
        {
            boolean validador = true;
            System.out.println("La persona tiene una edad mayor a la ingresada por el usuario");
            System.out.println(validador);
        }
        else {
            boolean validador = false;
            
            System.out.println("La persona tiene una edad menor a la ingresada por el usuario");
            System.out.println(validador);
        }
        
    }
    
    public void mostrarPersona(int edad) {
        
        System.out.println("***** Datos Generales *****");
        System.out.println("Nombre :" + datos.getNombre()) ;
        System.out.println("Fecha de nacimiento :" + datos.getFechanacimiento()) ;
        System.out.println("Edad :" + edad) ;
        
    }
}
