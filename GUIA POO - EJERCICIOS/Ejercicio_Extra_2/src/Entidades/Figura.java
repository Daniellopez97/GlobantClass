package ejercicioextra1;

import Entidades.Vehiculo;
import Servicios.VehiculoService;
import java.util.Scanner;

public class EjercicioExtra1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int recorrido1, recorrido2, recorrido3,segundos,disMaxima;
        
        VehiculoService v1 = new VehiculoService();
        VehiculoService v2 = new VehiculoService();
        VehiculoService v3 = new VehiculoService();

        v1.crearVehiculo();
        v2.crearVehiculo();
        v3.crearVehiculo();
       
        System.out.println("Segundos que se moveran:");
       
        segundos = read.nextInt();
       
        recorrido1 = v1.Moverse(segundos);
        recorrido2 = v2.Moverse(segundos);
        recorrido3 = v3.Moverse(segundos);
        
        System.out.println("El vehiculo 1 se movio: " + recorrido1);
        System.out.println("El vehiculo 2 se movio: " + recorrido2);
        System.out.println("El vehiculo 3 se movio: " + recorrido3);
        
        mostrarMaximo(recorrido1,recorrido2,recorrido3);
        
    }
    
    public static void mostrarMaximo(int r1,int r2,int r3){
        int maximo = 0;
        
        if(r1 > r2 && r1>r3){
            maximo = r1;
        }else if(r2 > r1 && r2 > r3){
            maximo = r2;
        }else{
            maximo = r3;
        }
        
        System.out.println("El maximo es: " + maximo);
        
    }
    

}