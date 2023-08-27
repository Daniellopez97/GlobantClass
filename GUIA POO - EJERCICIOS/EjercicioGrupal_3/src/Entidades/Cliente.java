
package Entidades;


public class Cliente {
    
    private long id;
    private String nombre;
    private int edad;
    private double altura;
    private int peso;
    private String objectivo;

    public Cliente() {
    }

    public Cliente(long id, String nombre, int edad, double altura, int peso, String objectivo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.objectivo = objectivo;
    }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getObjectivo() {
        return objectivo;
    }

    public void setObjectivo(String objectivo) {
        this.objectivo = objectivo;
    }
    
   
    
    
    
}
