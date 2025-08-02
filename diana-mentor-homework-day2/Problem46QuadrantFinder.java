public class Problem46QuadrantFinder {
    public static void main(String[] args) {

        int x = 3;
        int y = -2;

        if (x > 0 && y > 0) {
            System.out.println("Q1");
        }
        if (x > 0 && y < 0) {
            System.out.println("Q2");
        }
        if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
        if (x < 0 && y > 0) {
            System.out.println("Q4");
        }
    }
}
