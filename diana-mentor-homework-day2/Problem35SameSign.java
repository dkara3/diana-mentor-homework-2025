public class Problem35SameSign {
    public static void main(String[] args) {

        int num1 = 22;
        int num2 = -22;

        if ((num1 > 0 && num2 > 0) || (num1 < 0 && num2 < 0)) {
            System.out.println("Same Sign");
        } else {
            System.out.println("Different Sign");
        }

    }
}
