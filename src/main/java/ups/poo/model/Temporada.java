package ups.poo.model;
public class Temporada {
 private final int numero; private final int anio;
 public Temporada(int numero,int anio){if(numero<1||anio<1888)throw new IllegalArgumentException("Temporada inválida");this.numero=numero;this.anio=anio;}
 public int getNumero(){return numero;}
 public int getAnio(){return anio;}
}
