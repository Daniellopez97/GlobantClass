
package Servicio;

import Entidades.Ahorcado;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class AhorcadoServicio {
    
    Ahorcado datos = new Ahorcado();
    Scanner leer = new Scanner(System.in);
    private String letra;
    private String [] vectorAux;
      
       List<String> letrasingresadas = new ArrayList<>();
      
     
    
    public void crearJuego() {
        System.out.println("Listo para jugar, la palabra se ha generado aleatoriamente, ADIVINA!!");
        
        List<String> PalabraAleatoria =Arrays.asList("daniel", "sol", "perro", "murcielago","sonido","tigre","universo","mar","tiburon","musica","globant","programador","loco","teclado","camara");
       
        Random random = new Random();
        
        int indicepalabra = random.nextInt(PalabraAleatoria.size());
        
        String palabra = PalabraAleatoria.get(indicepalabra).toUpperCase();
        
        datos.setLetrasEncontradas(0);
        datos.setIntentosMax(8);
        System.out.println("El numero de intentos permitidos es: "  + datos.getIntentosMax() + "  vidas");
        
        
     
        String [] vector1= new String[palabra.length()];

        for (int i = 0; i <palabra.length(); i++) {
           vector1 [i] = palabra.substring(i, i+1);
        }
      
        datos.setPalabraBuscar(vector1);
   

    }

    public void longitud() {
        System.out.println("La longitud de la palabra es : " + datos.getPalabraBuscar().length);
    }

    public void buscar() {
        System.out.println("Ingresa una letra");
        
         letra = leer.next().toUpperCase();  
         
          int contaux;
          
        do {
            contaux= 0;
         for (String letrasingresada : letrasingresadas) {     
             if ( letrasingresada.equals(letra) ){   
                 contaux = 1;   
                 System.out.println("La letra ya fue ingresada, ingrese otra");
                 letra = leer.next();     
             }     
        }
        } while (contaux==1);
         
        letrasingresadas.add(letra);
        
        // validar si la letra pertenece o no a la palabra
         int cont = 0;
         
        for (int i = 0; i < datos.getPalabraBuscar().length; i++) {
            
             if (datos.getPalabraBuscar()[i].equals(letra)) {    
             cont = 1;
      }
      else {
            cont = 0 + cont;
    
      }       
        }
        if (cont == 0) {
              System.out.println("Mensaje: La letra no pertenece a la palabra");
        } 
        else
        {
               System.out.println("Mensaje: La letra pertenece a la palabra");
        }     
    }
    
    
    public boolean encontradas() {
        
        boolean validador = false;
        
        
        for (int i = 0; i < datos.getPalabraBuscar().length; i++) {
            
         if (datos.getPalabraBuscar()[i].equals(letra)) {
             
            datos.setLetrasEncontradas(datos.getLetrasEncontradas()+1); 
            validador  = true;
         }
        }
        
        System.out.println("Numero de letra(encontradas, faltantes:)"  + "(" +datos.getLetrasEncontradas() +"," + (datos.getPalabraBuscar().length - datos.getLetrasEncontradas()) + ")" );
        
        
        return validador;
        
    }
    
    public void intentos( boolean validador) {
        
        if (validador== false) {
        datos.setIntentosMax(datos.getIntentosMax() - 1);
        
        System.out.println("Numero de oportunidades restantes:" + datos.getIntentosMax());
        }
    
        else
        {
          System.out.println("Numero de oportunidades restantes:" + datos.getIntentosMax());   
        } 
        
    }
    
     
     
    public void OcultarPalabra (){
       
        vectorAux = new String [datos.getPalabraBuscar().length];
        for (int i = 0; i < datos.getPalabraBuscar().length; i++) {
            
            vectorAux[i] = "_";             
        }
        System.out.println(Arrays.toString(vectorAux));
      
    
    }
    
    public void MostrarPalabra(){
        
        for (int i = 0; i < datos.getPalabraBuscar().length; i++) {
          if (datos.getPalabraBuscar()[i].equals(letra)) {
              
               vectorAux[i] = letra;
          }
          }
        System.out.println(Arrays.toString(vectorAux));
    }
    
    
    public void juego(){
        
        crearJuego();
        longitud();
        OcultarPalabra ();
        
        while (datos.getIntentosMax()>0 && datos.getLetrasEncontradas() < datos.getPalabraBuscar().length ) {
      
        buscar() ;
          MostrarPalabra();     
        boolean validador = encontradas();
        intentos(validador);
  
        }
        
        if (datos.getIntentosMax()<=0)
        {
            System.out.println("Lo sentimos, no hay más oportunidades");
               System.out.println(Arrays.toString(datos.getPalabraBuscar()));
        }
        else{
            System.out.println("Adivinaste la palabra");
        }
    }
    
    
    
}
