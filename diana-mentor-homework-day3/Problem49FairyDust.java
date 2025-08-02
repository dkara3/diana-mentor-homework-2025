import java.util.Random;

public class Problem49FairyDust {
    public static void main(String[] args) {

        Random rand = new Random();

        int sparkles = rand.nextInt(0, 51);

        if (sparkles % 2 == 0 && sparkles % 5 == 0) {
            System.out.println("Sparkle Storm!");
        } else {
            System.out.println("Try again.");
        }

    }
}
