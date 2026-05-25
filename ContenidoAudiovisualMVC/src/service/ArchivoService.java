package service;

import model.Pelicula;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoService {

    public void guardarPeliculas(List<Pelicula> peliculas,
                                 String archivo) {

        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter(archivo))) {

            for (Pelicula pelicula : peliculas) {

                bw.write(pelicula.getTitulo() + "," +
                        pelicula.getAnio() + "," +
                        pelicula.getDirector());

                bw.newLine();
            }

        } catch (IOException e) {

            System.out.println("Error al guardar archivo.");
        }
    }

    public List<Pelicula> leerPeliculas(String archivo) {

        List<Pelicula> peliculas = new ArrayList<>();

        try (BufferedReader br =
                     new BufferedReader(new FileReader(archivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                Pelicula pelicula = new Pelicula(
                        datos[0],
                        Integer.parseInt(datos[1]),
                        datos[2]
                );

                peliculas.add(pelicula);
            }

        } catch (IOException e) {

            System.out.println("Error al leer archivo.");
        }

        return peliculas;
    }
}