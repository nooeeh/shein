package org.palomafp.shein.modelo;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Producto producto1 = new Producto(1, "M", "Rojo", "29.99", "Algodón", new Modelo(), new Categoria("Ropa", "Femenino"), List.of(Distribuidor.DISTRIBUIDOR1));
        System.out.println(producto1);
        Categoria categoria1 = new Categoria("Ropa", "Femenino");
        System.out.println(categoria1);
        
    }
}
