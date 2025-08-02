public class Problem29TwoDigitEquality {
    public static void main(String[] args) {

        int n = 88;

        int lastDigit = n % 10;
        int secondLastDigit = (n / 10) % 10;

        if (lastDigit == secondLastDigit) {
            System.out.println("Double");
        } else {
            System.out.println("Not double");
        }

    }
}
