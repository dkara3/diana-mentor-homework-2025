public class Problem36EnergyBar {
    public static void main(String[] args) {

        int battery = 34;

        if (battery < 20) {
            System.out.println("Red");
        }
        if (battery >= 20 && battery <= 60) {
            System.out.println("Yellow");
        }
        if (battery > 60) {
            System.out.println("Green");
        }
        if (battery < 0) {
            System.out.println("Dead");
        }

    }
}