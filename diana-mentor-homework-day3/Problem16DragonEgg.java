import java.util.Random;

public class Problem16DragonEgg {
    public static void main(String[] args) {

        Random rand = new Random();

        int chance = rand.nextInt(0, 101);

        if (chance <= 5) {
            System.out.println("Dragon Hatches");
        } else {
            System.out.println("Egg is quiet!");
        }

    }
}
