public class Problem45EqualityOfThree {
    public static void main(String[] args) {

        int a = 3;
        int b = 3;
        int c = 2;

        if (a == b && b == c) {
            System.out.println("All Equal");
        }
        if (a != b && b != c && c != a) {
            System.out.println("All Different!)");
        }
        if ((a == b && a != c) || (b == c && b != a) | (c == a && a != b)) {
            System.out.println("2 same!)");
        }

    }
}
