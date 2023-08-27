package Service;

import Entities.Ciudad;
import java.util.Map;
import java.util.Scanner;

public class CiudadService {

    Ciudad ciudad = new Ciudad();
    Scanner read = new Scanner(System.in);

    public void registerCity() {
        System.out.println("Ingresa el nombre de la ciudad");
        String nameCiudad = read.nextLine();
        

        System.out.println("Ingresa el codigo de postal de la ciudad");
        int Codigo = read.nextInt();

        ciudad.agregarCiudad(nameCiudad, Codigo);
        read.nextLine();
    }

    public void register10City() {
        System.out.println("Ingresa el nombre de ciudades con su respectivo codigo postal");
        for (int i = 0; i < 10; i++) {
            System.out.println("Ciudad # " + (i + 1));
            registerCity();
        }
    }

    public void removeCity() {

        System.out.println("Elimina tres ciudades");

        for (int i = 0; i < 3; i++) {
            boolean flag;
            do {
                System.out.println("Ingresa el nombre de la ciudad #" + (i + 1));
                String nameRemove = read.nextLine();

                if (ciudad.getCiudad().containsKey(nameRemove)) {

                    ciudad.getCiudad().remove(nameRemove);
                    System.out.println("Se elimino el producto correctamente");
                    flag = false;
                } else {
                    System.out.println("Ciudad Incorrecta, ingresa el nombre correcto");
                    flag = true;
                }
            } while (flag);
        }
    }
    
    public void searchCity() {
        
        boolean flag;
        do {
         
        System.out.println(" Cual ciudad deseas Buscar de la lista");

        String nameSearch = read.nextLine();
        
        if (ciudad.getCiudad().containsKey(nameSearch)) {
            
            System.out.println("Ciudad " + ciudad.getCiudad());
            System.out.println("Codigo Postal" + ciudad.getCodigoPostal());
            flag=true;
        
        }
        else
        {
            System.out.println("La ciudad no se encuentra registrada, intenta buscado otra");
            flag=false;
        }
        
        } while (!(flag));
        
    }

    public void printCity() {

        for (Map.Entry<String, Integer> en : ciudad.getCiudad().entrySet()) {
            String key = en.getKey();
            Integer value = en.getValue();

            System.out.println(" Ciudad : " + en.getKey());
            System.out.println(" Codigo Postal : " + en.getValue());
            System.out.println(" ______________________________");

        }

      }

    
    
    
    
    
}
