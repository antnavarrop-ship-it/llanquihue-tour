package data;

import model.ServicioTuristico;
import model.Tour;
import model.RutaGastronomica;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    // Cambiado a ArrayList<ServicioTuristico> para permitir el polimorfismo real
    public ArrayList<ServicioTuristico> cargarToursDesdeArchivo(String rutaArchivo) {
        ArrayList<ServicioTuristico> listaTours = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) {
                    continue;
                }

                String[] datos = linea.split(";");
                if (datos.length == 3) {
                    String nombre = datos[0].trim();
                    String tipo = datos[1].trim();
                    int precio = Integer.parseInt(datos[2].trim());

                    // Aplicamos polimorfismo sin romper los tipos de datos
                    if (tipo.equalsIgnoreCase("Gastronómico")) {
                        listaTours.add(new RutaGastronomica(nombre, precio, 3, "Cocina Marina"));
                    } else {
                        listaTours.add(new Tour(nombre, "General", precio));
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error en formato de numero: " + e.getMessage());
        }
        return listaTours;
    }
}