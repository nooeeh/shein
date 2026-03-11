package org.palomafp.shein.modelo;
import java.util.List;

/**
 * Clase producto con todos los atributos y métodos para crear un producto completo e implementarlo en otras clases
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

    public Producto() {
    }

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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Distribuidor> getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(List<Distribuidor> distribuidor) {
        this.distribuidor = distribuidor;
    }
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
