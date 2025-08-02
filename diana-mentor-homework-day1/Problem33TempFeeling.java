public class Problem33TempFeeling {
    public static void main(String[] args) {

        int number = 55;

        if (number < 0) {
            System.out.println("Very Cold");
        }
        if (number >= 0 && number <= 15) {
            System.out.println("Cold");
        }
        if (number >= 15 && number <= 25) {
            System.out.println("Warm");
        }
        if (number >= 25) {
            System.out.println("Hot");
        }
    }
}