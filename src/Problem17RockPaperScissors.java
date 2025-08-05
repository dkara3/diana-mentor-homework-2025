import java.util.Random;

public class Problem17RockPaperScissors {
    public static void main(String[] args) {

        Random rand = new Random();

        int move = rand.nextInt(0, 3);

        switch (move) {
            case 0:
                System.out.println("Rock");
                break;
            case 1:
                System.out.println("Paper");
                break;
            case 2:
                System.out.println("Scissors");
                break;
        }

    }
}
