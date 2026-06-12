package ui;

import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GestorDatos gestor = new GestorDatos();
        String ruta = "src/resources/tours.txt";

        ArrayList<Tour> catalogoTours = gestor.cargarToursDesdeArchivo(ruta);

        System.out.println("=== TODOS LOS TOURS (RECORRIDO) ===");
        for (Tour t : catalogoTours) {
            System.out.println(t);
        }

        System.out.println("\n=== TOURS FILTRADOS (GASTRONÓMICO) ===");
        for (Tour t : catalogoTours) {
            if (t.getTipo().equalsIgnoreCase("Gastronómico")) {
                System.out.println(t);
            }
        }
    }
}