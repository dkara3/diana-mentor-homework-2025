import java.util.Random;

public class Problem9LeapYearLite {
    public static void main(String[] args) {

        Random rand = new Random();

        int year = rand.nextInt(0, 2025);

        switch (year % 4) {
            case 0:
                System.out.println("Leap Year");
                break;
            default:
                System.out.println("Not a Leap Year");
        }

    }
}
