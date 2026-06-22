package model;

public class EmpresaOperadora {
    private String nombreEmpresa;
    private String rut;

    public EmpresaOperadora(String nombreEmpresa, String rut) {
        this.nombreEmpresa = nombreEmpresa;
        this.rut = rut;
    }

    public String getNombreEmpresa() { return nombreEmpresa; }
    public void setNombreEmpresa(String nombreEmpresa) { this.nombreEmpresa = nombreEmpresa; }

    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    @Override
    public String toString() {
        return nombreEmpresa + " (RUT: " + rut + ")";
    }
}