import java.util.Random;

public class Problem43MonsterEnergy {
    public static void main(String[] args) {

        Random rand = new Random();

        int level = rand.nextInt(0, 101);

        if (level % 10 == 0) {
            System.out.println("Level up!");
        } else {
            System.out.println("Keep playing.");
        }

    }
}
