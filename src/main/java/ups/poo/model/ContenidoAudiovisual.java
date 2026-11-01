package ups.poo.model;

public abstract class ContenidoAudiovisual {
    private final String titulo;
    private final int anio;
    private final int duracionMinutos;

    protected ContenidoAudiovisual(String titulo, int anio, int duracionMinutos) {
        if (titulo == null || titulo.isBlank() || anio < 1888 || duracionMinutos <= 0)
            throw new IllegalArgumentException("Datos audiovisuales inválidos");
        this.titulo = titulo; this.anio = anio; this.duracionMinutos = duracionMinutos;
    }
    public String getTitulo() { return titulo; }
    public int getAnio() { return anio; }
    public int getDuracionMinutos() { return duracionMinutos; }
    public abstract String tipo();
    public String resumen() { return tipo() + ": " + titulo + " (" + anio + "), " + duracionMinutos + " min"; }
}
