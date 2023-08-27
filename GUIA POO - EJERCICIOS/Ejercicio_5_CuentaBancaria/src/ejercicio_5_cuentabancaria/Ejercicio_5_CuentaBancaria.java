
package ejercicio_5_cuentabancaria;

import Entidades.Bancaria;
import Servicio.BancariaServicio;
import java.util.Scanner;


public class Ejercicio_5_CuentaBancaria {


    public static void main(String[] args) {
    
        BancariaServicio bs = new BancariaServicio();
        Bancaria datos = bs.Cuenta();
        double cantidad=0;
        
        // Crear menu
        int opcion = 0;
         while ( opcion != 5){
        System.out.println("******* Menu de opciones ******");
        
        System.out.println("1) ingresar dinero a la cuenta");
        System.out.println("2) retirar dinero de la cuenta");
        System.out.println("3) Consultar saldo disponible en la cuenta");
        System.out.println("4) Consultar datos generales de la cuenta");
        System.out.println("5) Salir");
        
        Scanner leer = new Scanner(System.in);
        opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                bs.ingresar(datos, cantidad);
                break;   
            case 2:
                bs.retirar(datos, cantidad);
                  break;
            case 3:
                bs.consultarSaldo(datos);
                  break;
            case 4:            
               bs.consultarDatos(datos);
                 break;
            case 5:
                System.out.println("Menu Finalizado");
                  break;
                    }
        }
    }
    
}
