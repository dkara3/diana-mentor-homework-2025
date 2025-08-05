import java.util.Random;

public class Problem49IdealRoomTemp {
    public static void main(String[] args) {

        Random rand = new Random();

        double tempC = 23.5;
        boolean isSummer = rand.nextBoolean();

        if (tempC >= 22 && tempC <= 28 && isSummer == true) {
            System.out.println("AC ON");
        } else if (tempC >= 20 && tempC <= 24 && isSummer == false) {
            System.out.println("AC ON");
        } else {
            System.out.println("AC OFF");
        }

    }
}
