package controller;

import model.Pelicula;
import service.ArchivoService;

import java.util.ArrayList;
import java.util.List;

public class ContenidoController {

    private final List<Pelicula> peliculas;
    private final ArchivoService archivoService;

    public ContenidoController() {

        peliculas = new ArrayList<>();
        archivoService = new ArchivoService();
    }

    public void agregarPelicula(Pelicula pelicula) {

        peliculas.add(pelicula);
    }

    public void mostrarPeliculas() {

        for (Pelicula pelicula : peliculas) {

            pelicula.mostrarInformacion();
            System.out.println("----------------");
        }
    }

    public void guardarDatos(String archivo) {

        archivoService.guardarPeliculas(peliculas, archivo);
    }

    public void cargarDatos(String archivo) {

        peliculas.clear();
        peliculas.addAll(
                archivoService.leerPeliculas(archivo)
        );
    }
}