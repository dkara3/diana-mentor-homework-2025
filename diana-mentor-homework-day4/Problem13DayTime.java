import java.util.Random;

public class Problem13DayTime {
    public static void main(String[] args) {

        Random rand = new Random();

        int hour = rand.nextInt(0, 24);

        if (hour < 12) {
            System.out.println("Morning");
        } else if (hour < 18) {
            System.out.println("Afternoon");
        } else if (hour < 21) {
            System.out.println("Evening");
        } else {
            System.out.println("Night");
        }

    }
}
