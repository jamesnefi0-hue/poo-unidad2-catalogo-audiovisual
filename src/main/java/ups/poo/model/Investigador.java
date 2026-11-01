package ups.poo.model;
public record Investigador(String nombre,String institucion){
 public Investigador{if(nombre==null||nombre.isBlank())throw new IllegalArgumentException("Nombre requerido");}
}
