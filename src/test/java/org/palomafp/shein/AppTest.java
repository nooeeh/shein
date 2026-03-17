package org.palomafp.shein;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Unit test for simple App.
 */
public class AppTest 
{  
   
    @Test
    void TestShein() {
        ProductosDAO sheinDAO = new ProductosDAO();
        assertNotNull( sheinDAO.getAllProductos(),"El resultado no debe ser nulo");
    }

    @Test
    void TestProductoRandom() {
        ProductosDAO sheinDAO = new ProductosDAO();
        assertNotNull(sheinDAO.getProductoRandom(), "El producto random no debe ser nulo");
    }

    @Test
    void TestProductoByCodigo() {
        ProductosDAO sheinDAO = new ProductosDAO();
        assertNotNull(sheinDAO.getProductoByCodigo(1001), "Debe encontrar el producto con código 1001");
    }
}
