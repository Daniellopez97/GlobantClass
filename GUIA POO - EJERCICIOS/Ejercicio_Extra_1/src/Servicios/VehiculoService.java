package Servicios;

import Entidades.Vehiculo;
import java.util.Scanner;

public class VehiculoService {

    Scanner read = new Scanner(System.in);
    Vehiculo v1 = new Vehiculo();

    public Vehiculo crearVehiculo() {

        System.out.println("Ingrese el tipo");
        v1.setTipo(read.next());
        System.out.println("Ingrese la marca");
        v1.setMarca(read.next());
        System.out.println("Ingrese el modelo");
        v1.setModelo(read.next());
        System.out.println("Ingrese el año");
        v1.setAño(read.nextInt());

       
return v1;
    }
    
    
    
    public int Moverse(int segundos) {
        int resultado;
        resultado = 0;
        if (v1.getTipo().equals("bicicleta")) {
            resultado = segundos;
        } else if (v1.getTipo().equals("motocicleta")) {
            resultado = 2 * segundos;
        } else if (v1.getTipo().equals("automovil")) {
            resultado = 3 * segundos;
        } else {
            System.out.println("Vehiculo invalido");
        }
        return resultado;
    }
    
  
    
    public int Frenar(int resultado) {
        int frenado=0;

        if (v1.getTipo().equals("bicicleta")) {
            frenado =  resultado;
        } else if (v1.getTipo().equals("motocicleta") || v1.getTipo().equals("automovil")) {
            frenado = resultado + 2;
        }

        
        return frenado;
    }
    
    

    
    
}