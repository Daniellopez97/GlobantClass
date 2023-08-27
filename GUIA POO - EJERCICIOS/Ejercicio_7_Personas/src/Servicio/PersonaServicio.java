
package Servicio;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in);
     Persona datos = new Persona();
    public Persona CrearPersona(){
       
        
        System.out.println("Cual es el nombre");
        datos.setNombre(leer.next());
        
         System.out.println("Cual es la edad");
         datos.setEdad(leer.nextInt());
         
          System.out.println("Cual es el sexo de la persona, H = hombre, M= mujer, O= otro");
          datos.setSexo(leer.next().toUpperCase());
          
          while (!(datos.getSexo().equals("H") || datos.getSexo().equals("M") ||datos.getSexo().equals("O"))   ) {   
               System.out.println("Ingresa una categoria correcta, H = hombre, M= mujer, O= otro");
               datos.setSexo(leer.next());
          }
        
         System.out.println("Cual es la altura de la persona"); 
         datos.setAltura(leer.nextDouble());
         
         System.out.println("Cual es el peso de la persona");
         datos.setPeso(leer.nextDouble());
         
        return datos;
    }
    public int calcularIMC( Persona datos) {
       int imc = 0;
        
      if( datos.getPeso()/ (datos.getAltura()*datos.getAltura()) <20 ) {
          imc = -1;
          System.out.println(datos.getNombre() + "  Se encuentra por debajo del peso ideal");
      }
     
      else if (datos.getPeso()/ (datos.getAltura()*datos.getAltura()) >=20 && datos.getPeso()/ (datos.getAltura()*datos.getAltura()) <=25  ) {
          imc = 0;
            System.out.println(datos.getNombre() + "  Se encuentra en el peso ideal");
      } 
      
      else
      {
          imc = 1;
           System.out.println(datos.getNombre() + "  Se encuentra en sobrepreso");
      }
      
      return imc;
    }
    
    public boolean  esMayorDeEdad( Persona datos) {
       boolean mayor;
        
        if (datos.getEdad()>=18){
          mayor = true;
           System.out.println(mayor);
        } 
        else
        {
              mayor = false;
              System.out.println(mayor);
        }
        
        return mayor;
    }
}
