#  Llanquihue Tour App

Sistema corporativo de gestión y reservas para la agencia **Llanquihue Tour**, desarrollado en **Java** bajo el paradigma de Programación Orientada a Objetos (POO). El repositorio refleja la evolución modular del sistema a través de las semanas de desarrollo.

---

##  Historial de Desarrollo y Evolución

### 🔹 Semana 7: Base del Sistema e Implementación de Colecciones
*   **Alcance:** Extensión funcional del sistema mediante colecciones dinámicas y polimorfismo.
*   **Arquitectura Inicial:**
    *   `model`: Súperclase `ServicioTuristico` y subclases con métodos sobrescritos.
    *   `data`: `GestorServicios` manejando colecciones genéricas (`List`).
    *   `ui`: Consola para visualización de servicios turísticos y especialidades.

###  Entrega Final: Consolidación, Persistencia y Validación Avanzada
Para la etapa de cierre, el sistema migró a una estructura empresarial definitiva bajo el paquete raíz `cl.duoc.llanquihuetour`, incorporando las siguientes características críticas:
*   **Validación de RUT:** Implementación del algoritmo matemático Módulo 11 en la clase `Rut` para verificar la autenticidad de la documentación chilena antes de la instanciación, con manejo de excepciones.
*   **Modelo de Negocio (POO Avanzado):** Jerarquía basada en la súperclase abstracta `Persona` y la subclase `Cliente`, integrando encapsulamiento y lógica de fidelización (acumulación de puntos por compra).
*   **Persistencia Local Real:** Creación de la capa `data` con la clase `LectorArchivo` para la lectura y escritura de boletas en disco (`ventas.txt`) mediante flujos con Buffer (`BufferedReader` y `BufferedWriter`).
*   **Interfaz de Contrato:** Uso de la interfaz `Registrable` para homogeneizar comportamientos.
*   **Menú Interactivo Robusto:** Menú de consola de 5 opciones en el paquete `app` con captura total de excepciones (`try-catch`) para evitar caídas del sistema ante entradas erróneas.

---

##  Estructura Definitiva del Proyecto (Entrega Final)

La arquitectura final se organiza en los siguientes paquetes bajo `src/cl/duoc/llanquihuetour/`:

*    **`app`**: Contiene la clase `Main` con el control del menú interactivo de consola.
*    **`data`**: Gestión de persistencia local y manejo de archivos (`LectorArchivo`).
*    **`model`**: Clases de negocio, herencia, lógica matemática y reglas comerciales (`Persona`, `Cliente`, `Producto`, `Rut`, `OrdenDeCompra`).
*    **`utils`**: Interfaces y contratos del sistema (`Registrable`).

---

##  Instrucciones de Ejecución (Entrega Final)

*   **Lenguaje:** Java 
*   **IDE Recomendada:** IntelliJ IDEA.

### Pasos para ejecutar:
1. Abrir el proyecto clonado en su IDE.
2. Navegar hasta el paquete principal de la entrega final: `src/cl/duoc/llanquihuetour/app/Main.java`.
3. Ejecutar el método `main` (Run) para iniciar el menú interactivo por consola.

---
*Proyecto consolidado y finalizado de manera individual por **Anthony Navarro**.*