
package Entities;

import java.util.HashSet;


public class Libro {
    
    private String titulo,autor;
    private int numEjemplar, numEjemplarPrestado;
   
    public Libro() {
    }
    
    public Libro(String titulo, String autor, int numEjemplar) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplar= numEjemplar;
   
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplar() {
        return numEjemplar;
    }

    public void setNumEjemplar(int numEjemplar) {
        this.numEjemplar = numEjemplar;
    }

    public int getNumEjemplarPrestado() {
        return numEjemplarPrestado;
    }

    public void setNumEjemplarPrestado(int numEjemplarPrestado) {
        this.numEjemplarPrestado = numEjemplarPrestado;
    }





    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", numEjemplar=" + numEjemplar + '}';
    }
    
    
    
    
    
}
