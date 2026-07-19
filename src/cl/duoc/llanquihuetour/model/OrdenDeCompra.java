package cl.duoc.llanquihuetour.model;
import java.util.ArrayList;
import java.util.List;

public class OrdenDeCompra {
    private static int conId = 1;
    private int idOrden = conId++;
    private Cliente cliente;
    private List<Producto> productos = new ArrayList<>();

    public OrdenDeCompra(Cliente cliente) { this.cliente = cliente; }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
        this.cliente.acumularPuntos(15); // Regla del negocio: +15 puntos por compra
    }

    public double calcularTotal() {
        double neto = 0;
        for (Producto p : productos) neto += p.getPrecio();
        return neto * 1.19; // Aplica el 19% de IVA directamente al total
    }

    public String generarBoleta() {
        StringBuilder sb = new StringBuilder("\n=== BOLETA N° " + idOrden + " ===\n");
        sb.append("Cliente: ").append(cliente.getNombre()).append("\n");
        for (Producto p : productos) sb.append("- ").append(p.getNombreTour()).append("\n");
        sb.append("TOTAL (IVA Incluido): $").append(calcularTotal()).append("\n====================\n");
        return sb.toString();
    }
}