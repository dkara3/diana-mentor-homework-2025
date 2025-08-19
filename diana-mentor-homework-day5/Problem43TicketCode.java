public class Problem43TicketCode {
    public static void main(String[] args) {

        String city = "Yerevan";
        String phone = "091262217";

        System.out.println("Ticket ID: " + city.substring(0, 3).toUpperCase() + phone.substring(6, 9));

    }
}
