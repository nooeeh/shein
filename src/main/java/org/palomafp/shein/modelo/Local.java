package org.palomafp.shein.modelo;

import java.util.List;

/**
 * Clase local con todos los atributos y métodos para crear un local completo e
 * implementarlo en otras clases
 */
public class Local {
    // Lista de productos en el local
    private List<Producto> productos;
    // Dirección del local
    private String direccion;
    // Código del local
    private String codigo;
    // Teléfono del local
    private long telefono;

    /**
     * Constructor por defecto del local
     */
    public Local() {
    }

    /**
     * Constructor con parámetros para crear un local completo
      *
     * @param productos Lista de productos en el local
     * @param direccion Dirección del local
     * @param codigo    Código del local
     * @param telefono  Teléfono del local
     */
    public Local(List<Producto> productos, String direccion, String codigo, long telefono) {
        this.productos = productos;
        this.direccion = direccion;
        this.codigo = codigo;
        this.telefono = telefono;
    }

    /**
     * Métodos getter y setter para los atributos de la clase
     * 
     * @return Devuelve la lista de productos, dirección, código y teléfono del
     *         local
     */
    public List<Producto> getProductos() {
        return productos;
    }

    /**
     * Método setter para la lista de productos en el local
     * 
     * @param productos Lista de productos a establecer en el local
     */
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    /**
     * Método getter para la dirección del local
     * 
     * @return Devuelve la dirección del local
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método setter para la dirección del local
     * 
     * @param direccion Dirección del local a establecer
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método getter para el código del local
     * 
     * @return Devuelve el código del local
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Método setter para el código del local
     * 
     * @param codigo Código del local a establecer
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Método getter para el teléfono del local
     * 
     * @return Devuelve el teléfono del local
     */
    public long getTelefono() {
        return telefono;
    }

    /**
     * Método setter para el teléfono del local
     * 
     * @param telefono Teléfono del local a establecer
     */
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    /**
     * Método toString para mostrar toda la información del local
     * 
     * @return Devuelve una cadena con la lista de productos, dirección, código y
     *         teléfono del local
     */
    @Override
    public String toString() {
        return "Local{" +
                "productos=" + productos +
                ", direccion='" + direccion + '\'' +
                ", codigo='" + codigo + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
