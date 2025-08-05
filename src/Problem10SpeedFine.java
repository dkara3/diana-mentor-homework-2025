import java.util.Random;

public class Problem10SpeedFine {
    public static void main(String[] args) {

        Random rand = new Random();

        int speed = rand.nextInt(0, 300);

        switch (speed) {
            case 0 - 90:
                System.out.println("OK");
                break;
            default:
                System.out.println("Speeding Fine!");
        }
    }

}
