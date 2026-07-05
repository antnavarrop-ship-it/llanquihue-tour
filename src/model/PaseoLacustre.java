package model;

public class PaseoLacustre extends ServicioTuristico {
    private String tipoEmbarcacion;
    private boolean incluyeAlmuerzo;

    public PaseoLacustre(String nombreServicio, double precioBase, String tipoEmbarcacion, boolean incluyeAlmuerzo) {
        super(nombreServicio, precioBase);
        this.tipoEmbarcacion = tipoEmbarcacion;
        this.incluyeAlmuerzo = incluyeAlmuerzo;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Paseo Lacustre");
        System.out.println("Embarcación: " + tipoEmbarcacion);
        System.out.println("¿Incluye Almuerzo?: " + (incluyeAlmuerzo ? "Sí" : "No"));
    }
}