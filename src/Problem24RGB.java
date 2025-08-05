import java.util.Random;

public class Problem24RGB {
    public static void main(String[] args) {

        Random rand = new Random();

        int R = rand.nextInt(0, 256);
        int G = rand.nextInt(0, 256);
        int B = rand.nextInt(0, 256);

        System.out.println("rgb (" + R + "," + G + "," + B + ")");

    }
}
