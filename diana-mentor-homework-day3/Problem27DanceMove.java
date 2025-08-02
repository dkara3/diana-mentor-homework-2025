import java.util.Random;

public class Problem27DanceMove {
    public static void main(String[] args) {

        Random rand = new Random();

        int move = rand.nextInt(0, 6);
        boolean repetition = rand.nextBoolean();

        if (move == 0) {
            System.out.println("Khertsi");
            if (repetition == true) {
                System.out.println("Khertsi");
            }
        } else if (move == 1) {
            System.out.println("Zspanak");
            if (repetition == true) {
                System.out.println("Zspanak");
            }
        } else if (move == 2) {
            System.out.println("Yarxhushta");
            if (repetition == true) {
                System.out.println("Yarxhushta");
            }
        } else if (move == 3) {
            System.out.println("Paburi");
            if (repetition == true) {
                System.out.println("Paburi");
            }
        } else if (move == 4) {
            System.out.println("Bert");
            if (repetition == true) {
                System.out.println("Bert");
            }
        } else if (move == 5) {
            System.out.println("Shalaxoh");
            if (repetition == true) {
                System.out.println("Shalaxoh");
            }
        }

    }
}
