# 🧩 Katas del Patrón Compuesto

Este repositorio contiene ejercicios (katas) prácticos para aprender y aplicar el **Patrón de Diseño Compuesto (Composite Pattern)**. Este patrón permite tratar objetos individuales y composiciones de objetos de manera uniforme.

---

## 📁 Kata 1: Sistema de Archivos Básico

### 🧠 Problema
Crear un sistema de archivos donde tanto archivos como carpetas puedan ser tratados de forma uniforme. Cada archivo tiene un tamaño, y cada carpeta puede contener archivos y otras carpetas. El objetivo es calcular el tamaño total de una carpeta, incluyendo sus archivos y subcarpetas.

### 🛠️ Instrucciones
- Crear una interfaz `FileSystemComponent` con los métodos:
    - `getSize()`
    - `showDetails()`
- Implementar la clase `File` que representa un archivo con nombre y tamaño.
- Implementar la clase `Folder` que representa una carpeta y puede contener múltiples `FileSystemComponent` (archivos o carpetas).
- Crear una estructura de carpetas desde el cliente y calcular el tamaño total.

### ✅ Salida Esperada
```
Archivo: file1.txt, Tamaño: 10KB
Archivo: file2.txt, Tamaño: 20KB
Carpeta: folder1, Tamaño Total: 30KB
```
---

## 🍽️ Kata 2: Menú de Restaurante

### 🧠 Problema
Crear un sistema para representar un menú de restaurante donde se puedan incluir elementos individuales y submenús. Cada elemento tiene un nombre y un precio.

### 🛠️ Instrucciones
- Crear una interfaz `MenuComponent` con los métodos:
    - `getPrice()`
    - `showDetails()`
- Implementar la clase `MenuItem` que representa un elemento individual del menú.
- Implementar la clase `Menu` que representa un menú que contiene otros `MenuComponent`.
- Desde el cliente, construir un menú con submenús y calcular el precio total.

### ✅ Salida Esperada
```
Elemento: Pizza, Precio: 10
Elemento: Ensalada, Precio: 5
Menú: Almuerzo, Precio Total: 15 Bs.
```# kata-compositer
