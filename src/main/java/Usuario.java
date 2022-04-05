import java.io.InputStream;
import java.util.Scanner;

public class Usuario {

    private String nombre;
    private String pass;

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
        return nombreCandidato.contentEquals(nombre);
    }

    public boolean passCorrecta(String pasCandidata) {
        if (pasCandidata.contentEquals(pass)) {
            intentosRestantes = 3;
            return true;
        } else {
            intentosRestantes--;
            return false;
        }
    }

    public boolean quedanIntentos(){
        return intentosRestantes > 0;

    @Override
    public String toString() {
        return "Nombre: " + nombre + '\n' + "Pass: " + pass ;
    }
}
