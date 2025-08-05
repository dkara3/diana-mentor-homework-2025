import java.util.Random;

public class Problem29WeatherOracle {
    public static void main(String[] args) {

        Random rand = new Random();

        int temp = rand.nextInt();
        int labelNum = rand.nextInt(0, 4);
        String labelWord = "";

        if (labelNum <= 0) {
            labelWord = "Freezing";
        } else if (labelNum <= 10) {
            labelWord = "Cold";
        } else if (labelNum <= 25) {
            labelWord = "Warm";
        } else if (labelNum > 25) {
            labelWord = "Hot";
        }

        System.out.println("" + labelNum + "°C - " + labelWord);

    }
}
