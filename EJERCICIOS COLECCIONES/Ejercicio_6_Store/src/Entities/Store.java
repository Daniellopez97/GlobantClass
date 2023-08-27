package Entities;

import java.util.HashMap;
import java.util.Map;

public class Store {

    private HashMap<String, Double> Products = new HashMap();

    public Store() {
    }

    public HashMap<String, Double> getProducts() {
        return Products;
    }

    public void addProduct(String product, double price) {

        Products.put(product, price);

    }

    public void setProducts(HashMap<String, Double> Products) {
        this.Products = Products;
    }

    @Override
    public String toString() {

        for (Map.Entry<String, Double> entry : Products.entrySet()) {

            String key = entry.getKey();
            Double value = entry.getValue();

            System.out.println("Producto: " + entry.getKey() + " precio: " + entry.getValue());

        }

        return "";

    }

}
