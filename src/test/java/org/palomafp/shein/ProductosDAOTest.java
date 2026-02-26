package org.palomafp.shein;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.palomafp.shein.modelo.Producto;

public class ProductosDAOTest {

    @Test
    void testInicializacionDAO() {
        ProductosDAO dao = new ProductosDAO();

        // existe un producto con código 1001 según la inicialización
        assertNotNull(dao.getProductoByCodigo(1001));
        assertNotNull(dao.getAllProductos());
        assertNotNull(dao.getProductoRandom());
    }

    @Test
    void getProductoRandomEmpty() {
        ProductosDAO dao = new ProductosDAO();
        dao.clearAll();
        Producto resultado = dao.getProductoRandom();
        assertNull(resultado);
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
    assertEquals(null, resultado, "Sale null al ya existir ese código");
    }
}
