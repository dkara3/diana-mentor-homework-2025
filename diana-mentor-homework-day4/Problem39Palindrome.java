import java.util.Random;

public class Problem39Palindrome {
    public static void main(String[] args) {

        Random rand = new Random();

        int num = rand.nextInt(100, 1000);
        int numOnes = num % 100 % 10;
        int numHundreds = num / 100 % 10;

        if (numHundreds == numOnes) {
            System.out.println("" + num + " is a palindrome");
        } else {
            System.out.println("" + num + " is not a palindrome");
        }

//        System.out.println("" + num + " " + numHundreds + " " + numOnes);

    }
}
