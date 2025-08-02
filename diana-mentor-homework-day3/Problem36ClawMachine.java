import java.util.Random;

public class Problem36ClawMachine {
    public static void main(String[] args) {

        Random rand = new Random();

        int pow = rand.nextInt(0, 5);

        if (pow == 0) {
            System.out.println("Awe, darn it.");
        }
        if (pow == 1) {
            System.out.println("Oh, okay.");
        }
        if (pow == 2) {
            System.out.println("Yess.");
        }
        if (pow == 3) {
            System.out.println("Omg cool!");
        }
        if (pow == 4) {
            System.out.println("YES! JACKPOT.");
        }

    }
}
