
/* EJERCICIO EXTRA 2

Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios */

package Ejercicio_2_Extra_Cantante;

import Service.CantanteFamosoService;
import java.util.Scanner;

public class Ejercicio_2_Extra {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        CantanteFamosoService cf = new CantanteFamosoService();
        System.out.println("Ingresa 5 cantantes");
        cf.registerCantante();
        int answer;
        do {

            System.out.println("MENU PRINCIPAL");
            System.out.println("1) Registrar otro cantante");
            System.out.println("2)Imprimir cantante");
            System.out.println("3)Eliminar cantante");
            System.out.println("4)Salir");

            answer = read.nextInt();

            switch (answer) {

                case 1:
                    cf.registrarCantanteIndividual();
                    break;
                case 2:
                    cf.printCantante();
                    break;
                case 3:
                    cf.removeCantante();
                    break;
            }
        } while (!(answer == 4));
    }
}





    

