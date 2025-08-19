import java.util.Random;

public class Problem41RandomLetter {
    public static void main(String[] args) {

        Random rand = new Random();

        char randChar = (char) ('a' + rand.nextInt(26));

        System.out.println(randChar);

    }
}
