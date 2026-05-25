import model.Pelicula;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeliculaTest {

    @Test
    public void pruebaTituloPelicula() {

        Pelicula pelicula =
                new Pelicula("Interestelar",
                        2014,
                        "Christopher Nolan");

        assertEquals(
                "Interestelar",
                pelicula.getTitulo()
        );
    }
}