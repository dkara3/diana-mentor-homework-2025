import java.util.Random;

public class Problem19CoockieQuality {
    public static void main(String[] args) {

        Random rand = new Random();

        int crispiness = rand.nextInt(0, 11);

        if (crispiness <= 4) {
            System.out.println("Too Soft");
        } else if (crispiness > 4 && crispiness <= 6) {
            System.out.println("Perfff");
        } else if (crispiness > 6 && crispiness <= 10) {
            System.out.println("Too Hard");
        }

    }
}
