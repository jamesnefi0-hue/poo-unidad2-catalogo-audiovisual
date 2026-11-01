package ups.poo.model;
public class VideoYouTube extends ContenidoAudiovisual {
 private final String canal;
 public VideoYouTube(String titulo,int anio,int duracion,String canal){super(titulo,anio,duracion);this.canal=canal;}
 @Override public String tipo(){return "Video YouTube";}
 @Override public String resumen(){return super.resumen()+" | canal: "+canal;}
}
