public class Problem27SafeSubstring {
    public static void main(String[] args) {

        String word = "onomatopoeia";

        if (word.length() < 5) {
            System.out.println(word);
        } else {
            System.out.println(word.substring(0, 5));
        }

    }
}
