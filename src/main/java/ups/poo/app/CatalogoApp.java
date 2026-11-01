package ups.poo.app;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ups.poo.model.*;
public class CatalogoApp {
 private final List<ContenidoAudiovisual> catalogo=new ArrayList<>();
 public static void main(String[] args){new CatalogoApp().ejecutar();}
 private void ejecutar(){try(Scanner in=new Scanner(System.in)){boolean seguir=true;while(seguir){System.out.println("\nCATÁLOGO AUDIOVISUAL\n1. Registrar película\n2. Registrar serie\n3. Registrar documental\n4. Añadir ejemplos de subclases\n5. Mostrar catálogo\n0. Salir");switch(leerEntero(in,"Opción: ")){case 1->registrarPelicula(in);case 2->registrarSerie(in);case 3->registrarDocumental(in);case 4->ejemplos();case 5->mostrar();case 0->seguir=false;default->System.out.println("Opción no válida.");}}}}
 private void registrarPelicula(Scanner in){Pelicula p=new Pelicula(leerTexto(in,"Título: "),leerEntero(in,"Año: "),leerEntero(in,"Duración en minutos: "));p.agregarActor(new Actor(leerTexto(in,"Nombre de actor: "),leerTexto(in,"Nacionalidad: ")));catalogo.add(p);System.out.println("Película registrada.");}
 private void registrarSerie(Scanner in){SerieDeTV s=new SerieDeTV(leerTexto(in,"Título: "),leerEntero(in,"Año: "),leerEntero(in,"Duración promedio por episodio: "));s.agregarTemporada(leerEntero(in,"Número de temporada: "),leerEntero(in,"Año de temporada: "));catalogo.add(s);System.out.println("Serie registrada.");}
 private void registrarDocumental(Scanner in){Documental d=new Documental(leerTexto(in,"Título: "),leerEntero(in,"Año: "),leerEntero(in,"Duración en minutos: "));d.agregarInvestigador(new Investigador(leerTexto(in,"Nombre de investigador: "),leerTexto(in,"Institución: ")));catalogo.add(d);System.out.println("Documental registrado.");}
 private void ejemplos(){catalogo.add(new VideoYouTube("Introducción a la POO",2025,12,"Aula Abierta"));catalogo.add(new Cortometraje("Un día de lluvia",2024,9,"Equipo UPS"));System.out.println("Subclases de ejemplo agregadas.");}
 private void mostrar(){if(catalogo.isEmpty()){System.out.println("El catálogo está vacío.");return;}catalogo.forEach(item->System.out.println(item.resumen()));}
 private static String leerTexto(Scanner in,String prompt){System.out.print(prompt);return in.nextLine().trim();}
 private static int leerEntero(Scanner in,String prompt){while(true){System.out.print(prompt);try{return Integer.parseInt(in.nextLine().trim());}catch(NumberFormatException ex){System.out.println("Ingresa un número entero.");}}}
}
