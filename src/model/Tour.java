package model;

public class Tour extends ServicioTuristico {
    private int precio;
    private Guia guia;

    public Tour(String nombre, String tipo, int precio) {
        super(nombre, 0.0);
        this.precio = precio;
        this.guia = null;
    }

    public String getNombre() { return getNombreServicio(); }
    public void setNombre(String nombre) { /* Mantenido por compatibilidad */ }

    public String getTipo() { return "Tour General"; }
    public void setTipo(String tipo) { /* Mantenido por compatibilidad */ }

    public int getPrecio() { return precio; }
    public void setPrecio(int precio) { this.precio = precio; }

    public Guia getGuia() { return guia; }
    public void setGuia(Guia guia) { this.guia = guia; }

    @Override
    public String toString() {
        String datosGuia = (guia != null) ? guia.toString() : "Por asignar";
        return getNombreServicio() + " | Valor: $" + precio + " | Operación: [" + datosGuia + "]";
    }
}