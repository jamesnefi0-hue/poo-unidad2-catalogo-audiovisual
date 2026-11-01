package ups.poo.model;
public class Cortometraje extends ContenidoAudiovisual {
 private final String director;
 public Cortometraje(String titulo,int anio,int duracion,String director){super(titulo,anio,duracion);this.director=director;}
 @Override public String tipo(){return "Cortometraje";}
 @Override public String resumen(){return super.resumen()+" | dirección: "+director;}
}
