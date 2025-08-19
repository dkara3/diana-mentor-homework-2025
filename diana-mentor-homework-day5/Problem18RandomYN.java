import java.util.Random;

public class Problem18RandomYN {
    public static void main(String[] args) {

        Random rand = new Random();
        boolean random = rand.nextBoolean();

        if (random) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
