import java.util.Random;

public class Problem26LuckySeven {
    public static void main(String[] args) {

        Random rand = new Random();

        int dice1 = rand.nextInt(0, 6) + 1;
        int dice2 = rand.nextInt(0, 6) + 1;

        int diceTotal = dice1 + dice2;

        switch (diceTotal) {
            case 7:
                System.out.println("Lucky! You rolled a 7!");
                break;
            default:
                System.out.println("You rolled a " + diceTotal);
        }

    }
}
