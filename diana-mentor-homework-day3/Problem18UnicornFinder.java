import java.util.Random;

public class Problem18UnicornFinder {
    public static void main(String[] args) {

        Random rand = new Random();

        int chance = rand.nextInt(0, 1001);

        if (chance == 777) {
            System.out.println("Unicorn Found!");
        } else {
            System.out.println("Voldemort got to it first.");
        }

    }
}
