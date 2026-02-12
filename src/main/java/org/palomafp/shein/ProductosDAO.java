package org.palomafp.shein;

import java.util.ArrayList;
import java.util.List;
import org.palomafp.shein.modelo.Categoria;
import org.palomafp.shein.modelo.Distribuidor;
import org.palomafp.shein.modelo.Local;
import org.palomafp.shein.modelo.Modelo;
import org.palomafp.shein.modelo.Producto;

public class ProductosDAO {

    private List<Producto> productos;
    private List<Local> locales;

    public ProductosDAO() {

        //inicializamos la lista de productos
        productos = new ArrayList<>();

        // 1. Distribuidor
         List<Distribuidor> distribuidores = new ArrayList<>();
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

        // 3. Categoria
        Categoria categoria = new Categoria(
                "Camisetas",
                Categoria.Genero.FEMENINO
        );


        // 4. Producto
        Producto camiseta1 = new Producto(
                1001,
                "M",
                "Rojo",
                "19.99€",
                "Algodón",
                modelo1,
                categoria,
                distribuidores
        );
        //Añadimos el producto a la lista de productos
        productos.add(camiseta1);

    }

    

    //get objeto random
    public Producto getProductoRandom() {
        if (productos.isEmpty()) {
            return null;
        }
        else {
            return productos.get(0);
        }
    }

    public Producto getProductoByCodigo() {
        return null;
    }

    public List<Producto> getAllProductos() {
        
        return productos;
    }
}