# Catálogo audiovisual — Unidad 2 POO

Proyecto Java de consola para practicar herencia, asociación, composición y polimorfismo.

## Requisitos
- JDK 17 o posterior.
- Eclipse IDE con soporte Java.

## Importar y ejecutar
1. Clona este repositorio.
2. En Eclipse, elige File > Import > Existing Projects into Workspace y selecciona la carpeta.
3. Configura JDK 17 o posterior.
4. Ejecuta ups.poo.app.CatalogoApp.

Terminal: javac -d out $(find src/main/java -name '*.java') y java -cp out ups.poo.app.CatalogoApp.

## Funcionalidad
- Actor asociado con Pelicula; Investigador asociado con Documental.
- Temporada compuesta por SerieDeTV.
- VideoYouTube y Cortometraje heredan de ContenidoAudiovisual.
- Menú para registrar y consultar contenidos mediante polimorfismo.

## Relaciones
Las temporadas pertenecen a la serie que las crea; actores e investigadores pueden participar en varias obras.

## Diagrama UML
El diagrama completo se encuentra en docs/diagrama_clases.png.

## Verificación
Compila con JDK 17 o posterior. Se verificó compilación con JDK 26.0.1 y ejecución del menú de consola.
