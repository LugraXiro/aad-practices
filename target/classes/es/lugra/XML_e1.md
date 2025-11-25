# Ejercicio: Catálogo de Productos con XML

## Objetivo
Crear un programa Java que gestione un catálogo de productos usando DocumentBuilder.

## Requisitos

### 1. Crear la clase `Producto`
La clase debe tener los siguientes atributos:
- `id` (String)
- `nombre` (String)
- `precio` (double)
- `stock` (int)
- `categoria` (String)

### 2. Implementar las siguientes funcionalidades

#### ✅ Crear y guardar catálogo
- Crear 4-5 productos
- Guardarlos en un archivo XML usando DocumentBuilder
- Usar Pretty Print para que sea legible

#### ✅ Leer y mostrar
- Leer el archivo XML
- Mostrar todos los productos por consola

#### ✅ Buscar productos
- Buscar productos por categoría
- Mostrar los resultados

## Ejemplo de XML esperado

```xml
<?xml version="1.0" encoding="UTF-8"?>
<catalogo>
    <producto id="P001">
        <nombre>Portátil Dell XPS</nombre>
        <precio>1299.99</precio>
        <stock>15</stock>
        <categoria>Informática</categoria>
    </producto>
    <producto id="P002">
        <nombre>Ratón Logitech</nombre>
        <precio>29.99</precio>
        <stock>50</stock>
        <categoria>Accesorios</categoria>
    </producto>
    <producto id="P003">
        <nombre>Monitor Samsung 27"</nombre>
        <precio>349.99</precio>
        <stock>8</stock>
        <categoria>Informática</categoria>
    </producto>
</catalogo>
```

## Notas adicionales
- El `id` debe ir como **atributo** del elemento `<producto>`
- Los demás datos van como **elementos hijos**
- Usar `getElementsByTagName()` para obtener productos
- Usar `getAttribute()` para obtener el id
- Manejar excepciones adecuadamente
- Cerrar todos los streams en el bloque `finally`

## ¿Por qué este ejercicio es realista?
Este tipo de estructura XML es muy común en:
- Ficheros de configuración
- Intercambio de datos entre sistemas
- Almacenamiento de catálogos simples
- Exportación de datos desde aplicaciones

## Pistas de implementación

### Para crear el XML:
1. Crear `DocumentBuilderFactory` y `DocumentBuilder`
2. Crear un nuevo `Document`
3. Crear el elemento raíz `<catalogo>`
4. Para cada producto:
   - Crear elemento `<producto>` con `createElement()`
   - Añadir atributo `id` con `setAttribute()`
   - Crear y añadir elementos hijos (nombre, precio, stock, categoria)
5. Usar `Transformer` para guardar con Pretty Print

### Para leer el XML:
1. Crear `DocumentBuilder` y parsear el archivo
2. Obtener el `Document`
3. Usar `getElementsByTagName("producto")` para obtener todos los productos
4. Recorrer el `NodeList` y extraer datos de cada producto

### Para buscar por categoría:
1. Obtener todos los productos
2. Para cada producto, obtener su elemento `<categoria>`
3. Comparar el texto con la categoría buscada
4. Mostrar los productos que coincidan