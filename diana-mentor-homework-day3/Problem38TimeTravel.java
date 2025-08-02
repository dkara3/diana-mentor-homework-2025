import java.util.Random;

public class Problem38TimeTravel {
    public static void main(String[] args) {

        Random rand = new Random();

        int dB = rand.nextInt(1800, 2201);

        if (dB < 2000) {
            System.out.println("Past.");
        }
        if (dB >= 2000 && dB <= 2029) {
            System.out.println("Present.");
        }
        if (dB >= 2030) {
            System.out.println("Future.");
        }

    }
}
