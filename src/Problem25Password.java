import java.util.Random;

public class Problem25Password {
    public static void main(String[] args) {

        Random rand = new Random();

        int ascii = rand.nextInt(97, 123);

        char letter1 = (char) rand.nextInt(97, 123);
        char letter2 = (char) rand.nextInt(97, 123);
        char letter3 = (char) rand.nextInt(97, 123);

        System.out.println("" + letter1 + letter2 + letter3);

    }
}
