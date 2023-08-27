
package Servicio;

import Entidades.Arreglo;
import java.util.Arrays;

import java.util.Random;


public class ArregloServicio {
    
     Arreglo datos = new Arreglo();
     Random random = new Random();
     
    double [] v1=new double[50];;
    double [] v2 = new double[20];
     
   public void rellenarvector(  double [] v1){
       
       for (int i = 0; i < 50; i++) {
        v1[i] = random.nextInt(100);
         datos.setVector1(v1);  
       }
       // Mostrar vector 1
       System.out.println("vector 1 : "+Arrays.toString(datos.getVector1()));  
       
       // Organizar vector 1, de menor a mayor
       Arrays.sort(v1);
       datos.setVector1(v1);  
       System.out.println("vector 1 ordenado : " + Arrays.toString(datos.getVector1()));
       
       
       // Rellenar vector 2
       
       for (int i = 0; i < 20; i++) {
           
           if ( i<10) {
               v2[i]=v1[i];
               datos.setVector2(v2);
           }
           else {
               v2[i]= 0.5;
               datos.setVector2(v2);     
           }
       }
            System.out.println("vector 2 ordenado : " + Arrays.toString(datos.getVector2()));
   }
}