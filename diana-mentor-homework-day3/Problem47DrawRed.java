import java.util.Random;

public class Problem47DrawRed {
    public static void main(String[] args) {

        Random rand = new Random();

        int chance = rand.nextInt(0,101);

        if (chance < 30) {
            System.out.println(chance + " red!");
        } else {
            System.out.println("Try again.");
        }

    }
}
