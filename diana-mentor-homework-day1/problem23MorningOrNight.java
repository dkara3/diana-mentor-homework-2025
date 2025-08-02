public class problem23MorningOrNight {
    public static void main(String[] args) {

        byte number = 12;

        if (number < 12) {
            System.out.println("Good Morning");
        }
        if (number < 18 && number >= 12) {
            System.out.println("Good Afternoon");
        }
        if (number < 24 && number >= 18) {
            System.out.println("Good night");
        }

    }
}
