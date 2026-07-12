package model;

public abstract class RecursoAgencia extends ServicioTuristico {
    protected String id;

    public RecursoAgencia(String id, String nombre) {
        super(nombre, 0.0); // Pasamos el nombre al ServicioTuristico y precio 0.0
        this.id = id;
    }

    public String getId() { return id; }
}