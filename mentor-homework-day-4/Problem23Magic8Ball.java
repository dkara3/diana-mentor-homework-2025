import java.util.Random;

public class Problem23Magic8Ball {
    public static void main(String[] args) {

        Random rand = new Random();

        int ball = rand.nextInt(0, 7);

        switch (ball) {
            case 0:
                System.out.println("Yes");
                break;
            case 1:
                System.out.println("No");
                break;
            case 2:
                System.out.println("Uhh");
                break;
            case 3:
                System.out.println("Not in this lifetime");
                break;
            case 4:
                System.out.println("LOL, yeah, right.");
                break;
            case 5:
                System.out.println("I'm too tired for this, get out.");
                break;
            case 6:
                System.out.println("Surprisingly, yes.");
                break;

        }

    }
}
