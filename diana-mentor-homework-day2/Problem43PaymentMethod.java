public class Problem43PaymentMethod {
    public static void main(String[] args) {

        boolean cash = true;
        boolean card = true;

        if (cash == true || card == true) {
            System.out.println("Transaction Approved");
        } else {
            System.out.println("Transaction Not Approved");
        }

    }
}
