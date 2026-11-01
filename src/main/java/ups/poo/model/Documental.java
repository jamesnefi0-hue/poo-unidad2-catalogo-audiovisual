package ups.poo.model;
import java.util.ArrayList;
import java.util.List;
public class Documental extends ContenidoAudiovisual {
 private final List<Investigador> investigadores=new ArrayList<>();
 public Documental(String titulo,int anio,int duracionMinutos){super(titulo,anio,duracionMinutos);}
 @Override public String tipo(){return "Documental";}
 public void agregarInvestigador(Investigador persona){if(persona!=null&&!investigadores.contains(persona))investigadores.add(persona);}
 public List<Investigador> getInvestigadores(){return List.copyOf(investigadores);}
 @Override public String resumen(){return super.resumen()+" | investigadores: "+investigadores.size();}
}
