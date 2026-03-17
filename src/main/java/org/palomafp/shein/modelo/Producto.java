package org.palomafp.shein.modelo;

import java.util.List;

/**
 * Clase producto con todos los atributos y métodos para crear un producto
 * completo e implementarlo en otras clases
 */
public class Producto {

    // Codigo numérico de 4 dígitos
    private int codigo;
    // Talla en EU
    private String talla;
    private String color;
    // Precio del producto en euros
    private String precio;
    private String material;
    // Persona que posa con dicho producto
    private Modelo modelo;

    private Categoria categoria;

    private List<Distribuidor> distribuidor;

    /**
     * Constructor por defecto de la clase producto
     */
    public Producto() {
    }

    /**
     * Constructor de la clase completo con los
     * 
     * @param codigo       código numérico de 4 dígitos
     * @param talla        talla en EU
     * @param color        color del producto
     * @param precio       precio del producto en euros
     * @param material     material del producto
     * @param modelo       persona que posa con dicho producto
     * @param categoria    categoría del producto
     * @param distribuidor lista de distribuidores del producto
     */
    public Producto(int codigo, String talla, String color, String precio, String material,
            Modelo modelo, Categoria categoria, List<Distribuidor> distribuidor) {
        this.codigo = codigo;
        this.talla = talla;
        this.color = color;
        this.precio = precio;
        this.material = material;
        this.modelo = modelo;
        this.categoria = categoria;
        this.distribuidor = distribuidor;
    }

    /**
     * Métodos getter y setter para los atributos de la clase
     * 
     * @return Devuelve el código, talla, color, precio, material, modelo, categoría
     *         y distribuidores del producto
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Método setter para el código del producto
     * 
     * @param codigo código numérico de 4 dígitos a establecer
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Método getter para la talla del producto
     * 
     * @return Devuelve la talla del producto en EU
     */
    public String getTalla() {
        return talla;
    }

    /**
     * Método setter para la talla del producto
     * 
     * @param talla talla en EU a establecer
     */
    public void setTalla(String talla) {
        this.talla = talla;
    }

    /**
     * Método getter para el color del producto
     * 
     * @return Devuelve el color del producto
     */
    public String getColor() {
        return color;
    }

    /**
     * Método setter para el color del producto
     * 
     * @param color color del producto a establecer
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Método getter para el precio del producto
     * 
     * @return Devuelve el precio del producto en euros
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * Método setter para el precio del producto
     * 
     * @param precio precio del producto en euros a establecer
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * Método getter para el material del producto
     * 
     * @return Devuelve el material del producto
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Método setter para el material del producto
     * 
     * @param material material del producto a establecer
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Método getter para el modelo del producto
     * 
     * @return Devuelve el modelo del producto
     */
    public Modelo getModelo() {
        return modelo;
    }

    /**
     * Método setter para el modelo del producto
     * 
     * @param modelo modelo del producto a establecer
     */
    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    /**
     * Método getter para la categoría del producto
     * 
     * @return Devuelve la categoría del producto
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * Método setter para la categoría del producto
     * 
     * @param categoria categoría del producto a establecer
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * Método getter para la lista de distribuidores del producto
     * 
     * @return Devuelve la lista de distribuidores del producto
     */
    public List<Distribuidor> getDistribuidor() {
        return distribuidor;
    }

    /**
     * Método setter para la lista de distribuidores del producto
     * 
     * @param distribuidor lista de distribuidores del producto a establecer
     */
    public void setDistribuidor(List<Distribuidor> distribuidor) {
        this.distribuidor = distribuidor;
    }

    /**
     * Método toString para mostrar toda la información del producto
     * 
     * @return Devuelve una cadena con el código, talla, color, precio, material,
     *         modelo, categoría y distribuidores del producto
     */
    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", talla='" + talla + '\'' +
                ", color='" + color + '\'' +
                ", precio='" + precio + '\'' +
                ", material='" + material + '\'' +
                ", modelo=" + modelo +
                ", categoria=" + (categoria != null ? categoria.getTipo() : "null") + // Solo el tipo
                ", distribuidor=" + distribuidor +
                '}';
    }
}
