package cl.duoc.llanquihuetour.model;

public class Cliente extends Persona {
    private String tipoCliente;
    private int puntosAcumulados = 0;

    public Cliente(String nombre, Rut rut, String correo, String tipoCliente) {
        super(nombre, rut, correo);
        this.tipoCliente = tipoCliente;
    }
    public void acumularPuntos(int pts) { this.puntosAcumulados += pts; }
    public int getPuntosAcumulados() { return puntosAcumulados; }

    @Override
    public void registrar() { System.out.println("[OK] Cliente registrado en memoria."); }
    @Override
    public String mostrarDatos() { return super.toString() + " | Tipo: " + tipoCliente + " | Pts: " + puntosAcumulados; }
}