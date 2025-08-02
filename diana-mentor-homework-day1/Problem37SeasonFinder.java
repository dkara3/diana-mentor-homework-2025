public class Problem37SeasonFinder {
    public static void main(String[] args) {

        int month = 3;

        if (month <= 2 || month == 1) {
            System.out.println("Winter");
        }
        if (month <= 5 && month > 2) {
            System.out.println("Spring");
        }
        if (month <= 8 && month > 5) {
            System.out.println("Summer");
        }
        if (month <= 10 && month > 8) {
            System.out.println("Fall");
        }

    }
}
