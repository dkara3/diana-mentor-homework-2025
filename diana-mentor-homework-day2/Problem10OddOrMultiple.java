public class Problem10OddOrMultiple {
    public static void main(String[] args) {

        int number = 6;

        if (number % 2 == 1 || number % 5 == 0) {
            System.out.println("Special Number");
        } else {
            System.out.println("Not a special number");
        }

    }
}
