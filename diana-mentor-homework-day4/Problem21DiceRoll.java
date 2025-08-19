import java.util.Random;

public class Problem21DiceRoll {
    public static void main(String[] args) {

        Random rand = new Random();

        int dice = rand.nextInt(0,6) + 1;

        System.out.println(dice);

    }
}
