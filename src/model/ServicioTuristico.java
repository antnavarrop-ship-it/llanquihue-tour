package model;

public class ServicioTuristico {
    private String nombreServicio;
    private double precioBase;

    public ServicioTuristico(String nombreServicio, double precioBase) {
        this.nombreServicio = nombreServicio;
        this.precioBase = precioBase;
    }

    public String getNombreServicio() { return nombreServicio; }
    public double getPrecioBase() { return precioBase; }

    public void mostrarInformacion() {
        System.out.println("Servicio: " + nombreServicio + " | Precio: $" + precioBase);
    }
}