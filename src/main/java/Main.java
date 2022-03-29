import java.io.InputStream;
import java.util.Scanner;
import java.io.ByteArrayInputStream;



public class Main {
    public static void main(String[] args) {

        String pass = "1234";
        String fakeInput = "1111\n2222\n1234";

        InputStream inputStream = new ByteArrayInputStream(fakeInput.getBytes());
        //Scanner sc = new Scanner (System.in);
        Scanner sc = new Scanner (inputStream);

        if (compPass(sc, pass))
            System.out.println("Has acertado la contraseña");
        else
            System.out.println("No has acertado la contraseña");



    }


    private static boolean compPass(Scanner sc, String pass) {
        String texto;

        do {
            System.out.println("Proyecto listo para GitHub");
            texto = sc.nextLine();
            System.out.println("He recibido " + texto);
        }while(!texto.equals(pass) && sc.hasNext());

        return texto.equals(pass);

    }

}
