
package Ejercicios_Extras;

//Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
//hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
//de hijos para averiguar la media de edad de los hijos de todas las familias.
import java.util.Scanner;

public class EjercicioExtra_14 {
 public static void main(String[] arg){   
    Scanner leer = new Scanner(System.in);
       System.out.println("Cuantas familias son");
       
       int n = leer.nextInt();
       int hijos = 0;
       int suma = 0;
       int edad = 0;
       int cont = 0;
       int contaux = 0;
       for ( int i=0; i<n; i++){
           contaux= 0;
           System.out.println("Cuantos hijos tiene la familia # " + (i+1));
           hijos = leer.nextInt();
           
           
           while ( hijos > 0){
           contaux = cont + 1;
           hijos = hijos - 1;
           cont = cont + 1; 
           System.out.println("Cual es la edad del hijo # " + contaux);
           edad = leer.nextInt();
           suma = suma + edad;    
               
           }
   
       }
       
    System.out.println("El promedio de edad de los hijos de todas las familias es: " + (suma/cont) + " años");
       
}
}
