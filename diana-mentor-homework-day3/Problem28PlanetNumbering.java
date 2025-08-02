import java.util.Random;

public class Problem28PlanetNumbering {
    public static void main(String[] args) {

        Random rand = new Random();

        int planetNumber = rand.nextInt(0, 9);

        if (planetNumber == 3) {
            System.out.println("Earth");
        } else {
            System.out.println("Planet #X");
        }

    }
}
