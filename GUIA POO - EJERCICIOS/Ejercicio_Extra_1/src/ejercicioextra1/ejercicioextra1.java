package ejercicioextra1;


import Servicios.VehiculoService;
import java.util.Scanner;

public class ejercicioextra1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int recorrido1, recorrido2, recorrido3,segundos;
        
        VehiculoService v1 = new VehiculoService();
        VehiculoService v2 = new VehiculoService();
        VehiculoService v3 = new VehiculoService();

        String tipo1 =  v1.crearVehiculo().getTipo();
        String tipo2 = v2.crearVehiculo().getTipo();
        String tipo3 = v3.crearVehiculo().getTipo();

        System.out.println("Segundos que se moveran:");
       
        segundos = read.nextInt();
        
        
       
        recorrido1 = v1.Moverse(segundos);
        recorrido2 = v2.Moverse(segundos);
        recorrido3 = v3.Moverse(segundos);
        
         int recorrido1total = v1.Frenar(recorrido1);
         int recorrido2total = v1.Frenar(recorrido2);
         int recorrido3total = v1.Frenar(recorrido3);
         
         
        System.out.println("El vehiculo 1 se movio: " + recorrido1total);
        System.out.println("El vehiculo 2 se movio: " + recorrido2total);
        System.out.println("El vehiculo 3 se movio: " + recorrido3total);

        int maximo;
        String tipovehiculo;
        
        if(recorrido1total >recorrido2total && recorrido1total>recorrido3total){
            maximo =recorrido1total;
            tipovehiculo = tipo1;
             
        }else if(recorrido2total > recorrido1total &&recorrido2total > recorrido3total){
            maximo = recorrido2total;
           tipovehiculo = tipo2;
        }else{
            maximo = recorrido3total;
            tipovehiculo = tipo3;
        }
        
        System.out.println("El maximo es: " + maximo + " y el tipo de vehiculo es " + tipovehiculo );
        
    }
    
       
        
    }
    
 

