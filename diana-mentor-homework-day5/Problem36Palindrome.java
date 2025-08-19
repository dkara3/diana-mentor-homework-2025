public class Problem36Palindrome {
    public static void main(String[] args) {

        String word = "lol";

        if (word.charAt(0) == word.charAt(2)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
