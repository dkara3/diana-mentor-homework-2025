import java.util.Random;

public class Problem30DiceParity {
    public static void main(String[] args) {

        Random rand = new Random();

        int die = rand.nextInt(0,6) + 1;

        if (die % 2 == 0) {
            System.out.println(die + " (even)");
        } else {
            System.out.println(die + " (odd)");
        }

    }
}
