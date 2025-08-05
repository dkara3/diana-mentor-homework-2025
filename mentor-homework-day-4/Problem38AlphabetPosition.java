import java.util.Random;

public class Problem38AlphabetPosition {
    public static void main(String[] args) {

        Random rand = new Random();

        char letter1 = (char) rand.nextInt(97, 123);
        int pos = letter1 - 'a' + 1;

        System.out.println("" + letter1 + " -> " + pos);

    }
}
