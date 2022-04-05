import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        Usuario u1 = new Usuario("JoseMiguel","7472");
        Usuario u2 = new Usuario();
        Usuario[] usuarios = new Usuario[2];
        usuarios[0] = u1;
        usuarios[1] = u2;

        if (InitSesion(usuarios))
            System.out.println("Usuario logueado!");
        else
            System.out.println("Alerta HackerMan!");




        // Pedir inicair sesion a un usuario
        // Primero comprobar nombre
        // Si es correcto, pedir pass
        // Si no, preguntar nombre de nuevo
        // Si la pass es correcta "usuario logueado!"
        // Si no preguntar pass hasta 2 veces mas
        // Si supera los intentos "alerta hacker"
    }
