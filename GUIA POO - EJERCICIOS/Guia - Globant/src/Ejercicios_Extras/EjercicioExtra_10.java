
package Ejercicios_Extras;
import java.util.Scanner;

public class EjercicioExtra_10 {
    public static void main(String[] arg){
       Scanner leer = new Scanner(System.in);
      
        int a = (int)(Math.random()*10);
       int b = (int)(Math.random()*10);
       int resultado = a*b;
       
       
       System.out.println("Ingresa un resultado de la multiplicaicion");
       int eleccion = leer.nextInt();
       
       while (eleccion != resultado) {
           
           if (eleccion < resultado) {
              System.out.println("El resulado se encuentra por arriba del valor digitado"); 
              
           }
           else {
             System.out.println("El resulado se encuentra por debajo del valor digitado");   
           }
        eleccion = leer.nextInt();   
       }
      System.out.println("Muy bien, la multiplicacion realizada fue " + a + "*" + b +  " con resultado de : " + eleccion );  
    }
}
