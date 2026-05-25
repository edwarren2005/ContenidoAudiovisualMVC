package view;

import controller.ContenidoController;
import model.Pelicula;

import java.util.Scanner;

public class ContenidoView {

    private final ContenidoController controller;
    private final Scanner scanner;

    public ContenidoView() {

        controller = new ContenidoController();
        scanner = new Scanner(System.in);
    }

    public void iniciar() {

        int opcion;

        do {

            System.out.println("===== MENÚ =====");
            System.out.println("1. Agregar película");
            System.out.println("2. Mostrar películas");
            System.out.println("3. Guardar datos");
            System.out.println("4. Cargar datos");
            System.out.println("5. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    agregarPelicula();
                    break;

                case 2:
                    controller.mostrarPeliculas();
                    break;

                case 3:
                    controller.guardarDatos("peliculas.csv");
                    break;

                case 4:
                    controller.cargarDatos("peliculas.csv");
                    break;
            }

        } while (opcion != 5);
    }

    private void agregarPelicula() {

        System.out.println("Título:");
        String titulo = scanner.nextLine();

        System.out.println("Año:");
        int anio = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Director:");
        String director = scanner.nextLine();

        Pelicula pelicula =
                new Pelicula(titulo, anio, director);

        controller.agregarPelicula(pelicula);
    }
}