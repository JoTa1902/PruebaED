import java.util.Scanner;

public class ListadoUsuarios {

    Usuario[] usuarios;

    void Listado(){
        Usuario u1 = new Usuario("JoseMiguel","7472");
        Usuario u2 = new Usuario();
        Usuario[] usuarios = new Usuario[2];
        usuarios[0] = u1;
        usuarios[1] = u2;
    }
    public boolean InitSesion(){
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
            String passUser = sc.nextLine();
            if (user.passCorrecta(passUser))
                return true;
        } while (user.quedanIntentos());

        return false;


    }

    private static Usuario searchUser(Usuario[] usuarios, String nomUser) {
        for (Usuario u : usuarios) {
            if (u.nombreCorrecto(nomUser))
                return u;

        }
        return null;
    }

}
