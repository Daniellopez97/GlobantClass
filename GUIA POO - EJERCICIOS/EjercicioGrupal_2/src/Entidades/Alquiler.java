
package Entidades;

import java.time.LocalDate;




public class Alquiler {
    
    
    private LocalDate fechainicio;
    private LocalDate fechaFin;
    private double precio;
    private String nombrepelicula;

    public Alquiler() {
    }

    public Alquiler(LocalDate fechainicio, LocalDate fechaFin, double precio, String nombrepelicula) {
        this.fechainicio = fechainicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
        this.nombrepelicula = nombrepelicula;
    }

    public LocalDate getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDate fechainicio) {
        this.fechainicio = fechainicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombrepelicula() {
        return nombrepelicula;
    }

    public void setNombrepelicula(String nombrepelicula) {
        this.nombrepelicula = nombrepelicula;
    }
    
    
}