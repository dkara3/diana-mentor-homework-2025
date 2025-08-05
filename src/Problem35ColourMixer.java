import java.util.Random;

public class Problem35ColourMixer {
    public static void main(String[] args) {

        Random rand = new Random();

        int c1 = rand.nextInt(0, 3);
        int c2 = rand.nextInt(0, 3);

        String colour1 = "";
        String colour2 = "";
        String mix = "";

        switch (c1) {
            case 0:
                colour1 = "red";
                break;
            case 1:
                colour1 = "blue";
                break;
            case 2:
                colour1 = "yellow";
                break;
        }

        switch (c2) {
            case 0:
                colour2 = "red";
                break;
            case 1:
                colour2 = "blue";
                break;
            case 2:
                colour2 = "yellow";
                break;
        }

        if (colour1 == "red" && colour2 == "blue") {
            mix = "purple";
        }
        if (colour1 == "red" && colour2 == "yellow") {
            mix = "orange";
        }
        if (colour1 == "blue" && colour2 == "yellow") {
            mix = "green";
        }
        if (colour1 == colour2) {
            mix = "same colour!";
        }
        if (colour2 == "red" && colour1 == "blue") {
            mix = "purple";
        }
        if (colour2 == "red" && colour1 == "yellow") {
            mix = "orange";
        }
        if (colour2 == "blue" && colour1 == "yellow") {
            mix = "green";
        }

        System.out.println("" + colour1 + " + " + colour2 + " -> " + mix);


    }
}
