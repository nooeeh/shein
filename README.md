
# Proyecto Shein

## Descripción

Este proyecto es una aplicación Java diseñada para gestionar productos de una tienda de moda ficticia llamada Shein. La aplicación permite manejar un catálogo de productos de moda, incluyendo información detallada sobre cada artículo como código, talla, color, precio, material, modelo que lo presenta, categoría y distribuidores asociados.

La aplicación está construida siguiendo principios de Programación Orientada a Objetos (POO) y utiliza un patrón DAO (Data Access Object) para la gestión de datos. Incluye una interfaz de consola simple para probar las funcionalidades principales.

### Características Principales

- **Gestión de Productos**: Crear y consultar productos con atributos completos.
- **Modelos de Datos**: Clases para representar productos, categorías, distribuidores, modelos (fashion models) y locales.
- **Operaciones DAO**: Métodos para obtener productos aleatorios, listar todos los productos, buscar por código y limpiar la lista.
- **Interfaz de Consola**: Menú interactivo para probar las funcionalidades.
- **Pruebas Unitarias**: Cobertura de pruebas con JUnit 5.

## Arquitectura y Diseño

### Diagrama de Clases

```mermaid
classDiagram

Producto "1..n" *-- "1" Categoria
Producto "1" --> "0..n" Distribuidor
Producto "0..n" --> "1" Modelo
Local "1..n" o-- "1..n" Producto

    class Producto {
        -int codigo
        -String talla
        -String color
        -String precio
        -String material
        -Categoria categoria
        -Modelo modelo
    }

    class Categoria {
        -String tipo
        -Enum genero
    }

    class Distribuidor {
        -String id
        -long telefono
        -String correo
        -String procedencia
        -List<Producto> productos
    }

    class Modelo {
        -String nombre
        -String apellido
        -long telefono
        -String dni
        -String correo
        -Enum genero
    }

    class Local {
        -List<Producto> productos
        -String direccion
        -String codigo
        -long telefono
    }
```

### Estructura del Proyecto

```
src/
├── main/java/org/palomafp/shein/
│   ├── App.java                          # Clase principal con menú de consola
│   ├── ProductosDAO.java                 # DAO para gestión de productos
│   └── modelo/
│       ├── Producto.java                 # Clase modelo para productos
│       ├── Categoria.java                # Clase modelo para categorías
│       ├── Distribuidor.java             # Clase modelo para distribuidores
│       ├── Modelo.java                   # Clase modelo para modelos (fashion)
│       └── Local.java                    # Clase modelo para locales
└── test/java/org/palomafp/shein/
    ├── AppTest.java                      # Pruebas para la clase App
    └── ProductosDAOTest.java             # Pruebas para el DAO
```

## Requisitos del Sistema

- **Java**: Versión 21 o superior
- **Maven**: Para gestión de dependencias y construcción del proyecto
- **Sistema Operativo**: Compatible con Windows, macOS y Linux

## Instalación y Configuración

1. **Clonar el repositorio**:
   ```bash
   git clone <url-del-repositorio>
   cd shein
   ```

2. **Compilar el proyecto**:
   ```bash
   mvn clean compile
   ```

3. **Ejecutar la aplicación**:
   ```bash
   mvn exec:java -Dexec.mainClass="org.palomafp.shein.App"
   ```

4. **Ejecutar pruebas**:
   ```bash
   mvn test
   ```

## Uso

Al ejecutar la aplicación, se presenta un menú de consola con las siguientes opciones:

1. **Devolver un producto aleatorio**: Muestra un producto seleccionado aleatoriamente del catálogo.
2. **Devolver la lista de todos los productos**: Lista todos los productos disponibles.
3. **Devolver un producto por su código**: Permite buscar un producto específico introduciendo su código numérico.
4. **Salir del programa**: Finaliza la ejecución.

### Ejemplo de Salida

```
=== PRUEBA DE CLASES SHEIN ===
1. Devolver un producto aleatorio
2. Devolver la lista de todos los productos
3. Devolver un producto por su código
0. Salir del programa
Introduce una opción: 1

Producto{codigo=1001, talla='M', color='Rojo', precio='19.99€', material='Algodón', modelo=Modelo{nombre='Lucía', apellido='García', ...}, categoria=Categoria{tipo='Camisetas', genero=FEMENINO}, distribuidor=[Distribuidor{id='D001', ...}]}
```

## API del DAO

La clase `ProductosDAO` proporciona los siguientes métodos públicos:

- `Producto getProductoRandom()`: Devuelve un producto aleatorio de la lista.
- `List<Producto> getAllProductos()`: Devuelve la lista completa de productos.
- `Producto getProductoByCodigo(Integer codigo)`: Busca y devuelve un producto por su código.
- `List<Producto> clearAll()`: Limpia toda la lista de productos (útil para pruebas).

## Pruebas

El proyecto incluye un conjunto completo de pruebas unitarias desarrolladas con JUnit 5, que garantizan la calidad y funcionalidad del código. Para ejecutar las pruebas:

```bash
mvn test
```

### Cobertura de Pruebas

Las pruebas cubren los siguientes aspectos:

#### ProductosDAOTest.java
- **testInicializacionDAO**: Verifica la inicialización correcta del DAO y la existencia de productos.
- **getProductoRandomEmpty**: Prueba el comportamiento cuando la lista de productos está vacía.
- **getProductoRandom**: Valida que se devuelve un producto aleatorio válido con todos sus atributos.
- **getProductoByCodigoNull**: Comprueba el manejo de códigos nulos.
- **getProductoByCodigoReal**: Confirma la búsqueda exitosa de productos por código válido.
- **getProductoByCodigoInvalido**: Asegura que se devuelve null para códigos inexistentes.
- **getAllProductos**: Verifica que se obtiene la lista completa de productos.
- **clearAll**: Prueba la funcionalidad de limpiar la lista de productos.

#### AppTest.java
- **TestShein**: Verifica la inicialización básica de la aplicación.
- **TestProductoRandom**: Confirma que el DAO puede devolver un producto aleatorio.
- **TestProductoByCodigo**: Valida la búsqueda de productos por código.

En total, se incluyen 11 pruebas unitarias que cubren las funcionalidades críticas del sistema, incluyendo casos normales, casos límite y manejo de errores.

## Documentación

La documentación completa del proyecto, incluyendo Javadoc para todas las clases y métodos, se encuentra en la carpeta `doc/`. Esta documentación fue generada automáticamente utilizando GitHub Copilot.

Para acceder a la documentación:
- Abre `doc/index.html` en un navegador web.
- Navega por las clases, métodos y paquetes del proyecto.

## Dependencias

- **JUnit 5.11.0**: Framework de pruebas unitarias (solo en ámbito de test)

### Guías de Estilo

- Sigue las convenciones de código Java estándar.
- Añade documentación Javadoc a métodos públicos.
- Incluye pruebas unitarias para nuevas funcionalidades.

## Autores

- **Noelia Jorquera**
- **Samuel Pérez**