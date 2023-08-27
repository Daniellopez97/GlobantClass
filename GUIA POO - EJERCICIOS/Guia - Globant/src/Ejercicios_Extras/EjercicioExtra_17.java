
package Ejercicios_Extras;

import java.util.Scanner;


public class EjercicioExtra_17 {
   public static void main(String[] arg){   
    Scanner leer = new Scanner(System.in);
       System.out.println("Ingresa un numero, para validar si es primo");
       int n = leer.nextInt();
       
       System.out.println(validalicion(n));
   }
   
    public static boolean validalicion(int n) {
    
    boolean validacion= false;
    int cont = 0;
    for( int i=0; i<n; i++){
     
        if (n%(i+1)==0) {
            cont = cont + 1;
        }
        
    }
    
    if (cont==2){
        
        validacion = true;
    }
    
    
    return validacion;
    }
}
