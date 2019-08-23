package app;

import java.util.ArrayList;
import java.util.List;

public class Cine {

    public Pelicula pelicula;
    public double precioEntrada;
    public List<Espectador> Espectadores = new ArrayList<Espectador>();

    public Cine(Pelicula pelicula, double precioEntrada) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
    }

    
    
}