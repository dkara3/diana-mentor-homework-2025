import java.util.Random;

public class Problem22CoinFlip {
    public static void main(String[] args) {

        Random rand = new Random();

        int coin = rand.nextInt(0,2);

        switch (coin) {
            case 0:
                System.out.println("Heads");
                break;
            case 1:
                System.out.println("Tails");
                break;
        }

    }
}
