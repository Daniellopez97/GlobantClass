
package Servicio;

import Entidades.Bancaria;
import java.util.Scanner;
public class BancariaServicio {  
     Scanner leer = new Scanner(System.in);
    public Bancaria Cuenta() {
        Bancaria datos = new Bancaria();
        
        System.out.println("Ingresa el numero de cuenta");
        datos.setNumeroCuenta(leer.nextInt());
        
        System.out.println("Ingresa el DNI");
        datos.setDni(leer.nextLong());
        
        System.out.println("Ingresa el Saldo Actual");
        datos.setSaldoActual(leer.nextDouble());
        
        return datos;
    }
    public void retirar(Bancaria datos, double retiro)        
    {
        System.out.println("Cuanto dinero se va retirar de la cuenta");
        retiro = leer.nextDouble();
        if (datos.getSaldoActual()<retiro){
            System.out.println("El saldo disponible es insuficiente, no se puede retirar");
            System.out.println("El saldo actual es : $" + datos.getSaldoActual());
        }
        else
        {
            
       datos.setSaldoActual(datos.getSaldoActual()-retiro);
        System.out.println("El valor retirado es : $" + retiro);
        System.out.println("El saldo actual en la cuenta es de : $" + datos.getSaldoActual());
        }       
    }
    public void ingresar(Bancaria datos,double ingreso) {
        System.out.println("Cuanto dinero va ingresar a la cuenta");
        ingreso = leer.nextDouble();
          datos.setSaldoActual(datos.getSaldoActual()+ingreso);
         System.out.println("El valor ingresado  es : $" + ingreso);
        System.out.println("El saldo actual en la cuenta es de : $" + datos.getSaldoActual());         
    }
    public void consultarSaldo( Bancaria datos) {
        System.out.println("El saldo actual en la cuenta es :" + datos.getSaldoActual());        
    }
    public void consultarDatos(Bancaria datos) {
        System.out.println("            DATOS GENERALES     ");
         System.out.println("Numero cuenta: " + datos.getNumeroCuenta() );
         System.out.println("DNI: " + datos.getDni() );
         System.out.println("Saldo Cuenta:  " + datos.getSaldoActual());
        
    }
}
