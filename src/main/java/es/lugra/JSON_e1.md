# Ejercicio: Gestión Básica de Libros con JSON

## Objetivo
Crear un programa Java que gestione libros usando GSON.

## Requisitos

### 1. Crear la clase `Libro`
La clase debe tener los siguientes atributos:
- `titulo` (String)
- `autor` (String)
- `año` (int)
- `generos` (List<String>)
- `disponible` (boolean)

### 2. Implementar las siguientes funcionalidades

#### ✅ Crear y guardar libros
- Crear 3-4 libros
- Guardarlos en un archivo JSON

#### ✅ Leer y mostrar
- Leer el archivo JSON
- Mostrar todos los libros por consola

#### ✅ Buscar libro
- Buscar un libro por título
- Mostrar el resultado de la búsqueda

### 3. Formato
- Usar **Pretty Print** para que el JSON sea legible

## Ejemplo de JSON esperado

```json
[
  {
    "titulo": "1984",
    "autor": "George Orwell",
    "año": 1949,
    "generos": ["Distopía", "Ciencia ficción"],
    "disponible": true
  },
  {
    "titulo": "Cien años de soledad",
    "autor": "Gabriel García Márquez",
    "año": 1967,
    "generos": ["Realismo mágico"],
    "disponible": true
  }
]
```

## Notas adicionales
- Utilizar la librería GSON de Google
- Manejar excepciones adecuadamente
- Asegurarse de cerrar los streams de lectura/escritura