import java.util.Random;

public class Problem17ZombieDiceDuel {
    public static void main(String[] args) {

        Random rand = new Random();

        int dice1 = rand.nextInt(0, 6) + 1;
        int dice2 = rand.nextInt(0, 6) + 1;

        if (dice1 == dice2 && dice1 == 6) {
            System.out.println("Zombie Wins");
        } else {
            System.out.println("Negan Smith saves you");
        }

    }
}
