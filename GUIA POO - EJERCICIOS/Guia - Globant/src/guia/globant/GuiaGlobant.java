/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.globant;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class GuiaGlobant {

      
          
    public static void main(String[] args) {
        //La linea 12 muestra el mensaje por pantalla al ejecutar el programa
        
        String nombre;
        int numero1 = 25;
        int numero2 = 3;
        boolean validador = true;
        double decimal = 0.25;
        
        nombre = "daniel";
        System.out.println(nombre);
        
                
        
        int suma = numero1 + numero2;
        
       System.out.println("hola mundo");
        System.out.println(suma);
        
        
        // Tipo de instrucciones
        
        // Concatenar un mensaje utilizamos system ouyt println
        
        System.out.println("Hola daniel");    // Tambien se puede imprimir, escribiendo SOUT y despues Ctrl + Space
        
        // si quisieramos escribir sin saltos de linea utilizamos el system.out.print
        
        System.out.print("hola");
        System.out.print("daniel");
       
        // imprimir variables
        
        nombre = "daniel";
        int edad = 25;
        
        System.out.println("");
                
        System.out.println(nombre + " " + edad);
        
        // Clase Scanner
        // La clase scanner se importa desde java
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre");
        String nombre3 = leer.nextLine(); // Nos permite ingresar frases completas
        String nombre4 = leer.next(); // dado el caso que se imprima, solo se visualiza la primera palabra
        
        
        
        // Operadores y Condicionales en JAVA
        
        // && AND
        // || OR
        // ! Negacion
        // If y else, para condicional de si y sino
        
        
  
        
        
        
                
        
    }
    
}
