package cl.duoc.llanquihuetour.model;
import cl.duoc.llanquihuetour.utils.Registrable;

public abstract class Persona implements Registrable {
    private String nombre;
    private Rut rut;
    private String correo;

    public Persona(String nombre, Rut rut, String correo) {
        this.nombre = nombre;
        this.rut = rut;
        this.correo = correo;
    }
    public String getNombre() { return nombre; }
    public Rut getRut() { return rut; }
    public String getCorreo() { return correo; }

    @Override
    public String toString() { return "Nombre: " + nombre + " | RUT: " + rut; }
}