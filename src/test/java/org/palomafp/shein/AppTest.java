package org.palomafp.shein;

import org.junit.jupiter.api.Test;
import org.palomafp.shein.modelo.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    
   
    @Test
    void TestShein() {

        ProductosDAO sheinDAO = new ProductosDAO();
        assertNotNull( sheinDAO.getAllProductos(),"El resultado no debe ser nulo");
    }
}
