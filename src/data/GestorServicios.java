package data;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class GestorServicios {
    private List<ServicioTuristico> listaServicios;

    public GestorServicios() {
        this.listaServicios = new ArrayList<>();
        cargarServiciosIniciales(); // Llamado automático al crearse
    }

    private void cargarServiciosIniciales() {
        // Al menos 5 objetos instanciados combinando las subclases
        listaServicios.add(new RutaGastronomica("Sabores de Frutillar", 45000, 4, "Repostería Alemana"));
        listaServicios.add(new PaseoLacustre("Navegación Catamarán Todos los Santos", 35000, "Catamarán", true));
        listaServicios.add(new ExcursionCultural("Iglesias de Chiloé", 60000, "Patrimonio de la Humanidad", true));
        listaServicios.add(new RutaGastronomica("Curanto en Angelmó", 25000, 2, "Cocina Marina"));
        listaServicios.add(new PaseoLacustre("Aventura Lago Llanquihue", 55000, "Lancha Rápida", false));
    }

    public List<ServicioTuristico> getListaServicios() {
        return listaServicios;
    }
}