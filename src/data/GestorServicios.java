package data;

import model.ServicioTuristico;
import java.util.ArrayList;
import java.util.List;

public class GestorServicios {
    // Declaración de la colección polimórfica exigida por el Criterio 2
    private List<ServicioTuristico> listaServicios;

    public GestorServicios() {
        this.listaServicios = new ArrayList<>();
    }

    public List<ServicioTuristico> getListaServicios() {
        return listaServicios;
    }
}