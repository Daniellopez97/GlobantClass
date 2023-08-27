
package Servicio;

import Entidades.Operacion;
import java.util.Scanner;


public class OperacionServicio {
    
    public Operacion crearOperacion() {
        
        System.out.println("Escriba el primer numero");
        
        Operacion numero = new Operacion();
        Scanner leer = new Scanner(System.in);
        
        numero.setNumero1(leer.nextInt());
        
        System.out.println("Escriba el segundo numero");
        
        numero.setNumero2(leer.nextInt());
        
        return numero;
        
    }
    
    public void Sumar( Operacion numero) {
        
        int  suma = numero.getNumero1() + numero.getNumero2();
          System.out.println("La suma es: " + suma);
    }
   
    
    public void Restar( Operacion numero) {
        
        int  resta = numero.getNumero1() - numero.getNumero2();
          System.out.println("La suma es: " + resta);
    } 
    
    public void Multiplicar ( Operacion numero) {
        
         
        if ( numero.getNumero1() == 0 || numero.getNumero2()==0 ){
            
           int  Multiplicacion=0;
            System.out.println("Error, se esta intentando mulplicar por cero, el resultado es igual a " + Multiplicacion);
        }
        else
        {
              int Multiplicacion = numero.getNumero1() * numero.getNumero2();
              System.out.println("La multiplicacion es : " + Multiplicacion);
        }
        
        
      
    }
        
        
     public void Dividir ( Operacion numero) {
        
         
        if ( numero.getNumero1() == 0 || numero.getNumero2()==0 ){
            
           int  Division=0;
            System.out.println("Error, se esta intentando dividir por cero, el resultado es igual a " + Division);
        }
        else
        {
              int Division = numero.getNumero1() / numero.getNumero2();
              System.out.println("La Division es : " + Division);
        }
        
        
      
    }    
            
            
    
}
