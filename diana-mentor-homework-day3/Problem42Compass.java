import java.util.Random;

public class Problem42Compass {
    public static void main(String[] args) {

        Random rand = new Random();

        int degree = rand.nextInt(0,360);

        if (degree <= 44 || degree >= 315) {
            System.out.println("North.");
        }
        if (degree >= 45 && degree < 135) {
            System.out.println("East.");
        }
        if (degree >= 135 && degree < 225) {
            System.out.println("South.");
        }
        if (degree >= 225 && degree < 315) {
            System.out.println("West.");
        }

    }
}
