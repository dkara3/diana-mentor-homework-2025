import java.util.Random;

public class Problem8SecretAgentCode {
    public static void main(String[] args) {

        Random rand = new Random();

        int randomNum = rand.nextInt(1000, 9999);

        if (randomNum % 7 == 0) {
            System.out.println("Ultra Secure");
        } else {
            System.out.println("Meh");
        }

    }
}
