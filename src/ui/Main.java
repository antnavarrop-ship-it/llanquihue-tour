package ui;

import data.GestorDatos;
import model.Tour;
import model.Guia;
import model.EmpresaOperadora;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorDatos gestor = new GestorDatos();
        String ruta = "src/resources/tours.txt";

        Scanner teclado = new Scanner(System.in);
        ArrayList<Tour> catalogoTours = new ArrayList<>();

        EmpresaOperadora operadorLocal = new EmpresaOperadora("Andes Lacustre S.A.", "76.998.432-1");
        Guia guiaAsignado = new Guia("Christian Müller", "Español/Alemán", operadorLocal);

        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n=========================================");
            System.out.println("      SISTEMA DE GESTIÓN LLANQUIHUE      ");
            System.out.println("=========================================");
            System.out.println("1. Cargar base de datos (.txt)");
            System.out.println("2. Desplegar catálogo completo");
            System.out.println("3. Filtrar experiencias Gastronómicas");
            System.out.println("4. Salir del sistema");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(teclado.nextLine());

                switch (opcion) {
                    case 1:
                        catalogoTours = gestor.cargarToursDesdeArchivo(ruta);
                        for (Tour t : catalogoTours) {
                            t.setGuia(guiaAsignado);
                        }
                        System.out.println("[OK] Registros cargados con éxito. Total: " + catalogoTours.size());
                        break;

                    case 2:
                        if (catalogoTours.isEmpty()) {
                            System.out.println("[!] Alerta: Debe cargar la base de datos antes de listar.");
                        } else {
                            System.out.println("\n--- LISTADO GENERAL DE TOURS ---");
                            for (Tour t : catalogoTours) {
                                System.out.println(t);
                            }
                        }
                        break;

                    case 3:
                        if (catalogoTours.isEmpty()) {
                            System.out.println("[!] Alerta: Debe cargar la base de datos antes de filtrar.");
                        } else {
                            System.out.println("\n--- TOURS FILTRADOS: GASTRONOMÍA ---");
                            boolean hallado = false;
                            for (Tour t : catalogoTours) {
                                if (t.getTipo().equalsIgnoreCase("Gastronómico")) {
                                    System.out.println(t);
                                    hallado = true;
                                }
                            }
                            if (!hallado) {
                                System.out.println("No se registran ofertas gastronómicas en el archivo.");
                            }
                        }
                        break;

                    case 4:
                        System.out.println("Finalizando servicios de LlanquihueTourApp...");
                        break;

                    default:
                        System.out.println("[!] Opción inválida. Ingrese un valor entre 1 y 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("[!] Error: Formato de entrada no válido. Use solo enteros.");
                opcion = 0;
            }
        }
        teclado.close();
    }
}