package model;

public class Tour extends ServicioTuristico {
    private int precio;
    private Guia guia;

    public Tour(String nombre, String tipo, int precio) {
        super(nombre, tipo); // Pasa el nombre y tipo a la superclase ServicioTuristico
        this.precio = precio;
        this.guia = null;
    }

    // Mantenemos tus getters y setters intactos para que no falle nada
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getPrecio() { return precio; }
    public void setPrecio(int precio) { this.precio = precio; }

    public Guia getGuia() { return guia; }
    public void setGuia(Guia guia) { this.guia = guia; }

    @Override
    public String toString() {
        String datosGuia = (guia != null) ? guia.toString() : "Por asignar";
        // Usamos super.toString() para heredar la impresion base de la superclase
        return super.toString() + " | Valor: $" + precio + " | Operación: [" + datosGuia + "]";
    }
}