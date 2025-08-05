import java.util.Random;

public class Problem32QuadrantLocator {
    public static void main(String[] args) {

        Random rand = new Random();

        int x = rand.nextInt();
        int y = rand.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("(" + x + "," + y + ") -> " + "Q1");
        }
        if (x > 0 && y < 0) {
            System.out.println("(" + x + "," + y + ") -> " + "Q2");
        }
        if (x < 0 && y < 0) {
            System.out.println("(" + x + "," + y + ") -> " + "Q3");
        }
        if (x < 0 && y > 0) {
            System.out.println("(" + x + "," + y + ") -> " + "Q4");
        }
        if (x < 0 && y < 0) {
        }
        if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (x == 0) {
            System.out.println("(" + x + "," + y + ") -> " + "X-Axis");
        } else if (y == 0) {
            System.out.println("(" + x + "," + y + ") -> " + "Y-Axis");
        }

    }
}