package model;

import javax.swing.JOptionPane;

public class Guia extends RecursoAgencia implements Registrable {
    private String idioma;
    private EmpresaOperadora empresa;

    public Guia(String id, String nombreGuia, String idioma, EmpresaOperadora empresa) {
        super(id, nombreGuia);
        this.idioma = idioma;
        this.empresa = empresa;
    }

    @Override
    public void mostrarResumen() {
        JOptionPane.showMessageDialog(null,
                "[GUÍA INTERNO]\nID: " + id + "\nNombre: " + nombre + "\nIdioma: " + idioma + "\nEmpresa: " + (empresa != null ? empresa.getNombre() : "No asignada"),
                "Llanquihue Tour - Registro", JOptionPane.INFORMATION_MESSAGE);
    }
}