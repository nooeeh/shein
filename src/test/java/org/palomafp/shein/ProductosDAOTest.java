package org.palomafp.shein;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.palomafp.shein.modelo.Producto;

public class ProductosDAOTest {

    @Test
    void testInicializacionDAO() {
        ProductosDAO dao = new ProductosDAO();

        assertNotNull(dao.getAllProductos(), "Lista de productos no puede ser vacía");
        assertNotNull(dao.getProductoByCodigo(1001), "Existe un producto con código 1001 según la inicialización");
    }

    @Test
    void getProductoRandomEmpty() {
        ProductosDAO dao = new ProductosDAO();
        dao.clearAll();
        Producto resultado = dao.getProductoRandom();
        assertNull(resultado);
    }

    @Test
    void getProductoRandom() {
        ProductosDAO dao = new ProductosDAO();
        Producto resultado = dao.getProductoRandom();
        assertNotNull(resultado, "El producto random no puede ser null");
        assertNotNull(resultado.getCategoria(), "La categoría no puede ser null");
        assertNotNull(resultado.getCodigo(), "El código no puede ser null");
        assertNotNull(resultado.getColor(), "El color no puede ser null");
        assertNotNull(resultado.getPrecio(), "El precio no puede ser null");
        assertNotEquals(0, resultado.getPrecio(), "El precio tiene que ser mayor que 0");
        assertNotNull(resultado.getDistribuidor(), "El distribuidor no puede ser null");
        assertNotNull(resultado.getTalla(), "La talla no puede ser null");
    }

    @Test
    void getProductoByCodigoNull() {
        ProductosDAO dao = new ProductosDAO();
        Producto resultado = dao.getProductoByCodigo(null);
        assertNull(resultado, "Cuando el código es nulo");
    }

    @Test
    void getProductoByCodigoReal() {
    ProductosDAO dao = new ProductosDAO();
    Producto resultado = dao.getProductoByCodigo(1001);
    assertNotNull(resultado, "Debe devolver un producto cuando el código existe");
    assertEquals(1001, resultado.getCodigo(), "El código debe coincidir");
    }

    @Test
    void getProductoByCodigoInvalido() {
        ProductosDAO dao = new ProductosDAO();
        Producto resultado = dao.getProductoByCodigo(9999);
        assertNull(resultado, "Debe devolver null cuando el código no existe");
    }

    @Test
    void getAllProductos() {
        ProductosDAO dao = new ProductosDAO();
        var productos = dao.getAllProductos();
        assertNotNull(productos, "La lista no puede ser null");
        assertFalse(productos.isEmpty(), "La lista no puede estar vacía");
        assertTrue(productos.size() >= 4, "Debe haber al menos 4 productos según la inicialización");
        // Verificar que contiene productos específicos
        assertTrue(productos.stream().anyMatch(p -> p.getCodigo() == 1001), "Debe contener el producto con código 1001");
    }

    @Test
    void clearAll() {
        ProductosDAO dao = new ProductosDAO();
        var productosAntes = dao.getAllProductos();
        assertFalse(productosAntes.isEmpty(), "Debe haber productos antes de limpiar");

        var resultado = dao.clearAll();
        assertNotNull(resultado, "clearAll debe devolver la lista");
        assertTrue(resultado.isEmpty(), "La lista debe estar vacía después de clearAll");

        var productosDespues = dao.getAllProductos();
        assertTrue(productosDespues.isEmpty(), "getAllProductos debe devolver lista vacía después de clearAll");
    }
}
