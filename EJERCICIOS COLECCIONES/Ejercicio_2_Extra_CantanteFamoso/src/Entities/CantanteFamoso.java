package Entities;

public class CantanteFamoso {

    private String name;
    private String discoConMasVentas;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String name, String discoConMasVentas) {
        this.name = name;
        this.discoConMasVentas = discoConMasVentas;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDiscoConMasVentas() {
        return discoConMasVentas;
    }
    public void setDiscoConMasVentas(String discoConMasVentas) {
        this.discoConMasVentas = discoConMasVentas;
    }
    @Override
    public String toString() {
        return "CantanteFamoso{" + "name=" + name + ", discoConMasVentas=" + discoConMasVentas + '}';
    }

}
