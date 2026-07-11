package ui;

import data.GestorServicios;
import model.*;
import javax.swing.JOptionPane;

public class PrincipalGUI {
    public static void main(String[] args) {
        GestorServicios gestor = new GestorServicios();

        String[] opciones = {"Agregar Guía", "Agregar Vehículo", "Agregar Colaborador", "Ver Todos los  Recursos", "Salir"};

        while (true) {
            int seleccion = JOptionPane.showOptionDialog(null,
                    "Seleccione una opción para gestionar los recursos:",
                    "Administración Llanquihue Tour - Semana 8",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null, opciones, opciones[0]);

            if (seleccion == 4 || seleccion == -1) {
                break;
            }

            switch (seleccion) {
                case 0:
                    String idG = JOptionPane.showInputDialog("Ingrese RUT/ID del Guía:");
                    String nomG = JOptionPane.showInputDialog("Ingrese Nombre Completo:");
                    String idio = JOptionPane.showInputDialog("Ingrese Idioma Principal:");
                    if (idG != null && nomG != null && idio != null) {
                        gestor.agregarRecurso(new Guia(idG, nomG, idio, null));
                    }
                    break;

                case 1:
                    String idV = JOptionPane.showInputDialog("Ingrese ID del Vehículo:");
                    String tipoV = JOptionPane.showInputDialog("Ingrese Tipo/Modelo:");
                    String pat = JOptionPane.showInputDialog("Ingrese Patente:");
                    if (idV != null && tipoV != null && pat != null) {
                        gestor.agregarRecurso(new Vehiculo(idV, tipoV, pat));
                    }
                    break;

                case 2:
                    String idC = JOptionPane.showInputDialog("Ingrese ID del Colaborador:");
                    String nomC = JOptionPane.showInputDialog("Ingrese Nombre del Contacto:");
                    String emp = JOptionPane.showInputDialog("Ingrese Empresa:");
                    if (idC != null && nomC != null && emp != null) {
                        gestor.agregarRecurso(new ColaboradorExterno(idC, nomC, emp));
                    }
                    break;

                case 3:
                    gestor.procesarYMostrarRecursos();
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, "Cerrando el sistema administrativo. ¡Hasta luego!");
    }
}