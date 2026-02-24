package org.palomafp.shein;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //Instanciamos DAO de productos
        ProductosDAO productosDAO = new ProductosDAO();

        // --- PRUEBAS POR CONSOLA ---
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
            case 1:
                System.out.println(productosDAO.getProductoRandom());
                break;
            case 2:
                System.out.println(productosDAO.getAllProductos());
                break;
            case 3:
                System.out.println("Introduce el código:");
                 codigo= sc.nextInt();
                 sc.nextLine();
                System.out.println(productosDAO.getProductoByCodigo(codigo));
                break;
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
