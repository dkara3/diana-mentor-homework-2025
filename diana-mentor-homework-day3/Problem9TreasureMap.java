import java.util.Random;

public class Problem9TreasureMap {
    public static void main(String[] args) {

        Random rand = new Random();

        int row = rand.nextInt(0, 6);

        if (row == 3) {
            System.out.println("X Marks the spot");
        } else {
            System.out.println("Keep walking loser");
        }

    }
}
