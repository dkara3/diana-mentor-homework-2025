import java.util.Random;

public class Problem50RandomGreeting {
    public static void main(String[] args) {

        Random random = new Random();

        int rand = random.nextInt(3);

        switch (rand) {
            case 0:
                System.out.println("Hi");
                break;
            case 1:
                System.out.println("Hey");
                break;
            case 2:
                System.out.println("Hello");
                break;
        }

    }
}
