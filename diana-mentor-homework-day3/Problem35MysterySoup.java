import java.util.Random;

public class Problem35MysterySoup {
    public static void main(String[] args) {

        Random rand = new Random();

        float rating = rand.nextFloat(0, 1);
        //how come float works here without needing to put "f" at the end of the number?

        if (rating > 0.8) {
            System.out.println("Delicious");
        } else if (rating >= 0.4 && rating <= 0.8) {
            System.out.println("Meh");
        } else {
            System.out.println("Yuck");
        }

    }
}
