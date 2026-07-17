package cl.duoc.llanquihuetour.model;

public class Producto {
    private int id;
    private String nombreTour;
    private double precio;

    public Producto(int id, String nombreTour, double precio) {
        this.id = id;
        this.nombreTour = nombreTour;
        this.precio = precio;
    }
    public int getId() { return id; }
    public String getNombreTour() { return nombreTour; }
    public double getPrecio() { return precio; }

    @Override
    public String toString() { return "[" + id + "] " + nombreTour + " ($" + precio + ")"; }
}