import java.util.Random;

public class Problem23RobotBattery {
    public static void main(String[] args) {

        Random rand = new Random();

        int percentage = rand.nextInt(0, 101);

        if (percentage <= 20) {
            System.out.println("Red");
        } else if (percentage >= 20 && percentage <= 60) {
            System.out.println("Yellow");
        } else if (percentage >= 60) {
            System.out.println("Green");
        }
    }
}
