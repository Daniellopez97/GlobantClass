
package Servicio;

import Entidades.Matematica;

public class MatematicaServicio {
    
    Matematica datos = new Matematica();
    
    
    public void devolverMayor (Matematica datos){
        
        if (datos.getNumero1()> datos.getNumero2()){
            System.out.println( "El numero #1:  " + datos.getNumero1() + " es, mayor al numero #2 :  "  + datos.getNumero2());
        }
        else {
         System.out.println( "El numero #2:  " + datos.getNumero2() + " es, mayor al numero #1 :  "  + datos.getNumero1());
        } 
    }
    
    public void calcularPotencia( Matematica datos){
       
        
        
    datos.setNumero1(Math.round(datos.getNumero1()));
    datos.setNumero2(Math.round(datos.getNumero2()));
    
    
    
     if (datos.getNumero1()> datos.getNumero2()){
         
         System.out.println("El resultado de la potencia del mayor elevado al menor es :" +   Math.pow(datos.getNumero1(), datos.getNumero2()));
     }
     else {
       System.out.println("El resultado de la potencia del mayor elevado al menor es :" +   Math.pow(datos.getNumero2(), datos.getNumero1()));
     }
     
    }
    
    public void calcularRaiz( Matematica datos){
        
        
         if (datos.getNumero1()> datos.getNumero2()){
          
           System.out.println("El resultado de la raiz cuadrada del Numero menor ( #2) :" +  Math.sqrt(Math.abs(datos.getNumero2())));
             
         }
         else {
           
          System.out.println("El resultado de la raiz cuadrada del Numero menor ( #1) :" +  Math.sqrt(Math.abs(datos.getNumero1())));
             
         }
        
    }
    
}
