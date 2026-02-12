package org.palomafp.shein;

import org.palomafp.shein.modelo.Producto;

public class App {

    public static void main(String[] args) {

        //Instanciamos DAO de productos
        ProductosDAO productosDAO = new ProductosDAO();

        // --- PRUEBAS POR CONSOLA ---
        System.out.println("=== PRUEBA DE CLASES SHEIN ===");
        Producto producto = productosDAO.getProductoRandom();
        System.out.println( producto );
    }
}
