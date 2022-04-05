import java.io.InputStream;
import java.util.Scanner;

public class Usuario {

    private String nombre;
    private String pass;
    private int intentos = 3;

     Usuario(String nombre, String pass) {
        this.nombre = nombre;
        this.pass = pass;
    }

     Usuario() {
         System.out.println("Creando usuario...");
         Scanner sc = new Scanner (System.in);
         System.out.println("Introduce el nombre del usuario: ");
         this.nombre = sc.nextLine();
         System.out.println("Introduce la contraseña: ");
         this.pass = sc.nextLine();
         System.out.println("Usuario creado correctamente!");

    }
    public boolean nombreCorrecto(String nomUser) {
        return nomUser.contentEquals(nombre);
    }

    public boolean passCorrecta(String passUser) {
        if (passUser.contentEquals(pass)) {
            intentos = 3;
            return true;
        } else {
            intentos--;
            return false;
        }
    }

    public boolean quedanIntentos() {
        return intentos > 0;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + '\n' + "Pass: " + pass ;
    }
}
