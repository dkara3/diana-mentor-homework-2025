public class Problem49IntegerOverflow {
    public static void main(String[] args) {

        int a = 94921132;
        int b = 922442234;

        if (a + b > Integer.MAX_VALUE) {
            System.out.println("Overflow!");
        } else {
            System.out.println("Not quite there yet");
        }

    }
}
