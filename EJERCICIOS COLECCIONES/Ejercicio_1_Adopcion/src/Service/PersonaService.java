package Service;

import Entities.Perro;
import Entities.Persona;

public class PersonaService {

    Persona p1 = new Persona("Daniel", "Lopez", 24, 1107510714);
    Persona p2 = new Persona("Maria", "Garcia", 50, 315987);

    Perro pr1 = new Perro("luca", "labrador", "grande", 3);
    Perro pr2 = new Perro("bobi", "husky", "grande", 3);

    public void asignarPerro() {

        p1.setPerro(pr1);
        p2.setPerro(pr2);
    }

    public void Print() {

        System.out.println(p1.toString());
        System.out.println(p2.toString());

    }
//Danieldd
}
