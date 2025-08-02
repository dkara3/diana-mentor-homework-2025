import java.util.Random;

public class Problem13MonsterSize {
    public static void main(String[] args) {

        Random rand = new Random();

        int size = rand.nextInt(50, 301);

        if (size >= 50 && size <= 100) {
            System.out.println("Tiny!");
        }
        if (size >= 100 && size <= 200) {
            System.out.println("Medium!");
        }
        if (size >= 200) {
            System.out.println("Giant!");
        }

    }
}
