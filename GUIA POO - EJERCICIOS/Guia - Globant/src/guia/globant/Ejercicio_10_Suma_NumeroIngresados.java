
//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial.



package guia.globant;
import java.util.Scanner;


public class Ejercicio_10_Suma_NumeroIngresados {
    public static void main(String[] arg){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero limite");
        
        int numerolimite = leer.nextInt();
        System.out.println("Ingresa un numero para la suma");
        int numero = leer.nextInt();
        int suma=numero;
        
        
        while (suma < numerolimite){
            
            System.out.println("Ingresa Oro numero para la suma");
            numero = leer.nextInt();
            suma = numero + suma;
        }
                
          System.out.println("la suma es " + suma + " Es mayor a " + numerolimite ); 
                
         
    }
    
}
