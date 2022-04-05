import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        Usuario u1 = new Usuario("JoseMiguel","7472");
        Usuario u2 = new Usuario();
        Usuario[] usuarios = new Usuario[2];
        usuarios[0] = u1;
        usuarios[1] = u2;

        String user = u1.getNombre();
        String paswd = u1.getPass();

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
    private static boolean InitSesion(Usuario[] usuarios){
        Scanner sc = new Scanner (System.in);
        Usuario user;


        do {
            System.out.println("Introduce el nombre de Usuario: ");
            String nombre = sc.nextLine();
            user = searchUser(usuarios, nombre);
            if (user != null)
                System.out.println(nombre + " es un nombre correcto");
        } while (user == null);

        do {
            System.out.println("Introduce la contraseña: ");
            String finalPass = sc.nextLine();
            if (finalUser.finalpass)
        } while (cont < 3 || !texto.equals(paswd));

        return texto.equals(user);


    }

    private static Usuario searchUser(Usuario[] usuarios, String nomUser)
        for (Usuario u : usuarios) {
            if (u.nombreCorrecto(nomUser))
    }
}
