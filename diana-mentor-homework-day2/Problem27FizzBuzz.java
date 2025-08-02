public class Problem27FizzBuzz {
    public static void main(String[] args) {

        int number = 33;

        if (number % 4 == 0) {
            System.out.println("Fizz");
        }
        if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("FizzBuzz");
        }

    }
}
