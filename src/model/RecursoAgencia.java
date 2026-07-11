package model;

public abstract class RecursoAgencia {
    protected String id;
    protected String nombre;

    public RecursoAgencia(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
}