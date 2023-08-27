
package Servicio;

import Entidades.Curso;
import java.util.Arrays;
import java.util.Scanner;


public class CursoServicio {
    
    Curso datos = new Curso();
    Scanner leer = new Scanner(System.in);
      String [] alumnos = new String [5];
    
    public void cargarAlumnos() {
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Ingresar el nombre del alumno" + (i+1));
               
               alumnos[i]= leer.next();
               
               datos.setAlumnos(alumnos);
            
        }          
        
    }
    
    public void crearCurso() {
        
        System.out.println("Ingrese el nombre del curso");
        datos.setNombreCurso(leer.next());
        
         System.out.println("ingrese la cantidad de horas por dia que se da el curso");
         datos.setCantidadHorasPorDia(leer.nextInt());
         
         System.out.println("ingrese la cantidad de dias a la semana que se da el curso");
         datos.setCantidadDiasPorSemana(leer.nextInt());
         
         System.out.println("Ingrese el turno en que se da el curso / mañana o tarde");
         datos.setTurno(leer.next());
         
         System.out.println("ingrese el precio por hora del curso $");
         datos.setPrecioPorHora(leer.nextInt());
          
         cargarAlumnos();
        
        
    }
    
    public void calcularGananciaSemanal(){
        
        double ganancia = datos.getCantidadHorasPorDia()*datos.getCantidadDiasPorSemana()*5*datos.getPrecioPorHora();
        
        System.out.println("La ganancia del curso: " + datos.getNombreCurso() );
        System.out.println(" Estudiantes del curso: " + Arrays.toString(datos.getAlumnos()));
        System.out.println("es $" + ganancia);
        
    }
    
}
