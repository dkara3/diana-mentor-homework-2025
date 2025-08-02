import java.util.Random;

public class Problem4CandyJarGuess {
    public static void main(String[] args) {

        Random rand = new Random();

        int candy = rand.nextInt(10, 31);

        if (candy <= 20) {
            System.out.println("Light Snack.");
        } else {
            System.out.println("Sugar Rush!");
        }

    }
}
