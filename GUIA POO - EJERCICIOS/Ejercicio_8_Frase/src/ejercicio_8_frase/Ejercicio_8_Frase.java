
package ejercicio_8_frase;

import Entidades.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

public class Ejercicio_8_Frase {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        CadenaServicio cs = new CadenaServicio();
        Cadena c1 = new Cadena(); 
  
       System.out.println("Ingrese una palabra");
       c1.setFrase(leer.nextLine().toLowerCase());
       c1.setLongitud(c1.getFrase().length());
       
       
       int opcion = 0;
        while ( opcion != 8){
       System.out.println("");  
       System.out.println("******* Menu de opciones ******");
        

        System.out.println("1) MostrarVocales");
        System.out.println("2) Invertir frase");
        System.out.println("3) contabilizar caracter repetido");
        System.out.println("4) comparar longitud con otra frase");
        System.out.println("5) Unir con otra frase");
        System.out.println("6) Reemplazar las letras a");
        System.out.println("7) comprobar si la frase contiene una letra ingresada");
        System.out.println("8) SALIR");
        
        
        opcion = leer.nextInt();
          String frase2;
          String letra;
        switch (opcion) {
            case 1:
                     cs.mostrarVocales(c1);
                break;   
            case 2:
                     cs.invertirPalabra(c1);
                  break;
            case 3:
                     letra="";
                     cs.vecesRepetido(letra, c1);
                  break;
            case 4:            
                  frase2 = "";
                   cs.CompararLongitud(frase2, c1);
                 break;
            case 5:            
                   frase2 = "";
                  cs.unirFrases(frase2, c1);
                 break;
            case 6:
                    letra="";
                   cs.reemplazar(letra, c1);
                 break;
             case 7:  
                  letra="";
                  cs.contiene(letra, c1);
                 break;
             case 8:            
                   System.out.println("Menu Finalizado");
                 break;
             default:
                 System.out.println("Opcion incorrecta");
             
                    }
        }
  
    }
  
}
