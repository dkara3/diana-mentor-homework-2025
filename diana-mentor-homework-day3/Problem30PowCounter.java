import java.util.Random;

public class Problem30PowCounter {
    public static void main(String[] args) {

        Random rand = new Random();

        int pow = rand.nextInt(0, 11);

        if (pow == 1) {
            System.out.println("Pow.");
        }
        if (pow == 2) {
            System.out.println("Pow-pow.");
        }
        if (pow == 3) {
            System.out.println("Pow-pow-pow.");
        }
        if (pow == 4) {
            System.out.println("Pow-pow-pow-pow.");
        }
        if (pow == 5) {
            System.out.println("Pow-pow-pow-pow-pow.");
        }
        if (pow == 6) {
            System.out.println("Pow-pow-pow-pow-pow-pow.");
        }
        if (pow >= 7) {
            System.out.println("POW POW POW!");
        }

    }
}
