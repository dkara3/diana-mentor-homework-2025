import java.util.Random;

public class Problem11LetterGrade {
    public static void main(String[] args) {

        Random rand = new Random();

        int grade = rand.nextInt(0, 100) + 1;

        if (grade >= 0 && grade <= 20) {
            System.out.println("F");
        } else if (grade >= 20 && grade < 40) {
            System.out.println("D");
        } else if (grade >= 40 && grade < 60) {
            System.out.println("C");
        } else if (grade >= 60 && grade < 80) {
            System.out.println("B");
        } else if (grade >= 80 && grade <= 100) {
            System.out.println("A");
        }

    }
}
