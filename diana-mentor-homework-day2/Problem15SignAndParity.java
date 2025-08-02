public class Problem15SignAndParity {
    public static void main(String[] args) {

        int number = 22;

        if (number % 2 == 0 && number > 0) {
            System.out.println("Even + Positive");
        }
        if (number % 2 == 0 && number < 0) {
            System.out.println("Even + Negative");
        }
        if (number % 2 == 1 && number > 0) {
            System.out.println("Odd + Positive");
        }
        if (number % 2 == 1 && number < 0) {
            System.out.println("Odd + Negative");

        }
    }
}
