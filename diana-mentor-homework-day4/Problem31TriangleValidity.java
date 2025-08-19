import java.util.Random;

public class Problem31TriangleValidity {
    public static void main(String[] args) {

        Random rand = new Random();

        int a = rand.nextInt(0, 100);
        int b = rand.nextInt(0, 100);
        int c = rand.nextInt(0, 100);

        System.out.println("" + a + ", " + b + ", " + c);

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid..");
        }

    }
}