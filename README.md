# LlanquihueTourApp - Semana 7

## Descripción
Extensión funcional del sistema de la agencia mediante la implementación de colecciones dinámicas y polimorfismo.

## Estructura de Paquetes
* `model`: Superclase ServicioTuristico y subclases con métodos sobrescritos.
* `data`: Gestor de servicios que maneja la colección genérica List.
* `ui`: Punto de entrada del programa para visualización en consola.

## Instrucciones de Ejecución
1. Clonar el repositorio.
2. Compilar desde la raíz con: `javac ui/Main.java data/GestorServicios.java model/*.java`
3. Ejecutar mediante: `java ui.Main`