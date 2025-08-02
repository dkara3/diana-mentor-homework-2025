import java.util.Random;

public class Problem11Superhero {
    public static void main(String[] args) {

        Random rand = new Random();

        int assignment = rand.nextInt(0, 5);

        if (assignment == 0) {
            System.out.println("Fly - Sky patrol");
        }
        if (assignment == 1) {
            System.out.println("Strenght");
        }
        if (assignment == 2) {
            System.out.printf("Invisibuility");
        }
        if (assignment == 3) {
            System.out.printf("Speed");
        }
        if (assignment == 4) {
            System.out.printf("Water-Breath");
        }

    }
}
