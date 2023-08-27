//Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
//muestre por pantalla en orden descendente.



package guia.globant;

public class Ejercicio_15_Rellenar100numeros {
    public static void main(String[] arg){
       
        System.out.println("Hola");
     
        int[] vector = new int[100];
      
        for (int i=100; i>0; i--){
            
            vector[100-i]= i;
             System.out.println(vector[100-i]);
           
       
            
        }
   
    }
    
}
