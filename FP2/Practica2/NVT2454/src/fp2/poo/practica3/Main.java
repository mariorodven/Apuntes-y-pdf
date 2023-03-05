package fp2.poo.practica3;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Usuario("Mister", "Jagger", "69696969A");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellidos: " + persona.getApellidos());
        System.out.println("DNI: " + persona.getDni());
    }
}

