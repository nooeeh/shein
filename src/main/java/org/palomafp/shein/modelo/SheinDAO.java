package org.palomafp.shein.modelo;

import java.util.ArrayList;
import java.util.List;

public class SheinDAO {

    private List<Distribuidor> distribuidores;
    private List<Producto> productos;
    private List<Local> locales;
    private List<Categoria> categorias;
    private List<Modelo> modelos;

    public SheinDAO() {

        distribuidores = new ArrayList<>();
        productos = new ArrayList<>();
        locales = new ArrayList<>();
        categorias = new ArrayList<>();
        modelos = new ArrayList<>();

        // 1. Distribuidor
        Distribuidor dist1 = new Distribuidor(
                "D001",
                600123456L,
                "contacto@distri.es",
                "España"
        );
        distribuidores.add(dist1);

        // 2. Modelo
        Modelo modelo1 = new Modelo(
                "Lucía",
                "García",
                655443322L,
                "12345678Z",
                "lucia@model.com",
                Modelo.Genero.FEMENINO
        );
        modelos.add(modelo1);

        // 3. Categoria
        Categoria catRopa = new Categoria(
                new ArrayList<>(),
                "Camisetas",
                Categoria.Genero.FEMENINO
        );
        categorias.add(catRopa);

        // 4. Producto
        List<Distribuidor> listaDistribuidores = new ArrayList<>();
        listaDistribuidores.add(dist1);

        Producto camiseta1 = new Producto(
                1001,
                "M",
                "Blanco",
                "15.99€",
                "Algodón",
                modelo1,
                catRopa,
                listaDistribuidores
        );
        productos.add(camiseta1);

        // 5. Relación categoria-producto
        catRopa.getProductos().add(camiseta1);

        // 6. Local
        List<Producto> stockLocal = new ArrayList<>();
        stockLocal.add(camiseta1);

        Local tiendaCentro = new Local(
                stockLocal,
                "Calle Mayor 1",
                "M-01",
                912345678L
        );
        locales.add(tiendaCentro);
    }

    // GETTERS Y SETTERS

    public List<Distribuidor> getDistribuidores() {
        return distribuidores;
    }

    public void setDistribuidores(List<Distribuidor> distribuidores) {
        this.distribuidores = distribuidores;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Local> getLocales() {
        return locales;
    }

    public void setLocales(List<Local> locales) {
        this.locales = locales;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }
}
