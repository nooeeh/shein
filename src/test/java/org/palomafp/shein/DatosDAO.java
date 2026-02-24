package org.palomafp.shein;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DatosDAO {

    @Test
    void testInicializacionDAO() {

        ProductosDAO dao = new ProductosDAO();

        assertNotNull(dao.getProductoByCodigo(23));
        assertNotNull(dao.getAllProductos());
        assertNotNull(dao.getProductoRandom());
        
       
    }
}
