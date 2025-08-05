import java.util.Random;

public class Problem27NumberGuess {
    public static void main(String[] args) {

        Random rand = new Random();

        int secret = rand.nextInt(0, 10) + 1;

        int guess = 3;

        if (secret == guess) {
            System.out.println("Nailed it!");
        }  else {
            System.out.println("Nope, work on your intuition some more.");
        }

    }
}
