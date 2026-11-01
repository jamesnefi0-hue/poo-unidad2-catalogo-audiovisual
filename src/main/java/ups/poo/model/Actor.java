package ups.poo.model;

public record Actor(String nombre, String nacionalidad) {
    public Actor {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre requerido");
    }
}
