package model;

import javax.swing.JOptionPane;

public class ColaboradorExterno extends RecursoAgencia implements Registrable {
    private String empresa;

    public ColaboradorExterno(String id, String nombre, String empresa) {
        super(id, nombre);
        this.empresa = empresa;
    }

    @Override
    public void mostrarResumen() {
        JOptionPane.showMessageDialog(null,
                "[COLABORADOR EXTERNO]\nID: " + id + "\nContacto: " + getNombreServicio() + "\nEmpresa: " + empresa,
                "Llanquihue Tour - Registro", JOptionPane.INFORMATION_MESSAGE);
    }
}