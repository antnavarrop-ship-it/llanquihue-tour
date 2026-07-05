package model;

public class ExcursionCultural extends ServicioTuristico {
    private String sitioHistorico;
    private boolean incluyeGuia;

    public ExcursionCultural(String nombreServicio, double precioBase, String sitioHistorico, boolean incluyeGuia) {
        super(nombreServicio, precioBase);
        this.sitioHistorico = sitioHistorico;
        this.incluyeGuia = incluyeGuia;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // ¡Con un solo 'super' para que funcione impecable!
        System.out.println("Tipo: Excursión Cultural");
        System.out.println("Sitio Histórico: " + sitioHistorico);
        System.out.println("¿Incluye Guía?: " + (incluyeGuia ? "Sí" : "No"));
    }
}