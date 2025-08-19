import java.util.Random;

public class Problem19SimpleCaptcha {
    public static void main(String[] args) {

        Random rand = new Random();
        int firstDigit = rand.nextInt(10);
        int secondDigit = rand.nextInt(10);

        String captcha = (String.valueOf(firstDigit) + String.valueOf(secondDigit));

        System.out.println("Captcha: " + captcha);

    }
}
