import java.util.Random;

public class Problem3MysteryNoise {
    public static void main(String[] args) {

        Random rand = new Random();

        int noise = rand.nextInt(-1, 4);

        System.out.println(noise);

        if (noise == 0) {
            System.out.println("Woof!");
        }
        if (noise == 1) {
            System.out.println("Meow!");
        }
        if (noise == 2) {
            System.out.println("Moo!");
        }
        if (noise == 3) {
            System.out.println("Quack!");
        }


    }
}
