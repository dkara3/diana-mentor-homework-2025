import java.util.Random;

public class Problem6WeatherSpinner {
    public static void main(String[] args) {

        Random rand = new Random();

        int weather = rand.nextInt(0, 4);

        if (weather == 0) {
            System.out.println("Sunny");
        } else if (weather == 1) {
            System.out.println("Rainy");
        } else if (weather == 2) {
            System.out.println("Snowy");
            if (weather == 2) {
                System.out.println("Dramatic reinactment of Frozen's \"Do you wanna build a snowman?\" song.");
            }
        } else if (weather == 3) {
            System.out.println("Windy");
        }

    }
}
