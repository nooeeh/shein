package org.palomafp.shein;

import java.util.ArrayList;
import java.util.List;
import org.palomafp.shein.modelo.Categoria;
import org.palomafp.shein.modelo.Distribuidor;
import org.palomafp.shein.modelo.Modelo;
import org.palomafp.shein.modelo.Producto;

public class ProductosDAO {

    private List<Producto> productos;

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


        // 4. Productos
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
        productos.add(camiseta1);

        Producto camiseta2 = new Producto(
                        1002,
                        "L",
                        "Azul",
                        "24.99€",
                        "Poliéster",
                        modelo1,
                        categoria,
                        distribuidores
        );
        productos.add(camiseta2);

        Producto pantalon1 = new Producto(
                        2001,
                        "S",
                        "Negro",
                        "39.99€",
                        "Lona",
                        modelo1,
                        categoria,
                        distribuidores
        );
        productos.add(pantalon1);

        Producto vestido1 = new Producto(
                        3001,
                        "M",
                        "Verde",
                        "29.99€",
                        "Seda",
                        modelo1,
                        categoria,
                        distribuidores
        );
        productos.add(vestido1);

        Producto falda1 = new Producto(
                        4001,
                        "L",
                        "Amarillo",
                        "34.99€",
                        "Algodón",
                        modelo1,
                        categoria,
                        distribuidores
        );
        productos.add(falda1);

    }

    // get objeto random
    public Producto getProductoRandom() {
        if (productos.isEmpty()) {
            return null;
        } else {
            
            return productos.get((int) (Math.random() * productos.size()));
        }
    }

    //objeto por id
    public Producto getProductoByCodigo(Integer codigo) {
        if (codigo == null) {
            return null;
        }
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                return producto;
            }
        }
        return null;
    }

    //todos los productos
    public List<Producto> getAllProductos() {

        return productos;
    }

    public List<Producto> clearAll() {
        productos.clear();
        return productos;
    }
}