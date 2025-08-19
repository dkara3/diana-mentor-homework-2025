import java.util.Random;

public class Problem33RideEligibility {
    public static void main(String[] args) {

        Random rand = new Random();

        int age = rand.nextInt(100) + 1;
        float height = rand.nextFloat(0, 3);

        System.out.println("Age: " + age);
        System.out.println("Height: " + height);

        if (age >= 12 && height >= 1.4) {
            System.out.println("Allowed");
        } else if (age >= 12 && height < 1.4) {
            System.out.println("Sorry - Too Short");
        } else if (age < 12 && height >= 1.4) {
            System.out.println("Sorry - Too Young");
        }


    }
}
