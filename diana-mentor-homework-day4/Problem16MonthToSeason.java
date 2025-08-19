import java.util.Random;

public class Problem16MonthToSeason {
    public static void main(String[] args) {

        Random rand = new Random();

        int month = rand.nextInt(0, 12) + 1;

        switch (month) {
            case 1:
                System.out.print("Jan - winter");
                break;
            case 2:
                System.out.print("Feb - winter");
                break;
            case 3:
                System.out.print("Mar - spring");
                break;
            case 4:
                System.out.print("Apr - spring");
                break;
            case 5:
                System.out.print("May - spring");
                break;
            case 6:
                System.out.print("Jun - summer");
                break;
            case 7:
                System.out.print("Jul - summer");
                break;
            case 8:
                System.out.print("Aug - summer");
                break;
            case 9:
                System.out.println("Sep - fall");
                break;
            case 10:
                System.out.print("Oct - fall");
                break;
            case 11:
                System.out.print("Nov - fall");
                break;
            case 12:
                System.out.print("Dec - winter");
                break;

        }

    }
}
