public class Problem47RGBtoGrey {
    public static void main(String[] args) {

        int r = 120;
        int g = 200;
        int b = 90;

        int gray = (r + g + b) / 3;

        System.out.println("rgb (" + r + "," + g + "," + b + ") -> " + gray);

    }
}
