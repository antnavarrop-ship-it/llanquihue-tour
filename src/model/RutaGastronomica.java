package model;

public class RutaGastronomica extends ServicioTuristico {
    private int cantidadParadas;
    private String tipoCocina;

    public RutaGastronomica(String nombreServicio, double precioBase, int cantidadParadas, String tipoCocina) {
        super(nombreServicio, precioBase);
        this.cantidadParadas = cantidadParadas;
        this.tipoCocina = tipoCocina;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al papá para que muestre Nombre y Precio
        System.out.println("Tipo: Ruta Gastronómica");
        System.out.println("Paradas turísticas: " + cantidadParadas);
        System.out.println("Especialidad de cocina: " + tipoCocina);
    }
}