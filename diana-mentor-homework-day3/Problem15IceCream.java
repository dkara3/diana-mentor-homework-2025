import java.util.Random;

public class Problem15IceCream {
    public static void main(String[] args) {

        Random rand = new Random();

        int flavour = rand.nextInt(0, 6);
        boolean scoop2 = rand.nextBoolean();

        if (flavour == 0) {
            System.out.println("Mint Choc Chip - 1 Scoop");
        }
        if (flavour == 1) {
            System.out.println("Pistacho - 1 Scoop");
        }
        if (flavour == 2) {
            System.out.println("Bubblegum - 2 Scoop");
        }
        if (flavour == 3 && scoop2 == false) {
            System.out.println("Chocolate - 1 Scoop");
            if (flavour == 3 && scoop2 == true) {
                System.out.println("Chocolate - 2 Scoop!");
            }
        }
        if (flavour == 4) {
            System.out.println("Cheesecake - 1 Scoop");
        }
        if (flavour == 5) {
            System.out.println("Caramel - 1 Scoop");
        }

    }
}
