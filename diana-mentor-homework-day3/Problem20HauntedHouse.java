import java.util.Random;

public class Problem20HauntedHouse {
    public static void main(String[] args) {

        Random rand = new Random();

        int door = rand.nextInt(1, 4);

        if (door == 1) {
            System.out.println("Ghost");
        }
        if (door == 2) {
            System.out.println("Candy");
        }
        if (door == 3) {
            System.out.println("Good WIll Hunting");
        }

    }
}
