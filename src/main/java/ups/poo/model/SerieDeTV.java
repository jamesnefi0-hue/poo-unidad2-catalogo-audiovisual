package ups.poo.model;
import java.util.ArrayList;
import java.util.List;
public class SerieDeTV extends ContenidoAudiovisual {
 private final List<Temporada> temporadas=new ArrayList<>();
 public SerieDeTV(String titulo,int anio,int duracionMinutos){super(titulo,anio,duracionMinutos);}
 @Override public String tipo(){return "Serie de TV";}
 public void agregarTemporada(int numero,int anio){temporadas.add(new Temporada(numero,anio));}
 public List<Temporada> getTemporadas(){return List.copyOf(temporadas);}
 @Override public String resumen(){return super.resumen()+" | temporadas: "+temporadas.size();}
}
