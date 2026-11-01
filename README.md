# Catálogo audiovisual — Unidad 2 POO

Proyecto Java de consola que practica herencia, asociación, composición y polimorfismo.

## Requisitos
- JDK 17 o posterior.
- Eclipse IDE con soporte Java.

## Importar y ejecutar
1. Clona este repositorio.
2. En Eclipse, usa File > Import > Existing Projects into Workspace y selecciona la carpeta.
3. Configura JDK 17 o posterior.
4. Ejecuta ups.poo.app.CatalogoApp.

Desde terminal: javac -d out $(find src/main/java -name '*.java') y java -cp out ups.poo.app.CatalogoApp.

## Funcionalidad y relaciones
- Actor se asocia con Pelicula; Investigador se asocia con Documental.
- SerieDeTV compone sus objetos Temporada.
- VideoYouTube y Cortometraje heredan de ContenidoAudiovisual.
- El menú permite registrar obras, añadir participantes y temporadas y consultar el catálogo mediante polimorfismo.

## Diagrama UML
Consulta docs/diagrama_clases.svg.

## Verificación
Compilado con JDK 26.0.1 sin errores; se ejecutó el menú y se comprobaron los resúmenes de ambas subclases.

## Historial
El repositorio contiene más de tres commits con cambios separados para el modelo, las relaciones, las subclases y la aplicación.

Repositorio: https://github.com/jamesnefi0-hue/poo-unidad2-catalogo-audiovisual
