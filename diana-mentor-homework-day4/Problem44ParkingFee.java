import java.util.Random;

public class Problem44ParkingFee {
    public static void main(String[] args) {

        Random rand = new Random();

        int hours = rand.nextInt(0, 4) + 1;

        System.out.println("Hours: " + hours);

        switch (hours) {
            case 1:
                System.out.println("Parking Fee = 500 AMD");
                break;
            case 2:
                System.out.println("Parking Fee = 900 AMD");
                break;
            case 3:
                System.out.println("Parking Fee = 1200 AMD");
                break;
            case 4:
                System.out.println("Parking Fee = 1500 AMD");
                break;

        }


    }
}
