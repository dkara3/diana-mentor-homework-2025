public class Problem11SpeedCamera {
    public static void main(String[] args) {

        int speed = 77;

        if (speed < 60 && speed > 0) {
            System.out.println("OK");
        }
        if (speed > 60 && speed < 80) {
            System.out.println("Warning");
        }
        if (speed > 80) {
            System.out.println("Ticket");
        }

    }
}
