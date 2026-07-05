package ui;

import data.GestorServicios;
import model.ServicioTuristico;

public class Main {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("    SISTEMA DE GESTIÓN LLANQUIHUE TOUR - S7       ");
        System.out.println("=================================================\n");

        GestorServicios gestor = new GestorServicios();

        // Recorrido polimórfico limpio sin usar instanceof
        for (ServicioTuristico servicio : gestor.getListaServicios()) {
            servicio.mostrarInformacion();
        }

        System.out.println("\n=================================================");
    }
}