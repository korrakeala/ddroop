package app;

/**
 * Electrodomestico
 */
public class Electrodomestico {

    private double precioBase;
    private String color; //blanco, negro, rojo, azul, gris
    private char consumoEner; //(letras entre A y F)
    private double pesoKg;

    public Electrodomestico() {
    this.precioBase = 100;
    this. color = "Blanco";
    this.consumoEner = 'F'; //(letras entre A y F)
    this.pesoKg = 5;
    }

    
}