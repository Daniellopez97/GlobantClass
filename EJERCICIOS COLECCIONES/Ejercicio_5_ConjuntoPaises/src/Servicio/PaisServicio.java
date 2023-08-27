package Servicio;

import Entidades.Pais;
/*import java.util.Iterator; */  //el iterator es otra forma de solucionar el problema
import java.util.Scanner;
import java.util.TreeSet;

public class PaisServicio {

    private Pais pais = new Pais();
    Scanner read = new Scanner(System.in);
    private TreeSet<String> Paises = new TreeSet();

    public void IngresarPais() {
        String respuesta;
        do {
            System.out.println("Ingresa un pais");

            String IngresoPais = read.nextLine();
            Paises.add(IngresoPais);
   
            System.out.println("Deseas ingresar otro pais  SI/NO");
            respuesta = read.next().toUpperCase();
            read.nextLine();
        } while (respuesta.equals("SI"));
        
  
           pais.setPaises(Paises);
           
           System.out.println(pais.toString());

    }
    
   

    public void EliminarPais() {

        System.out.println("Ingresa un pais para eliminar del conjunto");
        String PaisEliminar = read.nextLine();

        if (pais.getPaises().remove(PaisEliminar)) {

            System.out.println("Pais eliminado del conjunto");
        } else {
            System.out.println("Pais no encontrado en el conjunto");
        }

        System.out.println("Conjunto actual de Paises");
        System.out.println(pais.toString());

        /*Con interator*/
 /*Iterator<String> it = pais.getPaises().iterator();
       while (it.hasNext()){
           if(it.next().equals(PaisEliminar)){
               it.remove();
           }
        
        }
         */
    }

}
