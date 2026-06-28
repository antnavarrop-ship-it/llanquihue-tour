package data;

import model.Tour;
import model.RutaGastronomica; // Importamos la nueva subclase
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    public ArrayList<Tour> cargarToursDesdeArchivo(String rutaArchivo) {
        ArrayList<Tour> listaTours = new ArrayList<>();

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

                    // Aplicamos polimorfismo: Si es gastronomico instanciamos la subclase especializada
                    if (tipo.equalsIgnoreCase("Gastronómico")) {
                        listaTours.add(new RutaGastronomica(nombre, tipo, precio, 3));
                    } else {
                        listaTours.add(new Tour(nombre, tipo, precio));
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