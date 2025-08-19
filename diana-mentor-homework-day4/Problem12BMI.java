import java.util.Random;

public class Problem12BMI {
    public static void main(String[] args) {

        Random rand = new Random();

        float weight = rand.nextFloat(0, 500);
        float height = rand.nextFloat(0, 500);
        float bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal");
        } else if (bmi >= 25 && bmi < 40) {
            System.out.println("Overweight");
        } else if (bmi >= 40) {
            System.out.println("Obese");
        }


    }
}
