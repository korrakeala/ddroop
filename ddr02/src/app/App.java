package app;
//LISTO
public class App {

    public static void main(String[] args) throws Exception {


        Persona persona1 = new Persona("Mara", 25, 'f', 56, 1.75);
        Persona persona2 = new Persona("Ernesto", 42, 'M');
        Persona persona3 = new Persona();
        persona3.setNombre("Juana");
        persona3.setEdad(32);
        persona3.setSexo('F');
        persona3.setPeso(54.5);
        persona3.setAltura(1.67);
        
        PesoIdeal(persona1);
        PesoIdeal(persona2);
        PesoIdeal(persona3);

        MayorDeEdad(persona1);
        MayorDeEdad(persona2);
        MayorDeEdad(persona3);
    }

    public static String PesoIdeal(Persona persona){
        switch (persona.calcularIMC()) {
            case 1:
            System.out.println(persona + " tiene sobrepeso");
            break;
            case 0:
            System.out.println(persona + " esta en su peso ideal");
            break;
            case -1:
            System.out.println(persona + " esta por debajo de su peso ideal");
            break;
        }
        return null;
    }

    public static String MayorDeEdad(Persona persona){
        if (persona.esMayorDeEdad()) {
            System.out.println(persona + " es mayor de edad.");
        } else {
            System.out.println(persona + " es menor de edad.");
        }
        return null;
    }
}