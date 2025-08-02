import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Problem37DinosaurRoar {
    public static void main(String[] args) {

        Random rand = new Random();

        int dB = rand.nextInt(50, 120);

        if (dB >= 100) {
            System.out.println("T-Rex");
        } else {
            System.out.println("Raptor");
        }

    }
}
