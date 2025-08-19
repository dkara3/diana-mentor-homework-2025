public class Problem7FirstEqualLast {
    public static void main(String[] args) {

        String word = "Level";

        if (word.toLowerCase().charAt(0) == word.toLowerCase().charAt(word.length()-1)) {
            System.out.println("Same!");
        } else {
            System.out.println("Different!");
        }

    }
}
