import java.util.Random;

public class Problem5AlienColour {
    public static void main(String[] args) {

        Random rand = new Random();

        int colour = rand.nextInt(0, 3);

        if (colour == 0) {
            System.out.println("Green");
        } else if (colour == 1) {
            System.out.println("Purple");
        } else if (colour == 2) {
            System.out.println("Blue - rare alien!");
        }

    }
}
