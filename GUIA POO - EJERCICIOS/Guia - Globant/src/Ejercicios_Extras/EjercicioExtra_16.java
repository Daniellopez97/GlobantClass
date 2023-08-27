
package Ejercicios_Extras;

import java.util.Scanner;


public class EjercicioExtra_16 {
     public static void main(String[] arg){   
    Scanner leer = new Scanner(System.in);
       System.out.println("Cuantas personas vas a ingresar");
       
       int n = leer.nextInt();
       String [] nombre = new String[n];
       int [] edad = new int[n];
       int i=0;
       for ( i=0; i<n; i++){
         System.out.println("Cual es el nombre de la persona " + (i+1)); 
         nombre [i]  = leer.next();
         System.out.println("Cual es la edad de " + nombre[i] );
         edad [i]  = leer.nextInt();
       }
       i=0;
      validalicion(edad,nombre,i );
     }
   
     public static void validalicion(int [] edad, String [] nombre, int i  ){
      String respuesta = "SI";
      Scanner leer = new Scanner(System.in);
       
       while (respuesta.equals("SI")) {
           
           if (edad[i]>= 18){
           System.out.println(nombre[i] + " Tiene " + edad [i] + " Por lo tanto es mayor de edad" ); 
           }
           else {
           System.out.println(nombre[i] + " Tiene " + edad [i] + " Por lo tanto es menor de edad" );    
           }
        System.out.println("Quiere seguir mostrando la siguiente persona " ); 
        respuesta = leer.next();
        respuesta = respuesta.toUpperCase();
        i = i +1;
       } 
         
     }
}
