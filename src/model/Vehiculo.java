package model;

import javax.swing.JOptionPane;

public class Vehiculo extends RecursoAgencia implements Registrable {
    private String patente;

    public Vehiculo(String id, String nombre, String patente) {
        super(id, nombre);
        this.patente = patente;
    }

    @Override
    public void mostrarResumen() {
        JOptionPane.showMessageDialog(null,
                "[VEHÍCULO AGENCIA]\nID: " + id + "\nTipo: " + getNombreServicio() + "\nPatente: " + patente,
                "Llanquihue Tour - Registro", JOptionPane.INFORMATION_MESSAGE);
    }
}