package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Sala
 */
public class Sala {

    public List<Fila> Filas = new ArrayList<Fila>();

    public static Fila FilaAsientos(){

        Fila fila = new Fila();
        fila.Asientos = new ArrayList<Asiento>();

        for (int i = 1; i <= 8; i++) {
            Asiento a = new Asiento();
            a.numeroFila = i;

            fila.Asientos.add(a);

        }
        return fila;
    }
}