import java.util.Random;

public class Problem8TeenCheck {
    public static void main(String[] args) {

        Random rand = new Random();

        int age = rand.nextInt(0, 101);

        switch (age) {
            case 13 - 18:
                System.out.println("Teen!");
                break;
            default:
                System.out.println("Not a teen.");
        }

    }
}
