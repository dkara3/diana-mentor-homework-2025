import java.util.Random;

public class Problem14TriangleType {
    public static void main(String[] args) {

        Random rand = new Random();

        int a = rand.nextInt(0,100);
        int b = rand.nextInt(0,100);
        int c = rand.nextInt(0,100);

        System.out.println("Side 1 =" + a);
        System.out.println("Side 2 =" + b);
        System.out.println("Side 3 =" + c);

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