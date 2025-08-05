import java.util.Random;

public class Problem20SimpleCalculator {
    public static void main(String[] args) {

        Random rand = new Random();

        double x = rand.nextInt();
        double y = rand.nextInt();
        char op = '*';
        double z;

        switch (op) {
            case '*':
                z = x * y;
                break;
            case '+':
                z = x + y;
                break;
            case '-':
                z = x - y;
                break;
            case '/':
                z = x / y;
                break;
            default:
                z = 0;
                break;

        }
        System.out.println(z);


    }
}
