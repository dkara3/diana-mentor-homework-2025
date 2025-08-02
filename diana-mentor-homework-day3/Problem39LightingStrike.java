import java.util.Random;

public class Problem39LightingStrike {
    public static void main(String[] args) {

        Random rand = new Random();

        int chance = rand.nextInt(0, 100);

        if (chance < 2) {
            System.out.println("Zap!");
        } else {
            System.out.println("Clear.");
        }

    }
}
