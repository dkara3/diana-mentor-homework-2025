import java.util.Random;

public class Problem24DuplicateRremover {
    public static void main(String[] args) {

        Random rand = new Random();
        char firstChar =  (char)(rand.nextInt(97, 123));
        char secondChar = (char)(rand.nextInt(97, 123));

        if (firstChar == secondChar) {
            System.out.println(firstChar);
        } else  {
            System.out.println(firstChar + "" + secondChar);
        }

    }
}
