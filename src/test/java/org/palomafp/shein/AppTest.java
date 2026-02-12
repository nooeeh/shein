package org.palomafp.shein;

import org.junit.jupiter.api.Test;
import org.palomafp.shein.modelo.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;

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
        Modelo modelo = sheinDAO.getModelos().get(0);
        assertNotNull(modelo, "El resultado no debe ser nulo");
    }
}
