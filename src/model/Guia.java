package model;

public class Guia {
    private String nombreGuia;
    private String idioma;
    private EmpresaOperadora empresa;

    public Guia(String nombreGuia, String idioma, EmpresaOperadora empresa) {
        this.nombreGuia = nombreGuia;
        this.idioma = idioma;
        this.empresa = empresa;
    }

    public String getNombreGuia() { return nombreGuia; }
    public void setNombreGuia(String nombreGuia) { this.nombreGuia = nombreGuia; }

    public String getIdioma() { return idioma; }
    public void setIdioma(String idioma) { this.idioma = idioma; }

    public EmpresaOperadora getEmpresa() { return empresa; }
    public void setEmpresa(EmpresaOperadora empresa) { this.empresa = empresa; }

    @Override
    public String toString() {
        return nombreGuia + " (Idioma: " + idioma + ") - Operador: " + empresa.getNombreEmpresa();
    }
}