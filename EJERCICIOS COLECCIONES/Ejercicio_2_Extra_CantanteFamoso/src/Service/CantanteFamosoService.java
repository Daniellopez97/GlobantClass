package Service;

import Entities.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CantanteFamosoService {

    private ArrayList<CantanteFamoso> cantanteFam = new ArrayList<>();
    private Scanner read = new Scanner(System.in);
    private CantanteFamoso cf;

    public void registerCantante() {
        for (int i = 0; i < 5; i++) {
            registrarCantanteIndividual();
        }

    }
    public void printCantante() {

        for (CantanteFamoso cantanteFamoso : cantanteFam) {

            System.out.println("Cantante:" + cantanteFamoso.getName());
            System.out.println("Cancion Mas vendida:" + cantanteFamoso.getDiscoConMasVentas());
            System.out.println("_______________________________");

        }
    }
    public void registrarCantanteIndividual() {
        try {
            System.out.println("Ingresa el nombre del cantante");
            String newName = read.nextLine();
            System.out.println("Ingresa su cancion con mas ventas");
            String newDiscoConVentas = read.nextLine();

            if (newName.isEmpty() || newDiscoConVentas.isEmpty()) {
                throw new IllegalArgumentException("El nombre y la canción deben tener contenido");
            }
            cf = new CantanteFamoso(newName, newDiscoConVentas);
            cantanteFam.add(cf);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void removeCantante() {
        try {
        System.out.println("Ingresa el nombre del cantante que deseas eliminar:");
        String nombreBuscado = read.nextLine();
        Iterator<CantanteFamoso> iterator = cantanteFam.iterator();

        boolean encontrado = false;
        while (iterator.hasNext()) {
            CantanteFamoso cantanteFamoso = iterator.next();
            if (cantanteFamoso.getName().equals(nombreBuscado)) {
                iterator.remove();
                System.out.println("Cantante eliminado");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
          throw new RuntimeException("Cantante no encontrado. Intenta de nuevo");
        }
        }catch (RuntimeException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
}
