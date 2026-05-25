package model;

public class SerieTV extends ContenidoAudiovisual {

    private int temporadas;

    public SerieTV(String titulo, int anio, int temporadas) {
        super(titulo, anio);
        this.temporadas = temporadas;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("Serie: " + titulo);
        System.out.println("Temporadas: " + temporadas);
    }
}