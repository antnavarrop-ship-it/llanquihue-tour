package model;

public class Tour {
    private String nombre;
    private String tipo;
    private int precio;
    private Guia guia;

    public Tour(String nombre, String tipo, int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.guia = null;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getPrecio() { return precio; }
    public void setPrecio(int precio) { this.precio = precio; }

    public Guia getGuia() { return guia; }
    public void setGuia(Guia guia) { this.guia = guia; }

    @Override
    public String toString() {
        String datosGuia = (guia != null) ? guia.toString() : "Por asignar";
        return "Tour: " + nombre + " | Categoría: " + tipo + " | Valor: $" + precio + " | Operación: [" + datosGuia + "]";
    }
}