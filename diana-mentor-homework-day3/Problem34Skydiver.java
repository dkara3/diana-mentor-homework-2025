import java.util.Random;

public class Problem34Skydiver {
    public static void main(String[] args) {

        Random rand = new Random();

        int speed = rand.nextInt(0, 41);

        if (speed >= 0 && speed <= 25) {
            System.out.println("Jump");
        } else {
            System.out.println("Don't jump, you'll burst an eardrum.");
        }

    }
}
