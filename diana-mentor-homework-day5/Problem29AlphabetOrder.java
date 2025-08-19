public class Problem29AlphabetOrder {
    public static void main(String[] args) {

        String firstLetter = "h";
        String secondLetter = "b";

        if (firstLetter.compareToIgnoreCase(secondLetter) == 0) {
            System.out.println("Same Letter");
        }
        if (firstLetter.compareToIgnoreCase(secondLetter) < 0) {
            System.out.println(firstLetter + " " + secondLetter);
        }
        if (firstLetter.compareToIgnoreCase(secondLetter) > 0) {
            System.out.println(secondLetter + " " + firstLetter);
        }

    }
}
