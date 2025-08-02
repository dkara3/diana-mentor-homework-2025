import java.util.Random;

public class Problem46MagicDoor {
    public static void main(String[] args) {

        Random rand = new Random();

        char letter = (char)(rand.nextInt(65,91));

        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.println("Door opens.");
        } else {
            System.out.println("Door remains closed.");
        }

    }
}
