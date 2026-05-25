package model;

public class Documental extends ContenidoAudiovisual {

    private String tema;

    public Documental(String titulo, int anio, String tema) {
        super(titulo, anio);
        this.tema = tema;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("Documental: " + titulo);
        System.out.println("Tema: " + tema);
    }
}