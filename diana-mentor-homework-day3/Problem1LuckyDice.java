import java.util.Random;

public class Problem1LuckyDice {
    public static void main(String[] args) {

        Random roll = new Random();

        int dice = roll.nextInt(0, 6) + 1;

        if (dice == 6) {
            System.out.println("Lucky!");
        } else {
            System.out.println(dice);
        }

    }
}
