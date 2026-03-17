package org.palomafp.shein.modelo;

/**
 * Clase categoria con todos los atributos y métodos para crear una categoría
 * completa e implementarla en otras clases
 */
public class Categoria {
    // Tipo de producto
    private String tipo;
    // Género al que va dirigido el producto
    private Genero genero;

    /**
     * Enumeración para el género de los productos
     */
    public enum Genero {
        MASCULINO, FEMENINO, UNISEX
    }

    /**
     * Constructor por defecto de la categoría
     */
    public Categoria() {
    }

    /**
     * Constructor con parámetros para crear una categoría completa
     * 
     * @param tipo   Tipo de producto
     * @param genero Género al que va dirigido el producto
     */
    public Categoria(String tipo, Genero genero) {
        this.tipo = tipo;
        this.genero = genero;
    }

    /**
     * Métodos getter y setter para los atributos de la clase
     * 
     * @return Devuelve el tipo de producto y el género al que va dirigido el
     *         producto
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Método setter para el tipo de producto
     * 
     * @param tipo Tipo de producto a establecer
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Método getter para el género al que va dirigido el producto
     * 
     * @return Devuelve el género al que va dirigido el producto
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * Método setter para el género al que va dirigido el producto
     * 
     * @param genero Género al que va dirigido el producto a establecer
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     * Método toString para mostrar toda la información de la categoría
     * 
     * @return Devuelve una cadena con el tipo de producto y el género
     */
    @Override
    public String toString() {
        return "Categoria{" +
                "tipo='" + tipo + '\'' +
                ", genero=" + genero +
                ", totalProductos=" +
                '}';
    }

}
