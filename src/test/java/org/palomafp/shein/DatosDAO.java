package org.palomafp.shein;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DatosDAO {

    @Test
    void testInicializacionDAO() {

        ProductosDAO dao = new ProductosDAO();

        assertNotNull(dao);
        assertNotNull(dao.getProductos());
        assertNotNull(dao.getLocales());
        assertNotNull(dao.getModelos());
        assertNotNull(dao.getDistribuidores());
        assertNotNull(dao.getCategorias());
    }
}
