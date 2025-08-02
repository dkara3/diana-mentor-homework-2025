public class Problem20CharCase {
    public static void main(String[] args) {

        char ch = 'a';

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Upper");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower");
        } else {
            System.out.println("Invalid input");
        }
    }
}
