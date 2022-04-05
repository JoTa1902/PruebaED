public class ListadoUsuarios {

    Usuario[] usuarios;

    Listado(){
        Usuario u1 = new Usuario("JoseMiguel","7472");
        Usuario u2 = new Usuario();
        Usuario[] usuarios = new Usuario[2];
        usuarios[0] = u1;
        usuarios[1] = u2;
    }
}
