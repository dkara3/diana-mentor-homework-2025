import java.util.Random;

public class Problem18RomanNumerals {
    public static void main(String[] args) {

        Random rand = new Random();

        int roman = rand.nextInt(1, 6);

        switch (roman) {
            case 1:
                System.out.println(roman + " is I");
                break;
            case 2:
                System.out.println(roman + " is II");
                break;
            case 3:
                System.out.println(roman + " is III");
                break;
            case 4:
                System.out.println(roman + " is IV");
                break;
            case 5:
                System.out.println(roman + " is V");
                break;

        }

    }
}
