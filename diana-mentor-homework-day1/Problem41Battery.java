public class Problem41Battery {
    public static void main(String[] args) {

        int battery = 3;

        if (battery <= 15) {
            System.out.println("Red");
        } else if (battery <= 50) {
            System.out.println("Orange");
        } else if (battery <= 100) {
            System.out.println("Green");
        }

    }
}