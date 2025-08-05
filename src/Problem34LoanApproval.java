import java.util.Random;

public class Problem34LoanApproval {
    public static void main(String[] args) {

        Random rand = new Random();

        int credit = rand.nextInt(0,800) + 1;
        float salary = rand.nextFloat();
        String approval = "";

        if ((credit >= 700) || (credit >= 650 && salary >= 1000000)) {
            approval = "Approved";
        } else if (credit <= 700) {
            approval = "Rejected - low score";
        } else if (salary < 1000000 && credit >= 650) {
            approval = "Rejected - low salary";
        }

        System.out.println("" + credit + " -> " + approval);


    }
}
