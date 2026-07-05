package model;

public abstract class ServicioTuristico {
    private String nombreServicio;
    private double precioBase;

    public ServicioTuristico(String nombreServicio, double precioBase) {
        this.nombreServicio = nombreServicio;
        this.precioBase = precioBase;
    }

    public String getNombreServicio() { return nombreServicio; }
    public double getPrecioBase() { return precioBase; }

    // Este es el método base que heredarán todos los hijos
    public void mostrarInformacion() {
        System.out.println("===================================");
        System.out.println("Servicio: " + nombreServicio);
        System.out.println("Precio Base: $" + precioBase);
    }
}