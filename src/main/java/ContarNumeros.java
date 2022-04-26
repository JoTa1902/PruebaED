import java.util.HashMap;
import java.util.Scanner;

public class ContarNumeros {
    public static void main(String[] args) {
        final int TAM = 10;
        Integer[] arrayNum = new Integer[TAM];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 10 números: ");

        for (int i = 0; i < TAM; i++)
            arrayNum[i] = sc.nextInt();

        System.out.println(NumRepetidos(arrayNum));


    }

    public static String NumRepetidos(Integer[] arrayNum) {

        if (arrayNum == null)
            return null;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : arrayNum) {
            if (map.containsKey(num)) {
                Integer value = map.get(num);
                value++;
                map.replace(num, value);
            } else {
                map.put(num, 1);
            }
        }
        return map.toString();
    }
}
