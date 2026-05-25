package model;

public class Pelicula extends ContenidoAudiovisual {

    private String director;

    public Pelicula(String titulo, int anio, String director) {
        super(titulo, anio);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("Película: " + titulo);
        System.out.println("Año: " + anio);
        System.out.println("Director: " + director);
    }
}