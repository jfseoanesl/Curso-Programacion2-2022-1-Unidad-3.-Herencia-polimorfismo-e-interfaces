package vista;
import modelo.*;

public class Main {
    public static void main(String[] args) {
        
        Person persona = new Person(123, "Jairo", "Seoanes", 25);
        System.out.println(persona.retornarDatos());
        
        Doctor doctor = new Doctor(123, "Jairo", "Seoanes", 25, "Cardiologo", "HEAD");
        System.out.println(doctor.retornarDatos());
        
        Teacher profesor = new Teacher(123, "Jairo", "Seoanes", 25, "Compute Science", "UPC");
        System.out.println(profesor.retornarDatos());
        
    }
}
