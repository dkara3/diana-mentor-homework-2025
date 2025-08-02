import java.util.Random;

public class Problem48TreasureTrap {
    public static void main(String[] args) {

        Random rand = new Random();

        int trap =  rand.nextInt(0, 10);

        if (trap == 4 || trap == 7) {
            System.out.println("Trap sprung!");
        } else {
            System.out.println("Trap avoided.");
        }

    }
}
