import java.util.Random;

public class Problem28CardPicker {
    public static void main(String[] args) {

        Random rand = new Random();

        int cardNum = rand.nextInt(0, 12) + 1;
        int cardType = rand.nextInt(0, 3) + 1;

        String rank = "";
        String suit = "";

        switch (cardNum) {
            case 1:
                rank = "A";
                break;
            case 2:
                rank = "2";
                break;
            case 3:
                rank = "3";
                break;
            case 4:
                rank = "4";
                break;
            case 5:
                rank = "5";
                break;
            case 6:
                rank = "6";
                break;
            case 7:
                rank = "7";
                break;
            case 8:
                rank = "8";
                break;
            case 9:
                rank = "9";
                break;
            case 10:
                rank = "10";
            case 11:
                rank = "J";
                break;
            case 12:
                rank = "Q";
                break;
            case 13:
                rank = "K";
                break;
        }

        switch (cardType) {
            case 1:
                suit = "♣";
                break;
            case 2:
                suit = "♦";
                break;
            case 3:
                suit = "♥";
                break;
            case 4:
                suit = "♠";

        }

        System.out.println("" + rank + suit);

    }
}
