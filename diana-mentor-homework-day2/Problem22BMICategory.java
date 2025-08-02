public class Problem22BMICategory {
    public static void main(String[] args) {

        double bmi = 18.5;

        if (bmi < 18.5) {
            System.out.println("Under");
        }
        if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal");
        }
        if (bmi >= 25) {
            System.out.println("Over");
        }

    }
}
