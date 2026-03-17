package org.palomafp.shein;

import java.util.ArrayList;
import java.util.List;
import org.palomafp.shein.modelo.Categoria;
import org.palomafp.shein.modelo.Distribuidor;
import org.palomafp.shein.modelo.Modelo;
import org.palomafp.shein.modelo.Producto;

/** 
 * Clase del objeto principal que incumbre todas las funcionalidades del resto de clases
 * @author Noelia Jorquera y Samuel Pérez
 * @version 1.0
 */
public class ProductosDAO {

    //Lista de productos de la clase productoDAO
    private List<Producto> productos;

    /**
     * Constructor por defecto de productos con la lista de productos
     */
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

    /**
     * Metodo que genera un producto aleatorio si no está vacía la lista de productos
     * @return Devuelve un producto aleatorio
     */
    public Producto getProductoRandom() {
        // Si la lista de productos está vacía, devolvemos null
        if (productos.isEmpty()) {
            return null;
        } else {
            // generamos un índice aleatorio entre 0 y el tamaño de la lista de productos
            return productos.get((int) (Math.random() * productos.size()));
        }
    }

    /**
     * Metodo que devuelve un producto especificado por su codigo, si el codigo existe
     * @param codigo codigo del producto al cual quieres acceder
     * @return Devuelve el producto del codigo introducido
     */
    public Producto getProductoByCodigo(Integer codigo) {
        // Si el código es nulo, devolvemos null
        if (codigo == null) {
            return null;
        }
        // recorremos la lista de productos para encontrar el producto
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                return producto;
            }
        }
        return null;
    }

    /**
     * Metodo que devuelve todos los productos que hay
     * @return Devuelve la lista entera de productos
     */
    public List<Producto> getAllProductos() {
        return productos;
    }

    /**
     * Metodo que borra todos los productos que hay en la lista productos
     * @return devuelve la lista vacía como confirmación de que ha funcionado
     */
    public List<Producto> clearAll() {
        productos.clear();
        return productos;
    }
}