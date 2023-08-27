
package Servicio;

import Entidades.Raza;
import java.util.Collections;
import java.util.Iterator;

import java.util.Scanner;


public class RazaServicio {
    
    private Raza  datos = new Raza();
    Scanner read = new Scanner(System.in);    
    
    public void ingresarRazas() {
        
         String respuesta;
        do {
            System.out.println("Ingresa la raza del perro");
            
            String raza = read.next();   
         
           datos.agregarRaza(raza);
           
            
            System.out.println("Deseas ingresar otra raza");
            respuesta = read.next().toUpperCase();
        } while (!(respuesta.equals("NO")));
        
       
         System.out.println(datos.getRazas().toString());
        
    }
    
    public void BuscarRaza() {
        Iterator<String> it = datos.getRazas().iterator();
        boolean flag = true;
        System.out.println("Cual raza deseas eliminar");
        String razaBuscar = read.next();
        
        while (it.hasNext()){
            if(it.next().equals(razaBuscar)){
                it.remove();
                flag = false;
                
            }
        }
        
        if(flag){
            
            System.out.println("La raza de perro ingresada, no existe");
            
            
        }
        
       Collections.sort(datos.getRazas());
       System.out.println(datos.getRazas().toString());
       
        
    }
   
    
    
}
