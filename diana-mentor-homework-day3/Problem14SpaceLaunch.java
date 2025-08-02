import java.util.Random;

public class Problem14SpaceLaunch {
    public static void main(String[] args) {

        Random rand = new Random();

        int minute = rand.nextInt(0, 60);

        if (minute >= 15) {
            System.out.println("One small step for man, giant leap for mankind!)!");
        } else {
            System.out.println("Send the dogs instead!");
        }

    }
}
