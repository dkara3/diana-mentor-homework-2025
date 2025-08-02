public class Problem28AbsoluteComparison {
    public static void main(String[] args) {

        int a = -33;
        int b = -200;
        int c = -400;
        int A = a * -1;
        int B = b * -1;
        int C = c * -1;

        System.out.println("The largest value is...");

        if (a > 0 && a > b && a > B && a > c && a > C) {
            System.out.println(a);
        }
        if (b > 0 && b > a && b > A && b > c && b > C) {
            System.out.println(b);
        }
        if (c > 0 && c > a && c > A && c > b && c > B) {
            System.out.println(c);
        }
        if (a < 0 && A > b && A > B && A > c && A > C) {
            System.out.println(A);
        }
        if (b < 0 && B > a && B > A && B > c && B > C) {
            System.out.println(B);
        }
        if (c < 0 && C > a && C > A && C > b && C > B) {
            System.out.println(C);
        }


    }
}