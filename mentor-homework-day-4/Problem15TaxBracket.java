import java.util.Random;

public class Problem15TaxBracket {
    public static void main(String[] args) {

        double taxInc = 30000;

        if (taxInc < 30000) {
            System.out.println("Lower");
        } else if (taxInc < 75000) {
            System.out.println("Middle");
        } else if (taxInc < 100000) {
            System.out.println("Upper");
        } else if (taxInc > 100000) {
            System.out.println("High");
        }

    }
}
