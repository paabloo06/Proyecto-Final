
package model;


import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

public class Comida implements Serializable {
    @Serial
    private static final long serialVersionUID = -5301436069276425772L;

    private String id;
    private String titulo;
    private double precio;
    private String ingredientes;
    private String pathImagen;

    // GETTER Y SETTER DE ID
    public String getId() {
        return id;
    }

    // GETTER Y SETTER DE TÍTULO
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // GETTER Y SETTER DE PRECIO
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPathImagen() {
        return pathImagen;
    }

    public void setPathImagen(String pathImagen) {
        this.pathImagen = pathImagen;
    }

    // CONSTRUCTOR
    public Comida() {
        this.id = generarIdUnico();
    }

    public Comida(String titulo, double precio, String ingredientes) {
        this();
        this.titulo = titulo;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    public String generarIdUnico(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    //TO STRING
    @Override
    public String toString() {
        return "Comida{" + "titulo=" + titulo + ", precio=" + precio + '}';
    }

}