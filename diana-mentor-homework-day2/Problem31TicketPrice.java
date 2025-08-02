public class Problem31TicketPrice {
    public static void main(String[] args) {

        int age = 34;

        if (age < 12) {
            System.out.println("Child - FREE Entrance");
        }
        if (age >= 12 && age <= 59) {
            System.out.println("Adult - $25");
        }
        if (age > 60) {
            System.out.println("Senior - $15");
        }
        if (age < 0 ) {
            System.out.println("Invalid Age");
        }

    }
}

