public class Problem6ValidTriangle {
    public static void main(String[] args) {

        int a = 40;
        int b = 90;
        int c = 90;

        if ((a > 0) && (b > 0) && (c > 0)) {
            System.out.println("All sides are positive,");
        }
        if (((c > a) && (c > b) && (a + b > c)) || ((a > c) && (a > b) && (c + b > a)) || ((b > a) && (b > c) && (c + b > b))) {
            System.out.println("and triangle satisfies triangle inequality - Valid Triangle");
        } else {
            System.out.println("however due to triangle inequaliry, it is not a valid trianlge.");
        }

    }
}
