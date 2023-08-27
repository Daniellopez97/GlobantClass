//Realizar un programa que pida dos números enteros positivos por teclado y muestre por
//pantalla el siguiente menú:

package guia.globant;
import java.util.Scanner;


public class Ejercicio_11_Mostrar_Menu {
    
    public static void main(String[] arg){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero1 = leer.nextInt();
        System.out.println("Ingresa otro numero");
        int numero2 = leer.nextInt();
        int opcion = 0;
       
        
      
        while (opcion != 5){
            
        System.out.println("MENU");
        System.out.println("1.Sumar"); 
        System.out.println("2.Restar"); 
        System.out.println("3.Multiplicar"); 
        System.out.println("4.Dividir"); 
        System.out.println("5.Salir"); 
        System.out.println("Elija Opcion");
         opcion = leer.nextInt();
            
        switch (opcion){
            case 1:
                int calculo = numero1 + numero2;
                System.out.println(calculo);
                break;
            case 2:
                calculo = numero1 - numero2;
                System.out.println(calculo); 
                break;
            case 3:
                calculo = numero1 * numero2;
                System.out.println(calculo); 
                break;
            case 4:
                calculo = numero1 / numero2;
                System.out.println(calculo); 
                break;
                
            case 5:
                String respuesta;
                  System.out.println("Esta seguro que desea salir del programa (S/N)"); 
                respuesta = leer.next();
                if (respuesta.equals("S") ){
                   System.out.println("Programa finalizado");    
                }
                else {
                   opcion = 0;
                   
                }
                    
        }}
        
    }
    
}
