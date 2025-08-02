import java.util.Random;

public class Problem12HaHaNumber {
    public static void main(String[] args) {

        Random rand = new Random();

        int number = rand.nextInt(0, 101);

        if (number % 11 == 0) {
            System.out.println("Ha-ha!");
        } else {
            System.out.println("Womp-womp.");
        }

    }
}
