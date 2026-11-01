package ups.poo.model;
import java.util.ArrayList;
import java.util.List;
public class Pelicula extends ContenidoAudiovisual {
 private final List<Actor> actores=new ArrayList<>();
 public Pelicula(String titulo,int anio,int duracionMinutos){super(titulo,anio,duracionMinutos);}
 @Override public String tipo(){return "Película";}
 public void agregarActor(Actor actor){if(actor!=null&&!actores.contains(actor))actores.add(actor);}
 public List<Actor> getActores(){return List.copyOf(actores);}
 @Override public String resumen(){return super.resumen()+" | actores: "+actores.size();}
}
