public class Problem34ThreeInOrder {
    public static void main(String[] args) {

        int x = -1;
        int y = 3;
        int z = 77;

        if (x > y && x > z) {
            System.out.println(x);
            if (y > z) {
                System.out.println(y);
                System.out.println(z);
            }
            if (z > y) {
                System.out.println(z);
                System.out.println(y);
            }
        }
        if (y > x && y > z) {
            System.out.println(y);
            if (z > x) {
                System.out.println(z);
                System.out.println(x);
            }
            if (x > z) {
                System.out.println(x);
                System.out.println(z);
            }
        }
        if (z > x && z > y) {
            System.out.println(z);
            if (x > y) {
                System.out.println(x);
                System.out.println(y);
            }
            if (y > x) {
                System.out.println(y);
                System.out.println(x);
            }
        }
    }

}
