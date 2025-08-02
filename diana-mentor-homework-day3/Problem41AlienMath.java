import java.util.Random;

public class Problem41AlienMath {
    public static void main(String[] args) {

        Random rand = new Random();

        int a =  rand.nextInt(0,11);
        int b = rand.nextInt(0, 11);
        int c = a + b;
                ;
        if (c % 2 == 0 ) {
            System.out.println("Alien Correct");
        } else {
            System.out.println("Alien Wrong");
        }

    }
}
