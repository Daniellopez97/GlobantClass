
//Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
//de n números (n>0). El valor de n se solicitará al principio del programa y los números
//serán introducidos por el usuario. Realice dos versiones del programa, una usando el
//bucle “while” y otra con el bucle “do - while”.

package Ejercicios_Extras;
import java.util.Scanner;

public class EjercicioExtra_7 {
    public static void main(String[] arg){
       Scanner leer = new Scanner(System.in);
       System.out.println("Cuantos numeros se van a introducir");
       int n = leer.nextInt();
       while ( n<0) {
          System.out.println("los numeros de datos de datos deben ser positivos"); 
           n = leer.nextInt();
       }
       int aux = 0;
       
       int contaux = 0;
       int nummin=0;
       int nummax=0;
       int suma = 0;
       while ( aux<n) {
           
           System.out.println("Ingresa el numero " + (aux +1));
           
           int numero = leer.nextInt();
           
           while (numero<0) {
               System.out.println("El numero debe ser positivo");
               
               System.out.println("Ingresa el numero " + (aux +1));
               numero = leer.nextInt();
           }
           suma = suma + numero;
           
           if (contaux ==0) {
               nummin = numero;
               contaux = contaux + 1;
           }
           
           if (numero < nummin) {
               nummin = numero;
           }
           
           if (numero>nummax) {
               nummax = numero;
           }
         aux= aux + 1;
       }
       
    System.out.println("El valor maximo es: " + nummax);
    System.out.println("El valor minimo es: " + nummin);
    System.out.println("La suma de los numeros es " + suma);
    }
}
