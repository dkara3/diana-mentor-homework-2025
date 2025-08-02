public class Problem13CharIsVowel {
    public static void main(String[] args) {

        char c = 'A';

        if ((c == 'a' || c == 'A') || (c == 'e' || c == 'E') || (c == 'i' || c == 'I') || (c == 'o' || c == 'O') || (c == 'u' || c == 'U')) {
            System.out.println("This character is a vowel");
        } else {
            System.out.println("The characters are not vowels");
        }

    }
}
