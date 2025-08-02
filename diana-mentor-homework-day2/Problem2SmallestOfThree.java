public class Problem2SmallestOfThree {
    public static void main(String[] args) {

        int a = -662;
        int b = 1;
        int c = -8;

        if ((a < b) && (a < c)) {
            System.out.println(a);
        } else if ((b < a) && (b < c)) {
            System.out.println(b);
        } else if ((c < a) && (c < b)) {
            System.out.println(c);
        }


    }

}
