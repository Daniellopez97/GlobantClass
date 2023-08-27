//Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
//dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
//fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
//X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
//especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
//de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
//incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
//siguientes funciones de Java Substring(), Length(), equals().
package guia.globant;
import java.util.Scanner;

public class Ejercicio_12_LecturaRS232 {
    
    public static void main(String[] arg){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa una palabra");
        String palabra = leer.next();
        int cont = 0;
        int cont1 = 0;
        
        
        while (!palabra.equals("&&&&&")){
            
         
        if  (palabra.length()<=5 && palabra.substring(0, 1).equals("X")&& palabra.substring(palabra.length()-1, palabra.length()).equals("O")){
            
            cont = cont + 1;     
        }
        else {
            cont1 = cont1 + 1;
        }
        System.out.println("ingresa otra palabra");
        palabra = leer.next();
        } 
        
       System.out.println("Programa finalizado, Comando ingresado"); 
       System.out.println("El total de lecturas Correctas son: " + cont); 
       System.out.println("El total de lecturas Incorrectas son: " + cont1); 
    }
    
}
