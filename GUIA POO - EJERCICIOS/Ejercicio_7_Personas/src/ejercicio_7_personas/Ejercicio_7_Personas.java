
package ejercicio_7_personas;

import Entidades.Persona;
import Servicio.PersonaServicio;

public class Ejercicio_7_Personas {

    public static void main(String[] args) {
      
        PersonaServicio ps = new PersonaServicio();
        
        
        System.out.println("*****Registro persona 1****");
        
        Persona p1 =  ps.CrearPersona();
        int imc1= ps.calcularIMC(p1);
         boolean edadvalidador1 =ps.esMayorDeEdad(p1);
        
        System.out.println("*****Registro persona 2****");
        Persona p2 =  ps.CrearPersona();
         int imc2=ps.calcularIMC(p2);
         boolean edadvalidador2 =ps.esMayorDeEdad(p2);
         
        System.out.println("*****Registro persona 3****");
        Persona p3 =  ps.CrearPersona();
         int imc3=ps.calcularIMC(p3);
        boolean edadvalidador3 = ps.esMayorDeEdad(p3);
        
        
        System.out.println("*****Registro persona 4****");
        Persona p4 =  ps.CrearPersona();
         int imc4=ps.calcularIMC(p4);
         boolean edadvalidador4 = ps.esMayorDeEdad(p4);
        
 
        boolean [] edades = { edadvalidador1,edadvalidador2,edadvalidador3,edadvalidador4};
        double contmay = 0;
         double contmen=0;
        for (int i = 0; i < edades.length; i++) {
            
        if (edades[i]) {
            contmay= contmay + 1;
        } else {
            contmen = contmen + 1;       
       }
    }
     System.out.println("El porcentaje de personas mayores edad es de :" + ((contmay/4)*100) + "%");    
     System.out.println("El porcentaje de personas menores edad es de :" + ((contmen/4)*100) + "%");  
     
         int [] vectorimc = { imc1,imc2,imc3,imc4};
        double contsobre = 0;
        double  contideal= 0;
        double contdebajo = 0;
        
        for (int i = 0; i < vectorimc.length; i++) {
            
            switch (vectorimc[i]) {
                case 1:
                    contsobre+=1;
                    break;
                case 0:
                    contideal+=1;
                    break;
                default:
                    contdebajo+=1;
                    break;
            }
        } 
        System.out.println("");      
       System.out.println("El porcentaje de personas con sobrepreso es de :" +  (contsobre/4)*100 + "%"); 
       System.out.println("El porcentaje de personas con el peso ideal es de :" +  (contideal/4)*100 + "%"); 
       System.out.println("El porcentaje de personas con peso por debajo del ideal :" +  (contdebajo/4)*100 + "%"); 
    }
}
    
    
          
    

