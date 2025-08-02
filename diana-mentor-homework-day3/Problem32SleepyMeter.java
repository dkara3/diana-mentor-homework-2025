import java.util.Random;

public class Problem32SleepyMeter {
    public static void main(String[] args) {

        Random rand = new Random();

        int hourSlept = rand.nextInt(0, 13) + 1;

        if (hourSlept >= 0 && hourSlept <= 5) {
            System.out.println("Zombie Mode");
        }
        if (hourSlept >= 5 && hourSlept <= 8) {
            System.out.println("Okay");
        }
        if (hourSlept >= 8 && hourSlept <= 12) {
            System.out.println("Supercharged");
        }

    }
}
