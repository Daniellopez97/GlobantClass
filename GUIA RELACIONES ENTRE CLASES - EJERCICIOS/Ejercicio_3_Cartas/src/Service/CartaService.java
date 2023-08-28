package Service;

import Entities.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CartaService {

    private Scanner read = new Scanner(System.in);
    private String[] paloCarta = {"espadas", "bastos", "oros", "copas"}; // Vector
    private ArrayList<Carta> Baraja = new ArrayList();
    private ArrayList<Carta> CartasEntregadas = new ArrayList();

    public void crearBaraja() {

        System.out.println("Se esta creando la Baraja............");

        for (String carta : paloCarta) {
            for (int i = 1; i < 13; i++) {
                if (i < 8 || i > 9) {
                    Baraja.add(new Carta(i, carta));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(Baraja);
    }

    public void siguienteCarta() {
        if (!(Baraja.isEmpty())) {
            System.out.println(Baraja.get(0));
        } else {
            System.out.println(" No hay mas cartas en la baraja");
        }
    }

    public void cartasDisponibles() {

        System.out.println(Baraja.size() + " Cartas");

    }

    public void darCartas() {

        System.out.println("Cuantas cartas requieres?");
        int cartasEntregar = read.nextInt();

        if (Baraja.size() > cartasEntregar) {
            for (int i = 0; i < cartasEntregar; i++) {
                CartasEntregadas.add(Baraja.remove(i));
            }
            System.out.println("Cartas entregadas con exito");
        } else {

            System.out.println(" La baraja no cuenta con las cartas requeridas");
        }
    }

    public void CartasMonton() {

        System.out.println("CARTAS Que estan por fuera:");
        System.out.println("____________________");

        if (!(CartasEntregadas.isEmpty())) {
            for (Carta cartaFuera : CartasEntregadas) {

                System.out.println("Carta : " + cartaFuera.getNumCarta() + " de " + cartaFuera.getPalo());
            }
        } else {
            System.out.println("No ha salido ninguna carta de la baraja");
        }
    }

    public void mostrarBaraja() {
        System.out.println("CARTAS EN BARAJA:");
        System.out.println("____________________");
        for (Carta carta : Baraja) {

            System.out.println("Carta : " + carta.getNumCarta() + " de " + carta.getPalo());
        }

    }

}
