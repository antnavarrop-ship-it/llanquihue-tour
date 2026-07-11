package data;

import model.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GestorServicios {
    private List<ServicioTuristico> listaServicios;
    private List<Registrable> listaRecursos;

    public GestorServicios() {
        this.listaServicios = new ArrayList<>();
        this.listaRecursos = new ArrayList<>();
        cargarServiciosIniciales();
    }

    private void cargarServiciosIniciales() {
        listaServicios.add(new RutaGastronomica("Sabores de Frutillar", 45000, 4, "Repostería Alemana"));
        listaServicios.add(new PaseoLacustre("Navegación Catamarán Todos los Santos", 35000, "Catamarán", true));
        listaServicios.add(new ExcursionCultural("Iglesias de Chiloé", 60000, "Patrimonio de la Humanidad", true));
        listaServicios.add(new RutaGastronomica("Curanto en Angelmó", 25000, 2, "Cocina Marina"));
        listaServicios.add(new PaseoLacustre("Aventura Lago Llanquihue", 55000, "Lancha Rápida", false));
    }

    public void agregarRecurso(Registrable recurso) {
        listaRecursos.add(recurso);
    }

    public void procesarYMostrarRecursos() {
        if (listaRecursos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay recursos registrados en el sistema.", "Sistema vacío", JOptionPane.WARNING_MESSAGE);
            return;
        }

        for (Registrable r : listaRecursos) {
            if (r instanceof Guia) {
                System.out.println("[LOG CONSOLA] Identificado: Recurso Humano Interno (Guia).");
            } else if (r instanceof Vehiculo) {
                System.out.println("[LOG CONSOLA] Identificado: Recurso Logistico (Vehiculo).");
            } else if (r instanceof ColaboradorExterno) {
                System.out.println("[LOG CONSOLA] Identificado: Recurso Externo / Outsourcing.");
            }

            r.mostrarResumen();
        }
    }

    public List<ServicioTuristico> getListaServicios() {
        return listaServicios;
    }
}