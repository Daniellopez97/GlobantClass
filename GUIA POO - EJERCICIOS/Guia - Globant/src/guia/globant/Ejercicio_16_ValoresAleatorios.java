//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
//usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
//numero y si se encuentra repetido.
package guia.globant;
import java.util.Scanner;


public class Ejercicio_16_ValoresAleatorios {
    
    public static void main(String[] arg){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Cual es el tamaño del vector");
        int n = leer.nextInt();
                
        int[] vector= new int[n];
        int acum = 0;
        
        for (int i=0; i<n; i++)
        
        {
            int numero = (int)(Math.random()*10);
            vector[i]= numero;
            System.out.println(vector[i]);   
        }
        
        System.out.println("Que numero deseas buscar");
        int numerobuscar = leer.nextInt();
        
        for (int i=0; i<n; i++)
        
        {
            if (vector[i]== numerobuscar){
            
            System.out.println("El numero se encuentra en la posicion " + i);
            acum = acum + 1;
        }
           
           
        }
       if (acum>1){
         System.out.println("El numero se encuentra Repetido " + acum + " veces");
    }
       else if (acum==0) {
         System.out.println("El numero no se encuentra en la lista");      
               }
       
      
    }
}
