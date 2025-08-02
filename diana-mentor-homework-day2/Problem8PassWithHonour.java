public class Problem8PassWithHonour {
    public static void main(String[] args) {

        double mark = 89.99999999; //marks are sometimes in decimals

        if (mark >= 90 && mark <= 100) {
            System.out.println("Honour Roll");
        } else if (mark >= 60 && mark < 90) {
            System.out.println("Pass");
        } else if (mark >= 0 && mark < 60) {
            System.out.println("Fail");
        } else {
            System.out.println("Please insert a number between 0-100.");
        }

    }
}
