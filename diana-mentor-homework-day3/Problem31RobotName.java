import java.util.Random;

public class Problem31RobotName {
    public static void main(String[] args) {

        Random rand = new Random();

        char letter1 = (char) rand.nextInt(65, 91);
        char letter2 = (char) rand.nextInt(65, 91);
        int letter3 = rand.nextInt(0, 10);
        char letter4 = (char) rand.nextInt(65, 91);

        System.out.println(letter1 + "" + letter2 + "-" + letter3 + letter4);

    }
}
