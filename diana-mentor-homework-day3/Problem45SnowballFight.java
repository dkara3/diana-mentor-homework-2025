import java.util.Random;

public class Problem45SnowballFight {
    public static void main(String[] args) {

        Random rand = new Random();

        int hits = rand.nextInt(0,21);
        boolean chance = rand.nextBoolean();

        if (hits >= 15 && chance == true) {
            System.out.println("Champion!");
        } else {
            System.out.println("Try again.");
        }

    }
}
