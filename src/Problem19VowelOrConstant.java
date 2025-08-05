import java.util.Random;

public class Problem19VowelOrConstant {
    public static void main(String[] args) {

        char letter = 'a';

        switch (letter) {
            case 'a': // could also use ascii numbers
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Constant");
                break;
        }

    }
}
