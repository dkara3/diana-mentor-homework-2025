import java.util.Random;

public class Problem22MartianWeather {
    public static void main(String[] args) {

        Random rand = new Random();

        int temp = rand.nextInt(-60, 20);

        if (temp < -30) {
            System.out.println("Wear heater suit");
        } else {
            System.out.println("Standard Suit");
        }

    }
}
