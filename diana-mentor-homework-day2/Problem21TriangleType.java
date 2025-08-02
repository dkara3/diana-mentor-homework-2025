public class Problem21TriangleType {
    public static void main(String[] args) {

        int a = 40;
        int b = 40;
        int c = 40;

        if (c == a && a == b) {
            System.out.println("Equilateral");
        }
        else if (a == b && a != c || b == c && b != a || c == a && c != b) {
            System.out.println("Isosceles");
        }
        else if (a != b && a != c && b!=c) {
            System.out.println("Scalene");
        }

    }
}