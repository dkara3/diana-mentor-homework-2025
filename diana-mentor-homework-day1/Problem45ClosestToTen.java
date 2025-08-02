public class Problem45ClosestToTen {
    public static void main(String[] args) {

        int a = 9;
        int b = 12;

        int c = 10 - a;
        int d = 10 - b;

        if (c < d) {
            System.out.println(a);
        } else if (c > d) {
            System.out.println(b);
        }

    }
}
 // not working for some reason