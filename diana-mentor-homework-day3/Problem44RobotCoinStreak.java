import java.util.Random;

public class Problem44RobotCoinStreak {
    public static void main(String[] args) {

        Random rand = new Random();

        boolean flip1 = rand.nextBoolean();
        boolean flip2 = rand.nextBoolean();
        boolean flip3 = rand.nextBoolean();

        if (flip1 == true && flip2 == true && flip3 == true) {
            System.out.println("Heads x3, Robot wins");
        } else if ((flip1 != true && flip2 == false && flip3 == false) || (flip1 == false && flip2 != true && flip3 == false) || (flip1 == true && flip2 == false && flip3 != true)) {
            System.out.println("Heads x2, Robot wins");
        } else {
            System.out.println("Robot looses");
        }


    }
}
