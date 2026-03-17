package org.palomafp.shein;

import java.util.Scanner;

/**
 * Clase principal que implementa y prueba las clases del proyecto
 */
public class App {

    /**
     * Método principal que inicia la ejecución de la aplicación
     * 
     * @param args Array de parámetros de entrada
     */
    public static void main(String[] args) {

        /**
         * Nuevo objeto de productos ProductosDAO
         */
        ProductosDAO productosDAO = new ProductosDAO();

        // Menu de opciones con las pruebas de las clases
        Scanner sc = new Scanner(System.in);
        int opcion;
        int codigo;
        do {
            System.out.println("=== PRUEBA DE CLASES SHEIN ===");
            System.out.println("1. Devolver un producto aleatorio");
            System.out.println("2. Devolver la lista de todos los productos");
            System.out.println("3. Devolver un producto por su código");
            System.out.println("0. Salir del programa");
            System.out.println("Introduce una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                // devolver un producto aleatorio
                case 1:
                    System.out.println(productosDAO.getProductoRandom());
                    break;
                // devolver la lista de todos los productos
                case 2:
                    System.out.println(productosDAO.getAllProductos());
                    break;
                // devolver un producto por su código
                case 3:
                    System.out.println("Introduce el código:");
                    codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.println(productosDAO.getProductoByCodigo(codigo));
                    break;
                // salir del programa
                case 0:
                    System.out.println("Saliendo...");
                default:
                    System.out.println("Introduce un valor válido");
                    System.out.println();
                    break;
            }
        } while (opcion != 0);

        sc.close();
    }
}
