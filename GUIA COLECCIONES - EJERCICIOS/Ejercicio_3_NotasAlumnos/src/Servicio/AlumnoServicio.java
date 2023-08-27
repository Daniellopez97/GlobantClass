package Servicio;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicio {

    Scanner read = new Scanner(System.in);
    ArrayList<Alumno> ListaAlumnos = new ArrayList(); //Creo una lista auxiliiar para organizarlo como quiero sin necesidad de crear una clase Comparadores

    public void registrarAlumnos() {
        String respuesta;
        do {
            ArrayList<Integer> notas = new ArrayList<>();
            System.out.println("Ingresa el nombre del alumno");
            String nombre = read.next();

            for (int i = 0; i < 3; i++) {

                System.out.println("Ingresa la nota N°" + (i + 1) + " Del alumno " + nombre);
                int nota = read.nextInt();
                notas.add(nota);
            }
            Alumno alumno = new Alumno(nombre, notas);
            ListaAlumnos.add(alumno);

            System.out.println("Deseas ingresar otro alumno");
            respuesta = read.next().toUpperCase();

        } while (!(respuesta.equals("NO")));

        System.out.println("Los alumnos registrados con sus respectivas notas son:");
        System.out.println(ListaAlumnos.toString());

    }
    public void notaFinal() {

        System.out.println("Ingresa el nombre del estudiante para calcular su nota final: ");
        String nombreBuscar = read.next();
        int suma = 0;
        double promedio;
        for (Alumno alumno : ListaAlumnos) {
            if (alumno.getNombre().equals(nombreBuscar)) {

                for (Integer nota : alumno.getNotas()) {
                    suma += nota;
                }

                promedio = (double) suma / 3;

                System.out.println("La nota final de " + alumno.getNombre() + " es " + promedio);
                break;
            }
            else
            {
                System.out.println("Alumno no encontrado");
            }
        }
    }
}
