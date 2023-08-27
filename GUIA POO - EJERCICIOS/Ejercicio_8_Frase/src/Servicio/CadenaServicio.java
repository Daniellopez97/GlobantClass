
package Servicio;

import Entidades.Cadena;
import java.util.Scanner;


public class CadenaServicio {
    
    Cadena datos = new Cadena();
    Scanner leer = new Scanner(System.in);
    
    public void mostrarVocales( Cadena datos) {
        int cont = 0;
        
        for (int i = 0; i < datos.getLongitud(); i++) {
            
            if(datos.getFrase().substring(i,i+1).equals("a") || datos.getFrase().substring(i,i+1).equals("e") || datos.getFrase().substring(i,(i+1)).equals("i")  || datos.getFrase().substring(i,(i+1)).equals("o") ||datos.getFrase().substring(i,(i+1)).equals("u"))
            {      
                 cont+=1;     
            }    
        }
        System.out.println("El numero de vocales de la palabra es :" + cont);
        
    }
    //Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
   //ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public void invertirPalabra (Cadena datos){
         System.out.print("La palabra invertida es : ");
        for (int i = datos.getLongitud()-1; i>=0; i--) {
        
            System.out.print( datos.getFrase().charAt(i));
     
        }
        
       System.out.println("");
    }
   // Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
  // contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:

    public void vecesRepetido(String letra, Cadena datos){
        
        int cont1 = 0;
        System.out.println("Ingresa la letra a buscar en la palabra");
         
        letra = leer.next().toUpperCase();
         
        for (int i = 0; i < datos.getLongitud(); i++) {
            
            if(datos.getFrase().substring(i,i+1).toUpperCase().equals(letra)){
                
                cont1 += 1;
            }
            
        }
         System.out.println("La letra :" + letra + " aparece en total " + cont1 + " veces");
        
    }
    //Método compararLongitud(String frase), deberá comparar la longitud de la frase que
   //compone la clase con otra nueva frase ingresada por el usuario.
   public void CompararLongitud ( String frase2, Cadena datos) {
       System.out.println("Ingresa la frase a comparar");
       
        leer.nextLine(); 
       frase2 = leer.nextLine();
       
       if ( datos.getLongitud() > frase2.length()) {
           
           System.out.println("La frase : " + datos.getFrase() + " Tiene una longitud mayor de " + datos.getLongitud() + " caracteres, a comparacion de  " + frase2 + " con un total de " + frase2.length() + " caracteres"  );
       }
       else {
      System.out.println("La frase : " + frase2 + " Tiene una longitud mayor de " + frase2.length() + " caracteres, a comparacion de  " +  datos.getFrase()  + " con un total de " + datos.getLongitud() + " caracteres"  ); 
       }
   }
   public void unirFrases( String frase2, Cadena datos) {
       System.out.println("Ingresa la frase a unir");
       
       
       frase2 = leer.nextLine();
       
       System.out.println( datos.getFrase().toLowerCase().concat(" " + frase2).toLowerCase());
       
   }
   public void reemplazar( String letra, Cadena datos) {
       
        System.out.println("por cual Caracter quieres reeemplazar la letra (a) contenida en la palabra");
        
        String nuevafrase ="";
        
        letra = leer.next();
        
        for (int i = 0; i < datos.getLongitud(); i++) {
            
             if(datos.getFrase().substring(i,i+1).toLowerCase().equals("a")) {
                 
                 nuevafrase = nuevafrase.concat(letra);
             }
             else
             {
                   nuevafrase = nuevafrase.concat(datos.getFrase().substring(i,i+1));
             }
           
       }
        
          System.out.println("La nueva frase es:" + nuevafrase);
   }
   public void contiene ( String letra, Cadena datos){
       System.out.println("Cual letra deseas comprobar si la contiene la frase");
       boolean validador = false;
       letra = leer.next().toLowerCase();
         for (int i = 0; i < datos.getLongitud(); i++) {
             
             if(datos.getFrase().substring(i,i+1).equals(letra)){
                 
                 validador = true;
             }
         }
       
      System.out.println(validador);   
   }
}
