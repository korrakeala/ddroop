package app;

/**
 * Persona
 */
public class Persona {

    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        double peso = this.peso;
        double altura = this.altura;
        double imc = peso / Math.pow(altura, 2);

        if (imc < 20) {
            return -1;
        }
        if (imc > 25) {
            return 1;
        }
        return 0;
    }

    public boolean esMayorDeEdad() {
        int edad = this.edad;
        if (edad > 18) {
            return true;
        }
        return false;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona [altura=" + altura + ", edad=" + edad + ", nombre=" + nombre + ", peso=" + peso + ", sexo="
                + sexo + "]";
    }

    // generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de
    // este su número su letra correspondiente. Este método sera invocado cuando
    // se construya el objeto. Puedes dividir el método para que te sea más fácil.
    // No será visible al exterior.

}