import java.util.Random;

public class Problem7RobotMoodLight {
    public static void main(String[] args) {

        Random rand = new Random();

        int red = rand.nextInt(0, 256);
        int green = rand.nextInt(0, 256);
        int blue = rand.nextInt(0, 256);

        if (red >= 200 && blue >= 200 && green <= 200) {
            System.out.println("Magenta Robot");
        } else {
            System.out.println("Regular Boring Robot");
        }

    }
}
