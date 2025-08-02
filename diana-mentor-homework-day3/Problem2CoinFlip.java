import java.util.Random;

public class Problem2CoinFlip {
    public static void main(String[] args) {

        Random random = new Random();

        boolean heads = random.nextBoolean();

        if (heads == true) {
            System.out.println("Woo-Hoo");
        } else {
            System.out.println("Darn!");
        }

    }
}
