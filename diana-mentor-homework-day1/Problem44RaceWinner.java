public class Problem44RaceWinner {
    public static void main(String[] args) {

        int car1 = 44;
        int car2 = 55;
        int car3 = 65;

        if (car1 > car2 && car1 > car3) {
            System.out.println(car1);
            System.out.println("Winner!");
        } else if (car2 > car1 && car2 > car3) {
            System.out.println(car2);
            System.out.println("Winner!");
        } else if (car3 > car1 && car3 > car2) {
            System.out.println(car3);
            System.out.println("Winner!");
        }

    }
}