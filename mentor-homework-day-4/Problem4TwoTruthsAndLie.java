import java.util.Random;

public class Problem4TwoTruthsAndLie {
    public static void main(String[] args) {

        Random rand = new Random();

        boolean fact1 = rand.nextBoolean();
        boolean fact2 = rand.nextBoolean();
        boolean fact3 = rand.nextBoolean();

        System.out.println(fact1 + " " + fact2 + " " + fact3);

    }
}
