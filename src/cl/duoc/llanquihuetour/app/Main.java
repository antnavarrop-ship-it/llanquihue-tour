package cl.duoc.llanquihuetour.app;

import cl.duoc.llanquihuetour.data.LectorArchivo;
import cl.duoc.llanquihuetour.model.*;
import java.util.*;

public class Main {
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Producto> tours = new ArrayList<>();
    private static final String FILE = "ventas.txt";

    public static void main(String[] args) {
        // Inicializamos un par de tours de prueba
        tours.add(new Producto(1, "Tour Saltos del Petrohue", 35000));
        tours.add(new Producto(2, "Vuelta Lago Llanquihue", 50000));

        Scanner sc = new Scanner(System.in);
        int opt = 0;
        do {
            System.out.println("\n--- MENU LLANQUIHUE TOUR ---");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Listar Tours Disponibles");
            System.out.println("3. Reservar Tour (Generar Boleta)");
            System.out.println("4. Ver Historial Completo (Archivo TXT)");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            try {
                opt = Integer.parseInt(sc.nextLine());
                if (opt == 1) {
                    System.out.print("Nombre: "); String n = sc.nextLine();
                    System.out.print("Rut (sin puntos ni dv, ej: 12345678): "); int r = Integer.parseInt(sc.nextLine());
                    System.out.print("DV (ej: 9 o K): "); char dv = sc.nextLine().charAt(0);
                    System.out.print("Correo: "); String c = sc.nextLine();

                    // Aquí el constructor de Rut validará automáticamente el RUT chileno
                    clientes.add(new Cliente(n, new Rut(r, dv), c, "Nacional"));
                    System.out.println("[OK] Cliente guardado exitosamente en memoria.");

                } else if (opt == 2) {
                    System.out.println("\n--- TOURS DISPONIBLES ---");
                    for(Producto p : tours) System.out.println(p);

                } else if (opt == 3) {
                    if (clientes.isEmpty()) {
                        System.out.println("[!] Debe registrar al menos un cliente primero.");
                        continue;
                    }
                    // Usamos el último cliente registrado para la compra rápida
                    Cliente cli = clientes.get(clientes.size() - 1);
                    OrdenDeCompra ord = new OrdenDeCompra(cli);

                    System.out.print("Ingrese el ID del Tour a comprar (1 o 2): ");
                    int id = Integer.parseInt(sc.nextLine());

                    if (id == 1) ord.agregarProducto(tours.get(0));
                    else if (id == 2) ord.agregarProducto(tours.get(1));
                    else { System.out.println("[!] ID de tour inválido."); continue; }

                    String txtBoleta = ord.generarBoleta();
                    System.out.println(txtBoleta);

                    // Guardamos la boleta de forma real en el disco duro
                    LectorArchivo.guardar(FILE, txtBoleta);
                    System.out.println("[SISTEMA] Boleta respaldada en " + FILE);

                } else if (opt == 4) {
                    System.out.println("\n--- LEYENDO HISTORIAL DESDE VENTAS.TXT ---");
                    List<String> lineas = LectorArchivo.leer(FILE);
                    if(lineas.isEmpty()) System.out.println("El archivo está vacío o no se ha creado aún.");
                    for(String s : lineas) System.out.println(s);

                } else if (opt == 5) {
                    System.out.println("Saliendo del sistema... ¡Buen viaje!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("[ERROR VALIDACIÓN] " + e.getMessage());
            } catch (Exception e) {
                System.out.println("[ERROR] Entrada inválida o datos erróneos. Intente de nuevo.");
            }
        } while (opt != 5);
    }
}