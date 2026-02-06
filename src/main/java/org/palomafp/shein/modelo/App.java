package org.palomafp.shein.modelo;

public class App {

    public static void main(String[] args) {

        SheinDAO sheinDAO = new SheinDAO();

        // Sacamos objetos desde el DAO
        Modelo modelo = sheinDAO.getModelos().get(0);
        Producto camiseta1 = sheinDAO.getProductos().get(0);
        Local tiendaCentro = sheinDAO.getLocales().get(0);
        Distribuidor dist1 = sheinDAO.getDistribuidores().get(0);

        // --- PRUEBAS POR CONSOLA ---
        System.out.println("=== PRUEBA DE CLASES SHEIN ===");

        System.out.println("\n--- Datos del Local ---");
        System.out.println(tiendaCentro);

        System.out.println("\n--- Datos del Producto ---");
        System.out.println("Código: " + camiseta1.getCodigo()
                + " | Color: " + camiseta1.getColor());
        System.out.println("Modelo asignado: "
                + camiseta1.getModelo().getNombre());

        System.out.println("\n--- Datos del Distribuidor ---");
        System.out.println(dist1);
    }
}
