package org.palomafp.shein;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //Instanciamos DAO de productos
        ProductosDAO productosDAO = new ProductosDAO();

        // --- PRUEBAS POR CONSOLA ---
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        do {
        System.out.println("=== PRUEBA DE CLASES SHEIN ===");
        System.out.println("1. Devolver un producto aleatorio");
        System.out.println("2. Devolver la lista de todos los productos");
        System.out.println("3. Devolver un producto por su código");
        System.out.println("0. Salir del programa");
        System.out.println("Introduce una opción: ");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println(productosDAO.getProductoRandom());
            case 2:
                System.out.println(productosDAO.getAllProductos());
            case 3:
                int codigo = sc.nextInt();
                System.out.println(productosDAO.getProductoByCodigo(codigo));
            case 0:
            System.out.println("Saliendo...");
            default:
                System.out.println("Introduce un valor válido");
                System.out.println();
        }
        } while (opcion != 0);
        
        sc.close();
    }
}
