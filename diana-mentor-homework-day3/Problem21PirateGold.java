import java.util.Random;

public class Problem21PirateGold {
    public static void main(String[] args) {

        Random rand = new Random();

        int coins = rand.nextInt(0, 100);

        if (coins > 50 || coins % 13 == 0) {
            System.out.println("Yarr, rich!!");
        } else {
            System.out.println("Steal from Peter Pan");
        }

    }
}
