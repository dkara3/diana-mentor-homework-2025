import java.util.Random;

public class Problem33MagicBall {
    public static void main(String[] args) {

        Random rand = new Random();

        int answer = rand.nextInt(0, 6);

        if (answer == 0) {
            System.out.println("Yes");
        }
        if (answer == 1) {
            System.out.println("No");
        }
        if (answer == 2) {
            System.out.println("Maybe");
        }
        if (answer == 3) {
            System.out.println("Soon");
        }
        if (answer == 4) {
            System.out.println("It's already happened");
        }
        if (answer == 5) {
            System.out.println("Not in this lifetime");
        }

    }
}
