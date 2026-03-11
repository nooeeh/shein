# Proyecto Shein

## Descripción
Este proyecto es una aplicación Java simple para gestionar productos de una tienda de moda llamada Shein. Incluye clases para representar productos, categorías, distribuidores y modelos, junto con un DAO para acceder a los datos.

## Estructura del Proyecto
- `src/main/java/org/palomafp/shein/`: Código fuente principal
  - `App.java`: Clase principal con menú de consola para pruebas
  - `ProductosDAO.java`: DAO para gestionar productos
  - `modelo/`: Paquete con clases de modelo (Producto, Categoria, Distribuidor, etc.)
- `src/test/java/org/palomafp/shein/`: Pruebas unitarias
  - `AppTest.java`
  - `ProductosDAOTest.java`

## Requisitos
- Java 21
- Maven

## Cómo ejecutar
1. Clona el repositorio.
2. Navega al directorio del proyecto.
3. Ejecuta `mvn clean compile` para compilar.
4. Ejecuta `mvn exec:java -Dexec.mainClass="org.palomafp.shein.App"` para ejecutar la aplicación.
5. Para ejecutar pruebas: `mvn test`.

## Dependencias
- JUnit 5.11.0 (solo para pruebas)

## Autor
Proyecto desarrollado por Noelia Jorquera y Samuel Pérez.