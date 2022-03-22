import java.util.Scanner;




public class Main {
    public static void main(String[] args) {

        String pass = "1234";
        Scanner sc = new Scanner (System.in);
        String texto;

        do {
            System.out.println("Proyecto listo para GitHub");
            texto = sc.nextLine();
            System.out.println("He recibido "+texto);
        }while(!texto.equals(pass));

        System.out.println("Correcta");
    }
}
