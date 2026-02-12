package org.palomafp.shein.modelo;
public class Categoria {
    private String tipo;
    private Genero genero;

    public enum Genero {
        MASCULINO, FEMENINO, UNISEX
    }

    public Categoria() {
    }

    public Categoria(String tipo, Genero genero) {
        this.tipo = tipo;
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
@Override
public String toString() {
    return "Categoria{" +
            "tipo='" + tipo + '\'' +
            ", genero=" + genero +
            ", totalProductos=" +  
            '}';
}
   
    }

