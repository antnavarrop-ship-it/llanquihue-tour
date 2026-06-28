package model;

public class RutaGastronomica extends Tour {
    private int cantidadDegustaciones;

    public RutaGastronomica(String nombre, String tipo, int precio, int cantidadDegustaciones) {
        super(nombre, tipo, precio);
        this.cantidadDegustaciones = cantidadDegustaciones;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Especialidad: Ruta Gastronomica [Degustaciones: " + cantidadDegustaciones + "]";
    }
}