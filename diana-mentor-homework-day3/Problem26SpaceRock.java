import java.util.Random;

public class Problem26SpaceRock {
    public static void main(String[] args) {

        Random rand = new Random();

        int mass = rand.nextInt(0, 100) + 1;

        if (mass % 3 == 0 && mass % 5 != 0) {
            System.out.println("Iron");
        } else if (mass % 5 == 0 && mass % 3 != 0) {
            System.out.println("Gold");
        } else if (mass % 3 == 0 && mass % 5 == 0) {
            System.out.println("Platnum");
        } else {
            System.out.println("Meh rock");
        }

    }
}
