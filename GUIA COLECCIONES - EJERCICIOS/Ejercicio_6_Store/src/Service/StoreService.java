package Service;

import Entities.Store;
import java.util.Scanner;

public class StoreService {

    Store store = new Store();
    Scanner Read = new Scanner(System.in);

    public void registerProduct() {

        System.out.println("Cual es el producto a ingresar a la tienda");
        String product = Read.nextLine().toUpperCase();

        System.out.println("Cual es el precio del producto");
        double price = Read.nextDouble();

        Read.nextLine();

        store.addProduct(product, price);
    }

    public void printProduct() {
        System.out.println("******** PRODUCTOS REGISTRADOS **********");
        System.out.println(store.toString());
    }

    public void removeProduct() {

        System.out.println("¿Cual producto deseas eliminar?");

        String ProductToRemove = Read.nextLine().toUpperCase();

        if (store.getProducts().containsKey(ProductToRemove)) {

            store.getProducts().remove(ProductToRemove);
            System.out.println("Se elimino el producto correctamente");
        } else {
            System.out.println("Producto no encontrado, ingresa un producto correcto");
        }

    }

    public void modifyPrice() {

        System.out.println("¿Cual producto deseas modificar el precio?");
        String ProductToModify = Read.nextLine().toUpperCase();

        if (store.getProducts().containsKey(ProductToModify)) {

            System.out.println("¿Ingresa el nuevo precio?");
            double newPrice = Read.nextDouble();

            store.getProducts().replace(ProductToModify, newPrice);
            System.out.println("El Precio del producto " + ProductToModify + " fue modificado");
        }
else {
        System.out.println("Producto no encontrado, ingresa un producto correcto");
    }
    }

}
