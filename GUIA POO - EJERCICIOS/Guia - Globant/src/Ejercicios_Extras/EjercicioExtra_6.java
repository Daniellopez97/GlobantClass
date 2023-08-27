//Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
//debajo de 1.60 mts. y el promedio de estaturas en general.
package Ejercicios_Extras;
import java.util.Scanner;

public class EjercicioExtra_6 {
    public static void main(String[] arg){
       Scanner leer = new Scanner(System.in);
       System.out.println("Cuantas personas se van a registrar");
       int n = leer.nextInt();
       
       double suma1= 0;
       double sumagen=0;
       int cont = 0; 
       
       for ( int i=0; i<n; i++){
         
           System.out.println("Cual es la estatura de la persona " + (i+1));
           double estatura = leer.nextDouble();
           
           if (estatura<1.6){
               suma1 = suma1 + estatura;
               cont = cont + 1;
           }
           
           sumagen = sumagen + estatura;
           
       }
      
     double promedio = (suma1/cont);
     double promediogen = (sumagen/n);
     
     System.out.println("El promedio de estaturas que se encuentra por debajo de 1.60 es igual a :" + promedio );
     System.out.println("El promedio general de estaturas es de :" + promediogen );
    }
}
